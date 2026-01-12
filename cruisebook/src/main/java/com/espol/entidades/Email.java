package com.espol.entidades;

public class Email {
    private final String direccion;

    public Email(String direccion) {
        if (!direccion.contains("@")) {
            throw new IllegalArgumentException("Formato de email inválido");
        }
        this.direccion = direccion;
    }
    public String getDireccion() { return direccion; }
}

