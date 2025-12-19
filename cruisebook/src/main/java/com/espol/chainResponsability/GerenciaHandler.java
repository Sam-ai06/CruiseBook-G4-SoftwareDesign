package com.espol.chainResponsability;
import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class GerenciaHandler extends ManejadorIncidente {
    
    @Override
    public boolean puedeManejar(Incidente incidente) {
        // Gerencia siempre puede manejar el incidente
        return true;
    }
    
    @Override
    public void manejarIncidente(Incidente incidente) {
        incidente.setEstado(estadoIncidente.RESUELTO);
        System.out.println("Incidente resuelto por Gerencia del Crucero");
    }
    
    private void asignarAgente(Incidente incidente) {
        // Gerencia es el último nivel, no hay más escalamiento
        System.out.println("GerenciaHandler: Asignando recursos para resolver incidente crítico");
    }
}