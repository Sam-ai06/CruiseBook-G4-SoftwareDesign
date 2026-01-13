package com.espol.chainResponsability;

import com.espol.entidades.Incidente;

public abstract class ManejadorIncidente implements BaseHandler {
    protected ManejadorIncidente siguiente;
    
    @Override
    public void setSiguiente(BaseHandler handler) {
        this.siguiente = (ManejadorIncidente) handler;
    }

    
    @Override
    public void procesar(Incidente incidente) {
        if (puedeManejar(incidente)) {
            manejarIncidente(incidente);
        } else if (siguiente != null) {
            System.out.println(this.getClass().getSimpleName() + ": Escalando incidente...");
            siguiente.procesar(incidente);
        } else {
            System.out.println("Fin de la cadena: No se pudo resolver el incidente.");
        }
    }
    
    public abstract void manejarIncidente(Incidente incidente);
}