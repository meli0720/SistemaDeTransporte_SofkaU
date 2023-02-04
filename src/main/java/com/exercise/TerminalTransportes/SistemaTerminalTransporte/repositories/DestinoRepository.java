package com.exercise.TerminalTransportes.SistemaTerminalTransporte.repositories;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Destino;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface DestinoRepository {
    List<Destino> getDestinos();

    void addDestinos(Destino destino);
    }

