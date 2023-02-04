package com.exercise.TerminalTransportes.SistemaTerminalTransporte.controllers;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Registro_Viajes;
import com.exercise.TerminalTransportes.SistemaTerminalTransporte.services.RegistroViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Repository
@RestController
    @RequestMapping("/registro")
    public class RegistroViajesController {

        private RegistroViajesService registroViajesService;

    @GetMapping
    public ArrayList<Registro_Viajes> getAllRegistros() {
        return registroViajesService.getAllRegistros();
    }

    @PostMapping
        public void addRegistro(@RequestBody Registro_Viajes registroViaje) {
            registroViajesService.addRegistro(registroViaje);
        }

    }

