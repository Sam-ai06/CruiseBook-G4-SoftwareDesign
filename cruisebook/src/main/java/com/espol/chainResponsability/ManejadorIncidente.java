package com.espol.chainResponsability;

import com.espol.entidades.Incidente;

public abstract class ManejadorIncidente implements BaseHandler {
    protected ManejadorIncidente siguiente;
    
    @Override
    public void setSiguiente(BaseHandler handler) {
        this.siguiente = (ManejadorIncidente) handler;
    }
    
    public void setSiguiente(ManejadorIncidente manejador) {
        this.siguiente = manejador;
    }
    
    @Override
    public abstract void manejarIncidente(Incidente incidente);
    
    @Override
    public void procesar(Incidente incidente) {
        if (puedeManejar(incidente)) {
            manejarIncidente(incidente);
        } else if (siguiente != null) {
            siguiente.procesar(incidente);
        }
    }
}