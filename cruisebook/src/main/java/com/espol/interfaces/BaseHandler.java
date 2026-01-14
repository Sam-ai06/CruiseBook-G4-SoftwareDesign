package com.espol.interfaces;

import com.espol.entidades.Incidente;

public interface BaseHandler {
    void setSiguiente(BaseHandler handler);
    void manejarIncidente(Incidente incidente);
    boolean puedeManejar(Incidente incidente);
    void procesar(Incidente incidente);
}