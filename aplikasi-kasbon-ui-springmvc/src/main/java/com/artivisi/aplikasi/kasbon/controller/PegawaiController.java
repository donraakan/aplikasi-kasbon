package com.artivisi.aplikasi.kasbon.controller;

import javax.validation.Valid;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.artivisi.aplikasi.kasbon.domain.Pegawai;
import com.artivisi.aplikasi.kasbon.service.AppService;

@Controller 
public class PegawaiController {
	@Autowired private AppService appservice;
	public PegawaiController() {
		

	}
	@RequestMapping("master/pegawai/list")
	public ModelMap listPegawai() {
		return new ModelMap().addAttribute("ListPegawai",appservice.findAllPegawai());
	}

	@RequestMapping(value="master/pegawai/form", method=RequestMethod.GET)
	public ModelMap formPegawai(@RequestParam(value="id", required=false) String id) {
		Pegawai p = null;
		if(id==null){
			p = new Pegawai();
		} else {
			p = appservice.findPegawaiByID(id);
		}

		//setelah dapat objek pegawai maka ditambahkan ke model map
		ModelMap mm = new ModelMap();
		if(p!=null){
			mm.addAttribute(p);
		}
		return mm;

	}
	@RequestMapping(value="master/pegawai/form", method=RequestMethod.POST)
	public String process (@Valid Pegawai pegawai, BindingResult result) {
		if(result.hasErrors()){
		return "master/pegawai/form";
		} else {
			appservice.savePegawai(pegawai);
			return "redirect:list";
		}
	}
	//method untuk delete data
	@RequestMapping(value="master/pegawai/delete", method=RequestMethod.GET)
	public String delete(@RequestParam(value="id", required=true) String id){
		//cari pegawai berdasarkanparameter id
		//kalau sudah ketemu baru di delete
		Pegawai p = appservice.findPegawaiByID(id);
		appservice.deletePegawai(p);
		return"redirect:list";
		
	}
}