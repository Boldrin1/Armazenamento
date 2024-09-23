package com.sesi.aula04.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.sesi.aula04.repository.UsuarioRepository;

@Controller
public class UsuarioController {
    @Autowired 
    private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public String listarUsuario(Model modelo) {
		modelo.addAttribute("usuario", usuarioRepository.findAll());
		return "usuarios";
	}
}