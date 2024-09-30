package com.sesi.Aula05_Artifact.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;

import com.sesi.Aula05_Artifact.model.TarefaCategoria;
import com.sesi.Aula05_Artifact.repository.TarefaCategoriaRepository;



@Configuration
public class CarregaBaseDeDados {

	@Autowired
	private TarefaCategoriaRepository tarefaCategoriaRepository;
	
	@Bean
		CommandLineRunner executar() {
			return args ->{
				TarefaCategoria categoria = new TarefaCategoria();
				categoria.setNome("Estudos");
				
				tarefaCategoriaRepository.save(categoria);
				
				TarefaCategoria categoria1 = new TarefaCategoria();
				categoria.setNome("Pesquisa");
				
			};
		}
	
}
