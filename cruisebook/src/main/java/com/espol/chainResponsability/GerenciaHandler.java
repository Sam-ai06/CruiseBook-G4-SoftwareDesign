package com.espol.chainResponsability;
import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class GerenciaHandler extends ManejadorIncidente {

    @Override
    public boolean puedeManejar(Incidente incidente) {
        return true; //gerencia es el último nivel y maneja todo
    }
    
    @Override
    public void manejarIncidente(Incidente incidente) {
        incidente.setEstado(estadoIncidente.RESUELTO);
        System.out.println("Incidente crítico resuelto por Gerencia.");
    }
}