package com.espol.chainResponsability;

import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class SupervisorHandler extends ManejadorIncidente {

    @Override
    public boolean puedeManejar(Incidente incidente) {
        return incidente.getDescripcion().length() < 100;
    }
    
    @Override
    public void manejarIncidente(Incidente incidente) {
        incidente.setEstado(estadoIncidente.RESUELTO);
        System.out.println("Incidente resuelto por Supervisor.");
    }
}
