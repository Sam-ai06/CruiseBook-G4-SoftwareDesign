package com.espol.entidades;

import java.util.List;
import java.util.ArrayList;

public class Crucero {
    private int idCrucero;
    private String nombre;
    private Ruta viaje;  // Asociación con la clase Ruta
    private GestorCabina inventarioCabinas;
    private List<Reserva> reservas;

    // Constructor
    public Crucero(int idCrucero, String nombre, Ruta viaje) {
        this.idCrucero = idCrucero;
        this.nombre = nombre;
        this.inventarioCabinas = new GestorCabina();
        this.viaje = viaje;
    }

    public Crucero() {
        this.inventarioCabinas = new GestorCabina();
        this.reservas = new ArrayList<>();
    }

    public Reserva reservarCabina(Usuario cliente, Viaje viajeInstancia, Cabina cabina, Tarifa tarifa) {
        //validar disponibilidad
        if (this.inventarioCabinas.estaDisponible(cabina)) {
            //crear reserva
            Reserva nuevaReserva = new Reserva(cliente, viajeInstancia, cabina, tarifa);
            this.inventarioCabinas.registrarReserva(cabina);
            this.reservas.add(nuevaReserva);

            return nuevaReserva;
        }
        return null;
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
