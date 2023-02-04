package com.exercise.TerminalTransportes.SistemaTerminalTransporte.controllers;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Destino;
import com.exercise.TerminalTransportes.SistemaTerminalTransporte.services.DestinoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@Repository
@RestController
@RequestMapping("/destino")
public class DestinoController {

    private DestinoService destinoService;

    public DestinoController(DestinoService destinoService){
        this.destinoService=destinoService;
    }

    @GetMapping
    public List<Destino> getDestinos() {
        return destinoService.getDestinos();
    }

    @PostMapping

    public ResponseEntity<Destino> addDestinos(@RequestBody Destino destino) {
        if (destino == null || destino.getNombre() == null || destino.getNombre().length() > 100) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (!destino.getNombre().matches("^[a-zA-Z0-9]+$")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Destino destinoCreado = destinoService.addDestinos(destino.getNombre());
        return new ResponseEntity<>(destinoCreado, HttpStatus.CREATED);
    }


}