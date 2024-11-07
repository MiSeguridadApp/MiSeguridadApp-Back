package com.miseguridad.app.service;

import com.miseguridad.app.domain.entity.Incidencia;
import com.miseguridad.app.infra.exception.ResourceNotFoundException;
import com.miseguridad.app.infra.repository.IncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidenciaService {
    @Autowired
    private IncidenciaRepository incidenciaRepository;

    public List<Incidencia> obtenerIncidencias() {
        return incidenciaRepository.findAll();
    }

    public Incidencia registrarIncidencia(Incidencia incidencia) {
        return incidenciaRepository.save(incidencia);
    }

    public Incidencia modificarIncidencia(Long id, Incidencia nuevaIncidencia) {
        return incidenciaRepository.findById(id).map(incidencia -> {
            incidencia.setFecha(nuevaIncidencia.getFecha());
            incidencia.setTipo(nuevaIncidencia.getTipo());
            incidencia.setUbicacion(nuevaIncidencia.getUbicacion());
            incidencia.setEstadoAtencion(nuevaIncidencia.getEstadoAtencion());
            return incidenciaRepository.save(incidencia);
        }).orElseThrow(() -> new ResourceNotFoundException("Incidencia no encontrada con id: " + id));
    }
}
