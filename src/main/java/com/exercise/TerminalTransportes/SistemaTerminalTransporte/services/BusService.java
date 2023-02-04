package com.exercise.TerminalTransportes.SistemaTerminalTransporte.services;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService {

    private List<Bus> buses;

    public BusService(){
        this.buses= new ArrayList<>();
    }



    public void addBus(Bus bus){
        buses.add(bus);
    }

    public List<Bus> getBuses() {
        return buses;
    }
}


