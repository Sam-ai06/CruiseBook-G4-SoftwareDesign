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
        // Por ejemplo, podrías calcular la diferencia de días entre la fecha de cancelación
        // y la fecha de la reserva para determinar el porcentaje de reembolso
        return 0.0;
    }

    public boolean esCancelGratuita(Reserva reserva) {
        // TODO: implementar la lógica para saber si la cancelación es gratuita
        // Por ejemplo: return true si la reserva se cancela con más de X días de anticipación
        return false;
    }
}
