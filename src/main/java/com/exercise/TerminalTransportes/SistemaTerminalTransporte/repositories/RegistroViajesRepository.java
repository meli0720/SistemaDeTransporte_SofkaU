package com.exercise.TerminalTransportes.SistemaTerminalTransporte.repositories;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Registro_Viajes;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
    public class RegistroViajesRepository {
        private List<Registro_Viajes> registros = new ArrayList<>();

        public void addRegistro(Registro_Viajes registro) {
            registros.add(registro);
        }

        public List<Registro_Viajes> getAllRegistros() {
            return registros;
        }
    }

