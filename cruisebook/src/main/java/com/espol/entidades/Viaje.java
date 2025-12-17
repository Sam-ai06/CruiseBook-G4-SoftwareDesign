package com.espol.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.espol.enums.tipoCabina;
import com.espol.enums.estadoCabina;


public class Viaje {
    private LocalDate fechaSalida;
    private int duracionDias;
    private Ruta ruta;  // Asociación con la clase Ruta

    private List<Cabina> cabinas;
    // Constructor
    public Viaje(LocalDate fechaSalida, int duracionDias, Ruta ruta, List<Cabina> cabinas) {
        this.fechaSalida = fechaSalida;
        this.duracionDias = duracionDias;
        this.ruta = ruta;
        this.cabinas = cabinas;
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
        List<Cabina> disponibles = new ArrayList<>();
        for (Cabina c : cabinas) {
            if (c.getTipo() == tipo && c.getEstado() == estadoCabina.DISPONIBLE) {
                disponibles.add(c);
            }
        }
        return disponibles;
    }

    public void actualizarEstadoCabinas() {
        for (Cabina c : cabinas) {
            if (c.getEstado() == estadoCabina.RESERVADA) {
                c.setEstado(estadoCabina.OCUPADA);
            }
        }
    }
}
