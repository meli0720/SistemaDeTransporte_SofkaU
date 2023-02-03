package com.exercise.TerminalTransportes.SistemaTerminalTransporte.services;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BusService {
    private ArrayList<Bus> buses = new ArrayList<>();

    public void addBus(String id, String modelo, int capacidad) {
        buses.add(new Bus(id, modelo, capacidad));
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }
}


