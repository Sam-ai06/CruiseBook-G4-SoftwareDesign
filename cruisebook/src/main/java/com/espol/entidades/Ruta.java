package com.espol.entidades;

import java.util.ArrayList;

public class Ruta {
    private String origen;
    private ArrayList<Destino> destinos;
    private ArrayList<String> escalas;

    // Constructor
    public Ruta(String origen, ArrayList<Destino> destinos, ArrayList<String> escalas) {
        this.origen = origen;
        this.destinos = destinos;
        this.escalas = escalas;
    }

    // Getters y Setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public ArrayList<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Destino> destinos) {
        this.destinos = destinos;
    }

    public ArrayList<String> getEscalas() {
        return escalas;
    }

    public void setEscalas(ArrayList<String> escalas) {
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
