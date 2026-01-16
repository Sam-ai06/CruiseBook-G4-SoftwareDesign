package com.espol.entidades;

import java.time.LocalDateTime;
import com.espol.enums.estadoReserva;
import com.espol.interfaces.ReservaComponent;
import com.espol.observer.Notificadora;

public class Reserva implements ReservaComponent{
    private Usuario cliente;
    private Viaje viaje;
    private Cabina cabina;
    private estadoReserva estado;
    private LocalDateTime fechaCreacion;
    private Tarifa tarifa;


    private Notificadora notificadora = new Notificadora();

    public Reserva(Usuario cliente, Viaje viaje, Cabina cabina, estadoReserva estado, LocalDateTime fechaCreacion, Tarifa tarifa){
        this.cliente = cliente;
        this.viaje = viaje;
        this.cabina = cabina;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.tarifa = tarifa;
    }
    public Reserva(Usuario cliente, Viaje viaje, Cabina cabina, Tarifa tarifa) {
        this.cliente = cliente;
        this.viaje = viaje;
        this.cabina = cabina;
        this.tarifa = tarifa;
        this.fechaCreacion = LocalDateTime.now();
         this.estado = estadoReserva.PENDIENTE;
    }


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
    

    public boolean procesarPago(Pago pago) {
        if (pago == null) return false;
        boolean exito = pago.procesar();
        if (exito) {
            setEstadoReserva(estadoReserva.CONFIRMADA);
        }
        return exito;
    }
    
    private void cancelar(){
        // to do
    }

    private void reembolsar(Pago pagoEfectuado) {
    if (pagoEfectuado != null) {
            pagoEfectuado.reembolsar();
            setEstadoReserva(estadoReserva.REEMBOLSADO);
        }
    }
    
    public Notificadora getNotificadora() {
        return notificadora;
    }
    
    public void setEstadoReserva(estadoReserva estado) {
        this.estado = estado;
        //reserva solo le pide a su notificadora
        notificadora.enviarAlerta("La reserva ha cambiado a estado: " + estado);
    }

    @Override
    public String obtenerDescripcion() {
        return "Reserva para " + cliente.getNombre();
    }

    @Override
    public double calcularTotal() {
        return tarifa.calcularTotal();
    }

}
