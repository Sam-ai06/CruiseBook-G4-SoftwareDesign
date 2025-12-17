package com.espol.entidades;

public class Destino {
    private String nombre;
    private String descripcion;
    private String pais;

    // Constructor
    public Destino(String nombre, String descripcion, String pais) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pais = pais;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String obtenerResumenRuta() {
        return nombre + ", " + pais + " - " + descripcion;
    }
}
