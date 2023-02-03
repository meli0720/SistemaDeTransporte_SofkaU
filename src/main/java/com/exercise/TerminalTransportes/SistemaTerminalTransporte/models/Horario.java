package com.exercise.TerminalTransportes.SistemaTerminalTransporte.models;

import java.util.Date;

public class Horario {
    private Date horaSalida;
    private Date horaLlegada;

    public Horario(Date horaSalida, Date horaLlegada) {
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public Horario() {

    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public String toString() {
        return "Este es el Horario{" +
                "horaSalida=" + horaSalida +
                ", horaLlegada=" + horaLlegada +
                '}';
    }
}
