package com.exercise.TerminalTransportes.SistemaTerminalTransporte.services;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Destino;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinoService {

    private List<Destino> destinos;
    public DestinoService(){
        this.destinos= new ArrayList<>();
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public Destino addDestinos(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        Destino destino = new Destino(nombre);
        destino.setNombre(nombre);

        if (destino == null) {
            throw new IllegalArgumentException("No se pudo crear el destino");
        }
        return destino;
    }
}