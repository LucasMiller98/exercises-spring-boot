package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/") // home
	public String showHomeMessage(Model model) {
		model.addAttribute("msg", "Cadastre-se");
		return "home";
	}
}
