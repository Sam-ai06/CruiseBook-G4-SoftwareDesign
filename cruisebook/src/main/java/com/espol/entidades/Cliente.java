package com.espol.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.espol.enums.estadoCabina;
import com.espol.enums.estadoReserva;
import com.espol.observer.Subscriber;

public class Cliente extends Usuario implements Subscriber {

  private List<Reserva> reservas = new ArrayList<>();

  public Cliente(DatosUser datos) {
        super(datos);}

  //métodos propios
  public Crucero buscarCrucero(String destino, String fechaSalida, String fechaLlegada, int duracionDias){
    // to do: delegar a un servicio que filtre cruceros por parámetros
    return new Crucero(); //NO FINAL
  }

  // reservar una cabina
  public Reserva reservarCabina(Cabina cabina, Crucero crucero) {

    //validaciones
    if (cabina == null) {
        throw new IllegalArgumentException("La cabina no puede ser nula");
    }
    if (crucero == null) {
        throw new IllegalArgumentException("El crucero no puede ser nulo");
    }

    //solo se puede reservar si la cabina está disponible
    if (cabina.getEstado() != estadoCabina.DISPONIBLE) {
        return null;
    }

    //tarifa básica 
    Tarifa tarifa = new Tarifa(0.0);

    // marcar cabina como reservada y añadir la reserva al historial del cliente
    //se crea la reserva usando el constructor existente
    Reserva reserva = new Reserva(this,//cliente
    null,//viaje (pendiente de lógica futura)
        cabina, tarifa);
    //estado inicial de la reserva
    reserva.setEstadoReserva(estadoReserva.PENDIENTE);
    //se marca la cabina como reservada
    cabina.setEstado(estadoCabina.RESERVADA);

    //se guarda la reserva en el historial del cliente
    this.reservas.add(reserva);

    return reserva;
}


  // getters y utilidades
  public List<Reserva> getReservas() {
    return reservas;
  }

  @Override
  public void update(String mensaje) {
    System.out.println("Notificación para " + getNombre() + ": " + mensaje);
  }

}
