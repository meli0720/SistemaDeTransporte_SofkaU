package com.exercise.TerminalTransportes.SistemaTerminalTransporte.controllers;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Bus;
import com.exercise.TerminalTransportes.SistemaTerminalTransporte.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Repository

@RestController
@RequestMapping("/buses")
public class BusController {
    @Autowired
    private BusService busService;

    @PostMapping("/")
    public void addBus(@RequestBody Bus bus) {
        busService.addBus(bus.getId(), bus.getModelo(), bus.getCapacidad());
    }

    @GetMapping("/")
    public ArrayList<Bus> getBuses() {
        return busService.getBuses();
    }
}

