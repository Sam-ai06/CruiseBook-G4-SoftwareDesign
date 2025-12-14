package com.espol.entidades;

import java.util.ArrayList;
import java.util.List;

public class Tarifa {
    private double precioBase;
    private List<ServicioAdicional> serviciosAdicionales;
    private double precioTotal;

    // Constructor
    public Tarifa(double precioBase) {
        this.precioBase = precioBase;
        this.serviciosAdicionales = new ArrayList<>();
        this.precioTotal = precioBase;
    }

    // Getters y Setters
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public List<ServicioAdicional> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(List<ServicioAdicional> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    // Métodos solicitados
    public double calcularTotal() {
        double total = precioBase;
        for (ServicioAdicional servicio : serviciosAdicionales) {
            total += servicio.obtenerCosto();
        }
        this.precioTotal = total;
        return total;
    }

    public void agregarServicio(ServicioAdicional servicio) {
        if (servicio != null) {
            serviciosAdicionales.add(servicio);
            calcularTotal();
        }
    }
}
