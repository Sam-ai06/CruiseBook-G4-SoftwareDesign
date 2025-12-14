package com.espol.decorator;

import com.espol.interfaces.ReservaComponent;

public class ExcursionDecorator extends ServicioAdicionalDecorator {

    private double costo;

    public ExcursionDecorator(ReservaComponent reserva, double costo) {
        super(reserva);
        this.costo = costo;
    }

    @Override
    public double calcularTotal() {
        return reserva.calcularTotal() + costo;
    }

    @Override
    public String obtenerDescripcion() {
        return reserva.obtenerDescripcion() + " + Excursión";
    }
}
