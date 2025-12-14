package com.espol.decorator;

import com.espol.interfaces.ReservaComponent;

public abstract class ServicioAdicionalDecorator implements ReservaComponent {

    protected ReservaComponent reserva;

    public ServicioAdicionalDecorator(ReservaComponent reserva) {
        this.reserva = reserva;
    }
}
