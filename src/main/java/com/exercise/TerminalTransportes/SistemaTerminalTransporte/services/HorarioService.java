package com.exercise.TerminalTransportes.SistemaTerminalTransporte.services;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Horario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HorarioService {

    private List<Horario> horarios;

    public HorarioService() {
        horarios = new ArrayList<Horario>();
    }

    public void addHorario(Horario horario) {
        horarios.add(horario);
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    /**public Horario getHorarioById(int id) {
        for (Horario horario : horarios) {
            if (horario.getId() == id) {
                return horario;
            }
        }
        return null;
    }**/

    public List<Horario> getAllHorarios() {
        return null;
    }
}
