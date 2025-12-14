package com.espol.chainResponsability;

import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class AtencionClienteHandler extends ManejadorIncidente {

    @Override
    public void manejarIncidente(Incidente incidente) {

        if (incidente.getEstado() == estadoIncidente.ABIERTO) {
            // Se intenta resolver
            incidente.setEstado(estadoIncidente.EN_PROCESO);

            // Simulación: solo resuelve incidentes simples
            if (incidente.getDescripcion().length() < 50) {
                incidente.setEstado(estadoIncidente.RESUELTO);
                System.out.println("Incidente resuelto por Atención al Cliente");
            } else if (siguiente != null) {
                siguiente.manejarIncidente(incidente);
            }
        }
    }
}