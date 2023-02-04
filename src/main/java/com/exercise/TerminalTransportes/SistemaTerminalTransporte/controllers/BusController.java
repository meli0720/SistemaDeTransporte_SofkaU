package com.exercise.TerminalTransportes.SistemaTerminalTransporte.controllers;


import com.exercise.TerminalTransportes.SistemaTerminalTransporte.models.Bus;
import com.exercise.TerminalTransportes.SistemaTerminalTransporte.services.BusService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Repository
@RestController
@RequestMapping("/buses")
public class BusController {
    private BusService busService;
    public BusController(BusService busService){
        this.busService=busService;
    }

    @GetMapping
    public List<Bus> getBuses() {
        return busService.getBuses();
    }

    @PostMapping
    public void addBus(@RequestBody Bus bus) {
        busService.addBus(bus);

    }


}

