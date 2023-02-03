package com.exercise.TerminalTransportes.SistemaTerminalTransporte.models;

import java.util.ArrayList;
import java.util.Date;

public class Registro_Viajes {


    private String destino;
    private Horario horario;
    private Bus bus;

    public Registro_Viajes(String destino, Horario horario, Bus bus) {
        this.destino = destino;
        this.horario = horario;
        this.bus = bus;
    }

    public String getDestino() {
        return destino;
    }

    public Horario getHorario() {
        return horario;
    }

    public Bus getBus() {
        return bus;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
