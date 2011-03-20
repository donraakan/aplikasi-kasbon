package com.artivisi.aplikasi.kasbon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PembayaranbonController {
	@RequestMapping("transaksi/pembayaran/pembayaranbon")
	public ModelMap listPengajuan() {
		return new ModelMap();
	}

	@RequestMapping("transaksi/pembayaranbon/form")
	public ModelMap formPengajuan() {
		return new ModelMap();
	}

}
