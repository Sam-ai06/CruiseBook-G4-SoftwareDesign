package com.espol.entidades;

import java.time.LocalDate;
import java.util.List;

import com.espol.enums.tipoCabina;

public class Viaje {
    private LocalDate fechaSalida;
    private int duracionDias;
    private Ruta ruta;  // Asociación con la clase Ruta

    // Constructor
    public Viaje(LocalDate fechaSalida, int duracionDias, Ruta ruta) {
        this.fechaSalida = fechaSalida;
        this.duracionDias = duracionDias;
        this.ruta = ruta;
    }

    // Getters y Setters
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    // Métodos solicitados
    public List<Cabina> obtenerCabinasDisponibles(tipoCabina tipo) {
        // TODO: retornar lista de cabinas disponibles según el tipo
        return null;
    }

    public void actualizarEstadoCabinas() {
        // TODO: actualizar el estado de las cabinas según disponibilidad o mantenimiento
    }
}
