package com.artivisi.aplikasi.kasbon.service;

import java.util.List;

import org.hibernate.event.SaveOrUpdateEvent;

import com.artivisi.aplikasi.kasbon.domain.Pegawai;
import com.artivisi.aplikasi.kasbon.domain.PembayaranKasbon;
import com.artivisi.aplikasi.kasbon.domain.PengajuanKasbon;

public interface AppService {
	public void savePegawai(Pegawai pgw);

	public void deletePegawai(Pegawai pgw);

	public Pegawai findPegawaiByID(String id);

	public List<Pegawai> findAllPegawai();

	public void savePengajuanKasbon(PengajuanKasbon pKasbon);

	public PengajuanKasbon findPengajuanKasbonByID(String id);
	
	public List<PengajuanKasbon> findAllPengajuanKasbon();
	
	public List<PengajuanKasbon> findKasbonsNotYetApprove();
	
	public List<PengajuanKasbon> findKasbonApproveStatus(boolean isApprove );	
	
	public void savePembayaranKasbon (PembayaranKasbon pbKasbon);	
	
	public List<PembayaranKasbon> findKasbonPembayaranKasbons();
	
    public List<PembayaranKasbon> findAllPembayaranKasbons ();
}
