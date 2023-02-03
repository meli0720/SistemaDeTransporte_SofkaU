package com.exercise.TerminalTransportes.SistemaTerminalTransporte.services;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinoService {
    private ArrayList<Destino> destinos = new ArrayList<>();

    public void addDestino(String nombreDestino) {
        destinos.add(new Destino(nombreDestino));
    }

    public ArrayList<Destino> getDestinos() {
        return destinos;
    }
}
