package com.artivisi.aplikasi.kasbon.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class PengajuanKasbon {
	 @Id @GeneratedValue(generator="system-uuid")
  	 @GenericGenerator(name="system-uuid",strategy="uuid")
  	 private String id;
	
	 @Column (name="nilai")
	 private BigDecimal nilai;
	 
	 @Column (name="keterangan")
	 private String keterangan;
	 
	 @Column (name="approval-kasbon")
	 private boolean approve; 
	 private Date tglApprove;
	 
	 @Column (name="tanggal")
	 private String tanggal;
	 
	 @Column (name="pegawai")
	 @ManyToOne
	 private Pegawai pegawai;
	 
	 public Pegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(Pegawai pegawai) {
		this.pegawai = pegawai;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}


	public BigDecimal getNilai() {
		return nilai;
	}

	public void setNilai(BigDecimal nilai) {
		this.nilai = nilai;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}


	public boolean isApprove() {
		return approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	public Date getTglApprove() {
		return tglApprove;
	}

	public void setTglApprove(Date tglApprove) {
		this.tglApprove = tglApprove;
	}
		

	
}
