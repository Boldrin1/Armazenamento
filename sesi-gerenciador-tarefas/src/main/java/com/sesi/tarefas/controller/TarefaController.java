package com.sesi.tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.tarefas.model.Tarefa;
import com.sesi.tarefas.repository.TarefaCategoriaRepository;
import com.sesi.tarefas.repository.TarefaRepository;
import com.sesi.tarefas.repository.UsuarioRepository;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
	TarefaRepository tarefaRepository;
	
	UsuarioRepository usuarioRepository;
	
	TarefaCategoriaRepository tarefaCategoriaRepository;
	
	@GetMapping("/listarTarefas")
	public String listarTarefas(Model modelo) {
		modelo.addAttribute("tarefas",tarefaRepository.findAll());
		return "listarTarefas";
	}
	
	@GetMapping("/novo")
	public String mostrarFormulario(Model modelo) {
		modelo.addAttribute("tarefa",new Tarefa());
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		modelo.addAttribute("categorias", tarefaCategoriaRepository.findAll());
		return "formularioTarefa";
	}
	
	@PostMapping("/salvarTarefa")
	public String SalvarTarefa(Tarefa tarefa) {
		tarefaRepository.save(tarefa);
		return"redirect:/tarefas/listarTarefas";
		
	}
}
