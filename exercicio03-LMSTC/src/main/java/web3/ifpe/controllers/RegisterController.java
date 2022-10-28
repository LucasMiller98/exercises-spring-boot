package web3.ifpe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import web3.ifpe.models.Message;

@Controller
public class RegisterController {
	@GetMapping("/contato")
	public String register() {
		return "contato";
	}
	
	@PostMapping("/register")
	public String saveRegisterName(Model model, Message message) {
		model.addAttribute("name", message.getName());
		model.addAttribute("phone", message.getPhone());
		model.addAttribute("email", message.getEmail());
		model.addAttribute("isNews", message.getIsNews());
		model.addAttribute("text", message.getText());
		model.addAttribute("cpf", message.getCpf());
		model.addAttribute("rg", message.getRg());
		return "tela-sucesso";
	}
}
