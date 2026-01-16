package com.espol.entidades;

import java.util.ArrayList;
import java.util.List;

public class Tarifa {

    private double precioBase;
    private final List<ServicioAdicional> serviciosAdicionales;

    public Tarifa(double precioBase) {
        this.precioBase = precioBase;
        this.serviciosAdicionales = new ArrayList<>();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public List<ServicioAdicional> getServiciosAdicionales() {
        return List.copyOf(serviciosAdicionales);
    }

    public double calcularTotal() {
        return precioBase + serviciosAdicionales.stream()
                                                .mapToDouble(ServicioAdicional::obtenerCosto)
                                                .sum();
    }

    public void agregarServicio(ServicioAdicional servicio) {
        if (servicio != null) {
            serviciosAdicionales.add(servicio);
        }
    }
}
