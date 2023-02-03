package com.exercise.TerminalTransportes.SistemaTerminalTransporte.controllers;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Horario;
import com.exercise.TerminalTransportes.SistemaTerminalTransporte.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @PostMapping("/")
    public void addHorario(@RequestBody Horario horario) {
        horarioService.addHorario(horario);
    }

    @GetMapping("/")
    public List<Horario> getAllHorarios() {
        return horarioService.getAllHorarios();
    }

    //@GetMapping("/{id}")
    //public Horario getHorarioById(@PathVariable int id) {
    //    return horarioService.getHorarioById(id);
    //}

    /**@PutMapping("/{id}")
    public void updateHorario(@RequestBody Horario horario, @PathVariable int id) {
        horarioService.updateHorario(horario, id);
    }

    @DeleteMapping("/{id}")
    public void deleteHorario(@PathVariable int id) {
        horarioService.deleteHorario(id);
    }**/
}
