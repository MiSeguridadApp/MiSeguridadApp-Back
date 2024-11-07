package com.miseguridad.app.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, updatable = false)
    private UUID uuid;

    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String rol; // ADMIN, AUTORIDAD, CIUDADANO
    private String estadoRol;

    private String usuario;
    private String contrasenia;
}
