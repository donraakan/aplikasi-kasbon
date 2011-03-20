package com.artivisi.aplikasi.kasbon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApprovalController {
	public ApprovalController() {
	}
@RequestMapping("transaksi/approval/approval")
public ModelMap listPegawai() {
	return new ModelMap();
}



}