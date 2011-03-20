package com.artivisi.aplikasi.kasbon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PengajuanKasbonController {
	@RequestMapping("transaksi/pengajuan/list")
	public ModelMap listPengajuan() {
		return new ModelMap();
	}

	@RequestMapping("transaksi/pengajuan/form")
	public ModelMap formPengajuan() {
		return new ModelMap();
	}


}
