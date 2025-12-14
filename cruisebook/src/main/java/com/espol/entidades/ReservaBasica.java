package com.espol.entidades;

import com.espol.interfaces.ReservaComponent;

public class ReservaBasica implements ReservaComponent {

    private double precioBase;

    public ReservaBasica(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public double calcularTotal() {
        return precioBase;
    }

    @Override
    public String obtenerDescripcion() {
        return "Reserva básica";
    }
}
