package com.espol.chainResponsability;

import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class AtencionClienteHandler extends ManejadorIncidente {
    
    @Override
    public boolean puedeManejar(Incidente incidente) {
        // Maneja incidentes abiertos muy cortos
        return incidente.getDescripcion().length() < 50;
    }
    
    @Override
    public void manejarIncidente(Incidente incidente) {
        incidente.setEstado(estadoIncidente.RESUELTO);
        System.out.println("Incidente resuelto por Servicio al Cliente.");
    }
}