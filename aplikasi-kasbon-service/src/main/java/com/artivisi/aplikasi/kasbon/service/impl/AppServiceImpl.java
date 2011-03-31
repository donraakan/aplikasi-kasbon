package com.artivisi.aplikasi.kasbon.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artivisi.aplikasi.kasbon.domain.Pegawai;
import com.artivisi.aplikasi.kasbon.domain.PembayaranKasbon;
import com.artivisi.aplikasi.kasbon.domain.PengajuanKasbon;
import com.artivisi.aplikasi.kasbon.service.AppService;

@Service("AppService")
@Transactional(readOnly=true)
public class AppServiceImpl implements AppService {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional(readOnly=false)
	public void savePegawai(Pegawai pgw) {
		sessionFactory.getCurrentSession().saveOrUpdate(pgw);
	}

	@Override	a
	@Transactional(readOnly=false)
	public void deletePegawai(Pegawai pgw) {
		sessionFactory.getCurrentSession().delete(pgw);
	}

	@Override
	public Pegawai findPegawaiByID(String id) {
		return (Pegawai) sessionFactory.getCurrentSession()
				.createQuery("from Pegawai p where p.id=id")
				.setParameter("id",id)
				.uniqueResult();
	}

	@Override
	public List<Pegawai> findAllPegawai() {
		return sessionFactory.getCurrentSession()
				.createQuery("from Pegawai p")
				.list();
		}

	@Override
	public void savePengajuanKasbon(PengajuanKasbon pKasbon) {
		sessionFactory.getCurrentSession().saveOrUpdate(pKasbon);
	}

	@Override
	public PengajuanKasbon findPengajuanKasbonByID(String id) {
		return (PengajuanKasbon) sessionFactory.getCurrentSession()
		.createQuery("from PengajuanKasbon p where p.id=id")
		.setParameter("id",id)
		.uniqueResult();
}
	

	@Override
	public List<PengajuanKasbon> findAllPengajuanKasbon() {
		return sessionFactory.getCurrentSession()
				.createQuery("from PengajuanKasbon p")
				.list();
	}

	@Override
	public List<PengajuanKasbon> findKasbonsNotYetApprove() {
		return sessionFactory.getCurrentSession()
				.createQuery("from PengajuanKasbon pk where pk.approve is null")
				.list();
		}

	@Override
	public List<PengajuanKasbon> findKasbonApproveStatus(boolean isApprove) {
		return (List<PengajuanKasbon>) sessionFactory.getCurrentSession()
				.createQuery("from PengajuanKasbon pk where pk.approve=:approve")
				.setParameter("approve",isApprove)
				.list();
	}

	@Override
	public void savePembayaranKasbon(PembayaranKasbon pbKasbon) {
		sessionFactory.getCurrentSession().saveOrUpdate(pbKasbon);
	}

	@Override
	public List<PembayaranKasbon> findKasbonPembayaranKasbons() {
		return sessionFactory.getCurrentSession()
		.createQuery("from PembayaranKasbon pk")
		.list();
	}

	@Override
	public List<PembayaranKasbon> findAllPembayaranKasbons() {
		return sessionFactory.getCurrentSession()
		.createQuery("from PembayaranKasbon pk")
		.list();
	}

}
