package com.espol.decorator;

import com.espol.interfaces.ReservaComponent;

public class PaqueteBebidasDecorator extends ServicioAdicionalDecorator {

    private double costo;

    public PaqueteBebidasDecorator(ReservaComponent reserva, double costo) {
        super(reserva);
        this.costo = costo;
    }

    @Override
    public double calcularTotal() {
        return reserva.calcularTotal() + costo;
    }

    @Override
    public String obtenerDescripcion() {
        return reserva.obtenerDescripcion() + " + Paquete de bebidas";
    }
}
