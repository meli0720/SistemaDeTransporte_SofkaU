package com.exercise.TerminalTransportes.SistemaTerminalTransporte.repositories;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
    public class BusRepository {
        private List<Bus> buses = new ArrayList<>();

        public void addBus(Bus bus) {
            buses.add(bus);
        }

        public List<Bus> getAllBuses() {
            return buses;
        }
    }

