package com.oracleone.topicoapi.usuario.model;


import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 150)
    private String nombre;

    @Column(name = "usuario", length = 50)
    private String usuario;

    @Column(name = "password", length = 500)
    private String password;
}
