package com.artivisi.aplikasi.kasbon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaporanKasbonController {
	@RequestMapping("laporan/laporankasbon")
	public ModelMap listPengajuan() {
		return new ModelMap();
	}
}
