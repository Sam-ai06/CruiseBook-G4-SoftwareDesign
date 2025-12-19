package com.espol.chainResponsability;

import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class AtencionClienteHandler extends ManejadorIncidente {

    @Override
    public boolean puedeManejar(Incidente incidente) {
        return incidente.getEstado() == estadoIncidente.ABIERTO && 
               incidente.getDescripcion().length() < 50;
    }
    
    @Override
    public void manejarIncidente(Incidente incidente) {
        incidente.setEstado(estadoIncidente.EN_PROCESO);
        if (puedeManejar(incidente)) {
            incidente.setEstado(estadoIncidente.RESUELTO);
            System.out.println("Incidente resuelto por Servicio al Cliente");
        } else {
            asignarAgente(incidente);
        }
    }
    
    private void asignarAgente(Incidente incidente) {
        System.out.println("AtencionClienteHandler: Escalando incidente...");
        if (siguiente != null) {
            siguiente.manejarIncidente(incidente);
        }
    }
}