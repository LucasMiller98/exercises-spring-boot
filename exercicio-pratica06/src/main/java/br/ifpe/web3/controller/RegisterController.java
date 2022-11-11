package br.ifpe.web3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web3.model.Athlete;
import br.ifpe.web3.repository.AthleteDAO;

@Controller
public class RegisterController {
	
	@Autowired
	private AthleteDAO dao;
	
	@GetMapping("/")
	public String running() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerAthlete(Athlete athlete) {
		dao.save(athlete);
		return "register";
	}
}
