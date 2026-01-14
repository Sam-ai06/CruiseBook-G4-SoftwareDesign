package com.espol.entidades;

import java.time.LocalDateTime;

public class PoliticaCancelacion {
    private String reglas;

    // Constructor
    public PoliticaCancelacion(String reglas) {
        this.reglas = reglas;
    }

    // Getter y Setter
    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

    // Métodos principales
    public double calcularReembolso(Reserva reserva, LocalDateTime fechaActual) {
        // TODO: implementar la lógica real del cálculo

        return 0.0;
    }

    public boolean esCancelGratuita(Reserva reserva) {
        // TODO: implementar la lógica para saber si la cancelación es gratuita
        return false;
    }
}
