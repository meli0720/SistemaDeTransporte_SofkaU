package com.exercise.TerminalTransportes.SistemaTerminalTransporte.models;

public class Bus {

    private String id;
    private String modelo;
    private int capacidad;

    public Bus(String id, String modelo, int capacidad) {
        this.id = id;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int asientos) {
        this.capacidad = asientos;
    }

    @Override
    public String toString() {
        return " Te toco en el Bus" +
                ", modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
