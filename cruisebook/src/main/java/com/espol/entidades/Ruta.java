package com.espol.entidades;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private String origen;
    private List<Destino> destinos;
    private List<String> escalas;

    // Constructor
    public Ruta(String origen, List<Destino> destinos2, List<String> escalas2) {
        this.origen = origen;
        this.destinos = destinos2;
        this.escalas = escalas2;
    }

    // Getters y Setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<Destino> destinos) {
        this.destinos = destinos;
    }

    public List<String> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<String> escalas) {
        this.escalas = escalas;
    }

    // Método principal
    public String obtenerResumenRuta() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Origen: ").append(origen).append("\n");


        ArrayList<String> destinosStr = new ArrayList<>(); //convertimos destinos a string
        for (Destino d : destinos) {
            destinosStr.add(d.toString());
        }
        resumen.append("Destinos: ").append(String.join(", ", destinosStr)).append("\n");
        resumen.append("Escalas: ").append(String.join(", ", escalas));
        return resumen.toString();
    }
}
