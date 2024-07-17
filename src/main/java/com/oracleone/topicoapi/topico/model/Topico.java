package com.oracleone.topicoapi.topico.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Entity
@Table(name = "topico")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo", length = 150)
    private String titulo;

    @Column(name = "mensaje", length = 500)
    private String mensaje;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
}
