package com.sesi.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.login.model.Papel;
import com.sesi.login.model.Usuario;

@Repository
public interface PapelRepository extends JpaRepository<Papel, Long>{
    Papel findByNomePapel(String nomeUsuario);
}