package com.oracleone.topicoapi.topico.repository;

import com.oracleone.topicoapi.topico.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}