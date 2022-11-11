package br.ifpe.web3.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import br.ifpe.web3.model.Athlete;
import br.ifpe.web3.repository.AthleteDAO;

@Controller
public class RaceController {
	
	@Autowired
	private AthleteDAO dao;
	
	@GetMapping("/")
	public String running(Athlete athlete) {
		return "race";
	}
	
	@PostMapping("/register")
	public String enrollmentRegister(Athlete athlete, Model model) {
		model.addAttribute("athlete", dao.save(athlete));
		return "enrollment-register";
	}
}
