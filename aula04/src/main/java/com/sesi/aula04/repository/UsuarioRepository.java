package com.sesi.aula04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.aula04.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
