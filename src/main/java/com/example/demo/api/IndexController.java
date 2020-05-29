package com.example.demo.api;

import com.example.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping()
	public String get() {
		return "API Pais";
	}
	
//	@GetMapping("/login")
//	public String login(@RequestParam("login") String login, @RequestParam("senha") String senha) {
//		return "Login: " + login + "Senha: " + senha ;
//	}

}
