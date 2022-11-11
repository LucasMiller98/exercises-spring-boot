package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;

@Controller
public class FormController {
	
	@Autowired
	private ContactRepository dao;
	
	@GetMapping("/showFormScreen")
	public String showFormScreen(Contact contact) {
		return "form-screen";
	}
	
	@PostMapping("/register")
	public String savedContact(Contact contact) {
		dao.save(contact);
		return "redirect:/listContacts";
	}
	
	@GetMapping("/listContacts")
	public String listContacts(Model model) {
		model.addAttribute("list", dao.findAll());
		return "contact-list";
	}
	
	@GetMapping("/removeContacts")
	public String removeContact(Integer code) {
		dao.deleteById(code);
		return "redirect:/listContacts";
	}
	
	@GetMapping("/editContact")
	public String editContact(Model model, Integer code) {
		Contact contact = dao.findById(code).orElse(null);
		model.addAttribute("contact", contact);
		return "redirect:/listContact";
	}
}
