package com.espol.entidades;

public class Telefono {
    private final String numero;

    public Telefono(String numero) {
        //validación que no sea nulo y que contenga solo números 
        if (numero == null || !numero.matches("\\+?\\d{7,15}")) {
            throw new IllegalArgumentException("El formato del teléfono es inválido. Debe contener entre 7 y 15 dígitos.");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono = (Telefono) o;
        return numero.equals(telefono.numero);
    }
}
