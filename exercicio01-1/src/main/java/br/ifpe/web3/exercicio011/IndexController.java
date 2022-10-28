package br.ifpe.web3.exercicio011;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // notação do método
public class IndexController {
	@GetMapping("/ind") // rota
	public String index() {
		return "index";
	}
	
	@GetMapping("/portugues")
	public String portugues() {
		return "portugues";
	}
	
	@GetMapping("/francais") // francês
	public String frances() {
		return "francais";
	}
	
	@GetMapping("/english") // Inglês
	public String english() {
		return "english";
	}
	
	@GetMapping("/deutsch") // Alemão
	public String deutsch() {
		return "deutsch";
	}
	
	@GetMapping("/italiano") // Italiano
	public String italiano() {
		return "italiano";
	}
	
	@GetMapping("/suomalainen") // Finlandês
	public String suomalainen() {
		return "suomalainen";
	}
	
	@GetMapping("/norsk") // Norueguês
	public String norsk() {
		return "norsk";
	}
	
//	@GetMapping("/page2")
//	public String page2() {
//		return "page2";
//	}
}
