package com.artivisi.aplikasi.kasbon;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Saldo {
	
	 @Id @GeneratedValue(generator="system-uuid")
  	 @GenericGenerator(name="system-uuid",strategy="uuid")
  	 private String id;
	
	 
	 @Column (name="pegawai")
	 @ManyToOne
	 private Pegawai pegawai;
	 
	 @Column (name="saldo")
	 private BigDecimal saldo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(Pegawai pegawai) {
		this.pegawai = pegawai;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	

}
