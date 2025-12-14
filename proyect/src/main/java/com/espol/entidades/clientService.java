package com.espol.entidades;
import com.espol.chainResponsability.AtencionClienteHandler;
import com.espol.chainResponsability.GerenciaHandler;
import com.espol.chainResponsability.ManejadorIncidente;


public class ClientService {

    private ManejadorIncidente cadena;

    public ClientService() {
        ManejadorIncidente atencion = new AtencionClienteHandler();
        ManejadorIncidente gerencia = new GerenciaHandler();
        atencion.setSiguiente(gerencia);
        this.cadena = atencion;
    }

    public void reportarIncidente(Incidente incidente) {
        cadena.manejarIncidente(incidente);
    }
}
