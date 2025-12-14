package com.espol.entidades;

import java.util.List;

public class Crucero {
    private int idCrucero;
    private String nombre;
    private Ruta viaje;  // Asociación con la clase Ruta

    // Constructor
    public Crucero(int idCrucero, String nombre, Ruta viaje) {
        this.idCrucero = idCrucero;
        this.nombre = nombre;
        this.viaje = viaje;
    }
    public Crucero(){
    }

    // Getters y Setters
    public int getIdCrucero() {
        return idCrucero;
    }

    public void setIdCrucero(int idCrucero) {
        this.idCrucero = idCrucero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ruta getViaje() {
        return viaje;
    }

    public void setViaje(Ruta viaje) {
        this.viaje = viaje;
    }

    // Métodos solicitados
    public List<Ruta> getRuta() {
        // TODO: retornar lista de rutas disponibles del crucero
        return null;
    }

    public List<Viaje> getViajeList() {
        // TODO: retornar lista de viajes asociados al crucero
        return null;
    }

}
