package com.exercise.TerminalTransportes.SistemaTerminalTransporte.repositories;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
    public interface BusRepository {
       List<Bus> getBuses();


        void addBus(Bus bus);
    }

