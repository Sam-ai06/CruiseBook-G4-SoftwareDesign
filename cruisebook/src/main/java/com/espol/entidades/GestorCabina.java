package com.espol.entidades;
import java.util.ArrayList;
import java.util.List;

public class GestorCabina {


    //refactor: la lista de cabinas reservadas ahora se maneja aqui
    private List<Cabina> cabinasReservadas;

    public GestorCabina() {
        this.cabinasReservadas = new ArrayList<>();
    }

    public boolean estaDisponible(Cabina cabina) {
        return !cabinasReservadas.contains(cabina);
    }

    public void registrarReserva(Cabina cabina) {
        if (estaDisponible(cabina)) {
            cabinasReservadas.add(cabina);
        }
    }

    public void liberarCabina(Cabina cabina) {
        cabinasReservadas.remove(cabina);
    }
} 

