package com.sesi.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sesi.login.model.Usuario;

import ch.qos.logback.core.model.Model;

@Controller
public class AutenticacaoController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/registrar")
	public String mostrarFormularioRegistro(Model model) {
		modelo.addAttribute("usuario", new Usuario());
		return "registrar";
	}

}