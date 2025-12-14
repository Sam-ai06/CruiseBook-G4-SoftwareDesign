package com.espol.decorator;

import com.espol.interfaces.ReservaComponent;

public class TratamientoSpaDecorator extends ServicioAdicionalDecorator {
    private String tratamiento;
    private double costo;

    public TratamientoSpaDecorator(ReservaComponent reserva, double costo) {
        super(reserva);
        this.costo = costo;
    }

    @Override
    public double calcularTotal() {
        return reserva.calcularTotal() + costo;
    }

    @Override
    public String obtenerDescripcion() {
        return reserva.obtenerDescripcion() + " + Tratamiento Spa";
    }

    
}
