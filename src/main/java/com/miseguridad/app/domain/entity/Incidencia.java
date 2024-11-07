package com.miseguridad.app.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "incidencia")
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fecha;

    private String tipo;

    private String ubicacion;

    @Column(name = "estado_atencion")
    private String estadoAtencion;

    public void modificarIncidencia(String nuevoTipo, String nuevaUbicacion, String nuevoEstadoAtencion) {
        this.tipo = nuevoTipo;
        this.ubicacion = nuevaUbicacion;
        this.estadoAtencion = nuevoEstadoAtencion;
    }
}
