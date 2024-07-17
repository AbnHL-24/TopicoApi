package com.oracleone.topicoapi.topico.service;

import com.oracleone.topicoapi.topico.model.Topico;
import com.oracleone.topicoapi.topico.repository.TopicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TopicoService {

    private final TopicoRepository topicoRepository;

    public Page<Topico> findAll(Pageable pageable) {
        return topicoRepository.findAll(pageable);
    }

    public Topico findById(Long id) {
        return topicoRepository.findById(id).orElse(null);
    }

    public Topico save(Topico topico) {
        return topicoRepository.save(topico);
    }

    public Topico update(int id, Topico topico) {
        topico.setId(id);
        return topicoRepository.save(topico);
    }

    public void deleteById(Long id) {
        topicoRepository.deleteById(id);
    }
}
