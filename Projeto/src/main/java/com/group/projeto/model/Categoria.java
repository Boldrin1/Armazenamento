package com.group.projeto.model;

public class Categoria {
   private String nome;
   private String descricao;
   
   public void adicionar() {
	   return ;
   }
   
   public void remover() {
	   return ;
   }

public Categoria(String nome, String descricao) {
	super();
	this.nome = nome;
	this.descricao = descricao;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}
   


}
