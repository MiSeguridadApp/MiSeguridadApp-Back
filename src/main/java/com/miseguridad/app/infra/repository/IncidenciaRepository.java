package com.miseguridad.app.infra.repository;

import com.miseguridad.app.domain.entity.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> {
}
