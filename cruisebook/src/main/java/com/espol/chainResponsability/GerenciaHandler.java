package com.espol.chainResponsability;

import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class GerenciaHandler extends ManejadorIncidente {

    @Override
    public void manejarIncidente(Incidente incidente) {
        incidente.setEstado(estadoIncidente.RESUELTO);
        System.out.println("Incidente resuelto por Gerencia del Crucero");
    }
}