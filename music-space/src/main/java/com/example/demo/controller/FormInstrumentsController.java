package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Instrument;
import com.example.demo.repository.InstrumentDAO;

@Controller
public class FormInstrumentsController {
	
	@Autowired
	private InstrumentDAO dao;
	
	@GetMapping("/")
	public String showForm(Instrument instrument) {
		return "form-instruments";
	}
	
	@PostMapping("/register")
	public String savedInstruments(Instrument instrument) {
		dao.save(instrument);
		return "redirect:/listInstruments";
	}
	
	@GetMapping("/listInstruments")
	public String listInstruments(Model model) {
		model.addAttribute("list", dao.findAll());
		return "instruments-list";
	}
	
	@GetMapping("/removeInstrument")
	public String removeInstrument(Integer code) {
		dao.deleteById(code);
		return "redirect:/listInstruments";
	}
	
	@GetMapping("/editInstrument")
	public String editInstrument(Integer code, Model model) {
		Instrument instrument = dao.findById(code).orElse(null);
		model.addAttribute("instrument", instrument);
		return "form-instruments";
	}
}
