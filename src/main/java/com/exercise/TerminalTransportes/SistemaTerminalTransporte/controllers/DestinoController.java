package com.exercise.TerminalTransportes.SistemaTerminalTransporte.controllers;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Destino;
import com.exercise.TerminalTransportes.SistemaTerminalTransporte.services.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {
    @Autowired
    private DestinoService destinoService;

    @PostMapping
    public ResponseEntity<Destino> addDestino(@RequestBody Destino destino) {
        destinoService.addDestino(destino.getNombre());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ArrayList<Destino> getDestinos() {
        return destinoService.getDestinos();
    }
}