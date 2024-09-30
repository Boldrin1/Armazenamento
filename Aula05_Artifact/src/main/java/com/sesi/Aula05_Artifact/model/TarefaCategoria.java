package com.sesi.Aula05_Artifact.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class TarefaCategoria {
	@Id
	 
     
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String nome;
     
	public TarefaCategoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public TarefaCategoria() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
     
}