package com.artivisi.aplikasi.kasbon.controller;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artivisi.aplikasi.kasbon.service.AppService;

@Controller 
public class PegawaiController {
	@Autowired AppService appservice;
	public PegawaiController() {
		

	}
	@RequestMapping("master/pegawai/list")
	public ModelMap listPegawai() {
		return new ModelMap().addAttribute("ListPegawai",appservice.findAllPegawai());
	}

	@RequestMapping("master/pegawai/form")
	public ModelMap formPegawai() {
		return new ModelMap();
	}


}
