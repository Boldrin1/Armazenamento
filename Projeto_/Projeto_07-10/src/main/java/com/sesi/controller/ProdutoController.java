package com.sesi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.model.Produto;
import com.sesi.service.ProdutoService;

@Controller
@RequestMapping("/usuario")
public class ProdutoController {
       
	private ProdutoService produtoService;
	
	@GetMapping("/home")
	public List<Produto> visualizarProdutos(@ModelAttribute Produto produto) {
		return produtoService.listarProduto();
	}
	
}