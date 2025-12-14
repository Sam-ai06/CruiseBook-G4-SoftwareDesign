package com.espol.chainResponsability;

import com.espol.entidades.Incidente;

public abstract class ManejadorIncidente {

    protected ManejadorIncidente siguiente;

    public void setSiguiente(ManejadorIncidente siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarIncidente(Incidente incidente);
}