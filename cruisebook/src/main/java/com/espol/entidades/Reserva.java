package com.espol.entidades;

import java.time.LocalDateTime;
import java.util.List;

import com.espol.enums.estadoReserva;

public class Reserva {
    private Usuario cliente;
    private Viaje viaje;
    private Cabina cabina;
    private estadoReserva estado;
    private LocalDateTime fechaCreacion;
    private Tarifa tarifa;



    //lista de cabinas reservadas para evitar que se repitan reservas
    private List<Cabina> cabinasReservadas;

    public Reserva(Usuario cliente, Viaje viaje, Cabina cabina, estadoReserva estado, LocalDateTime fechaCreacion, Tarifa tarifa){
        this.cliente = cliente;
        this.viaje = viaje;
        this.cabina = cabina;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.tarifa = tarifa;
    }
    public Reserva(){}

    // getters y setters de Reserva
    public Usuario getCliente(){
        return cliente;
    }

    public void setCliente(Usuario cliente){
        this.cliente = cliente;
    }

    public Viaje getViaje(){
        return viaje;
    }

    public void setViaje(Viaje viaje){
        this.viaje = viaje;
    }

    public Cabina getCabina(){
        return cabina;
    }

    public void setCabina(Cabina cabina){
        this.cabina = cabina;
    }

    public estadoReserva getEstadoReserva(){
        return estado;
    }

    public LocalDateTime getFechaCreacion(){
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }

    public Tarifa getTarifa(){
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa){
        this.tarifa = tarifa;
    }

    public estadoReserva getEstado() {
        return estado;
    }
    public void setEstado(estadoReserva estado) {
        this.estado = estado;
    }
    
    
    public List<Cabina> getCabinasReservadas() {
        return cabinasReservadas;
    }
    public void setCabinasReservadas(List<Cabina> cabinasReservadas) {
        this.cabinasReservadas = cabinasReservadas;
    }
    private void confirmar(Pago pago){
        // to do
    }
    private void cancelar(){
        // to do
    }
    private void reembolsar(){
        // to do
    }
    
    //observer pattern
    private Notificadora notificadora = new Notificadora();

    public void suscribirCliente(Cliente cliente) {
        notificadora.subscribe(cliente);
    }

    public void setEstadoReserva(estadoReserva estado) {
        this.estado = estado;
        notificadora.notifySubscribers("La reserva ha cambiado a estado: " + estado);
    }
}
