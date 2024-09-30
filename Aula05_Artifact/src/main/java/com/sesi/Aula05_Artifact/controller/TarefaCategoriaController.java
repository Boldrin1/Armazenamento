package com.sesi.Aula05_Artifact.controller;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.sesi.Aula05_Artifact.model.TarefaCategoria;
import com.sesi.Aula05_Artifact.repository.tarefaCategoriaRepository;



@Controller
public class TarefaCategoriaController {
	
	tarefaCategoriaRepository tarefaCategoriaRepository;
	
	 @GetMapping("/listarCategoria")
      public String listarCategoria(Model model) {
		 model.addAttribute("categorias",tarefaCategoriaRepository.findAll());
    	  return "listarTarefaCategoria";
      }
	 
	 @GetMapping("editarCategoria/{id}")
	 public String editarCategoria(@PathVariable("id") int id,Model modelo) {
		Optional<TarefaCategoria> categoriaOpt = tarefaCategoriaRepository.findById(id);
		
		if(categoriaOpt.isPresent()) {
			modelo.addAttribute("categoria",categoriaOpt.get());
			return "formularioTarefaCategoria";
		}else {
			return "redirect:/listarTarefaCategoria";
		}
	 }
	 
	 @GetMapping("/formularioCategoria")
	 public String mostrarFormulario() {
		 return "alguma";
		 
	 }
}