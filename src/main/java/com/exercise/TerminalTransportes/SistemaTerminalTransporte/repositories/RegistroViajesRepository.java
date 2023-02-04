package com.exercise.TerminalTransportes.SistemaTerminalTransporte.repositories;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Registro_Viajes;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
    public interface RegistroViajesRepository {
         List<Registro_Viajes> registros();

         void addRegistro(Registro_Viajes registro);

         List<Registro_Viajes> getAllRegistros();
    }

