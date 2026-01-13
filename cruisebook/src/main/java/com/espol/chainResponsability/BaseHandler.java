package com.espol.chainResponsability;
import com.espol.entidades.Incidente;

public interface BaseHandler {
    void setSiguiente(BaseHandler handler);
    void procesar(Incidente incidente);
    boolean puedeManejar(Incidente incidente); 
}

