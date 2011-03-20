package com.artivisi.aplikasi.kasbon.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="pembayaran_kasbon")
public class PembayaranKasbon {
	 @Id @GeneratedValue(generator="system-uuid")
  	 @GenericGenerator(name="system-uuid",strategy="uuid")
  	 private String id;
	
	 
	 @Column (name="tanggal_bayar")
	 private String tanggalBayar;
	 
	 @ManyToOne
	 private Pegawai pegawai;
	 
	 @Column (name="nilai_bayar")
	 private BigDecimal nilaiBayar;
	 
	 @Column (name="keterangan")
	 private String keterangan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTanggalBayar() {
		return tanggalBayar;
	}

	public void setTanggalBayar(String tanggalBayar) {
		this.tanggalBayar = tanggalBayar;
	}

	public Pegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(Pegawai pegawai) {
		this.pegawai = pegawai;
	}

	public BigDecimal getNilaiBayar() {
		return nilaiBayar;
	}

	public void setNilaiBayar(BigDecimal nilaiBayar) {
		this.nilaiBayar = nilaiBayar;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	
	
	
	
	
	
	
	
	

}
