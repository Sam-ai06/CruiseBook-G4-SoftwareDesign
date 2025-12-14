package com.espol.entidades;

public class Pago {
    private double monto;
    private String metodoPago;
    private EstadoPago estado;

    // Constructor
    public Pago(double monto, String metodoPago, EstadoPago estado) {
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }

    // Métodos
    public boolean procesar() {
        // lógica para procesar el pago
        return true;
    }

    public void reembolsar() {
        // lógica para realizar el reembolso
    }

    // Enumeración interna
    public enum EstadoPago {
        PENDIENTE,
        EXITOSO,
        FALLIDO,
        REEMBOLSADO
    }
}

