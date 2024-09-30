package com.sesi.Aula05_Artifact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TarefaCatehoriaController {
	 @GetMapping("/listarCategoria")
      public String listarCategoria() {
    	  return "listarTarefaCategoria";
      }
}