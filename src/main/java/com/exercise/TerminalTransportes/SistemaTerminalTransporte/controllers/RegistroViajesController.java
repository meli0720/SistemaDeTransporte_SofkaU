package com.exercise.TerminalTransportes.SistemaTerminalTransporte.controllers;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Registro_Viajes;
import com.exercise.TerminalTransportes.SistemaTerminalTransporte.services.RegistroViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
    @RequestMapping("/registro_viajes")
    public class RegistroViajesController {
        @Autowired
        private RegistroViajesService registroViajesService;

        @PostMapping("/")
        public void addRegistroViaje(@RequestBody Registro_Viajes registroViaje) {
            registroViajesService.addRegistroViaje(registroViaje);
        }

        @GetMapping("/")
        public ArrayList<Registro_Viajes> getRegistros() {
            return registroViajesService.getAllRegistros();
        }

        /**@GetMapping("/{id}")
        public Registro_Viajes getRegistroById(@PathVariable int id) {
            return registroViajesService.getRegistroById(id);
        }

        @PutMapping("/{id}")
        public void updateRegistro(@PathVariable int id, @RequestBody Registro_Viajes registroViaje) {
            registroViajesService.updateRegistro(id, registroViaje);
        }

        @DeleteMapping("/{id}")
        public void deleteRegistro(@PathVariable int id) {
            registroViajesService.deleteRegistro(id);
        }**/
    }

