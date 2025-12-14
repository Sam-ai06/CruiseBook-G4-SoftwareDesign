package com.espol.entidades;

public abstract class ServicioAdicional {
    protected String nombre;
    protected double precio;

    // Constructor
    public ServicioAdicional(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método abstracto
    public abstract double obtenerCosto();
}
