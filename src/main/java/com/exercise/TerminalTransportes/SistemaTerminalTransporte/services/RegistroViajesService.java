package com.exercise.TerminalTransportes.SistemaTerminalTransporte.services;

import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Registro_Viajes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RegistroViajesService {



        private ArrayList<Registro_Viajes> registros = new ArrayList<>();

        public void addRegistroViaje(Registro_Viajes registroViaje) {
            registros.add(registroViaje);
        }

        public ArrayList<Registro_Viajes> getRegistros() {
            return registros;
        }

    public ArrayList<Registro_Viajes> getAllRegistros() {
        return null;
    }
}
