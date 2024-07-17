package com.oracleone.topicoapi.usuario.repository;

import com.oracleone.topicoapi.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}