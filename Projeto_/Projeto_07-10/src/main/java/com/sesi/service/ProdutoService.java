package com.sesi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesi.model.Produto;
import com.sesi.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
      private ProdutoRepository produtoRepository;
      
      public List<Produto> listarProduto() {
    	  
    	  return produtoRepository.findAll();
    	  
      }
}