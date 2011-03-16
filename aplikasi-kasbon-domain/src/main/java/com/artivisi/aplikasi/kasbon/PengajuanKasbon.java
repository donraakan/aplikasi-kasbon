package com.artivisi.aplikasi.kasbon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class PengajuanKasbon {
	 @Id @GeneratedValue(generator="system-uuid")
  	 @GenericGenerator(name="system-uuid",strategy="uuid")
  	 private String id;
	
	
	
	

}
