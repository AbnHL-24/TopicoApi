package com.oracleone.topicoapi.topico.controller;

import com.oracleone.topicoapi.topico.model.Topico;
import com.oracleone.topicoapi.topico.service.TopicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
@RequiredArgsConstructor
public class TopicoController {

    private final TopicoService topicoService;

    @GetMapping
    public ResponseEntity<Page<Topico>> findAll(Pageable pageable) {
        return ResponseEntity.ok(topicoService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> findById(@PathVariable Long id) {
        return ResponseEntity.ok(topicoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Topico> save(@RequestBody Topico topico) {
        return ResponseEntity.created(null).body(topicoService.save(topico));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> update(@PathVariable int id, @RequestBody Topico topico) {
        return ResponseEntity.ok(topicoService.update(id, topico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        topicoService.deleteById(id);
        return ResponseEntity.accepted().build();
    }
}
