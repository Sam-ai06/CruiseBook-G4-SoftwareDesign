package com.espol.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.espol.enums.estadoCabina;
import com.espol.enums.estadoReserva;
import com.espol.observer.Subscriber;

public class Cliente extends Usuario implements Subscriber {

  private List<Reserva> reservas = new ArrayList<>();

  public Cliente(String nombre, String telefono, String mail, String usuario, String contrasenia) {
    super(nombre, telefono, mail, usuario, contrasenia);
    // inicializar lista de reservas
    this.reservas = new ArrayList<>();
  }

  // métodos propios
  public Crucero buscarCrucero(String destino, String fechaSalida, String fechaLlegada, int duracionDias){
    // to do: delegar a un servicio que filtre cruceros por parámetros
    return new Crucero(); //NO FINAL
  }

  // reservar una cabina
  public Reserva reservarCabina(Cabina cabina, Crucero crucero){
    if (cabina == null) {
      throw new IllegalArgumentException("Cabina no puede ser nula");
    }
    if (crucero == null) {
      throw new IllegalArgumentException("Crucero no puede ser nulo");
    }

    // solo reservar si la cabina está disponible
    if (cabina.getEstado() != estadoCabina.DISPONIBLE) {
      return null; // o lanzar excepción según preferencia
    }

    // Crear una reserva mínima usando el constructor vacío y setters
    Reserva reserva = new Reserva();
    reserva.setCliente(this);
    // No siempre hay un objeto Viaje asociado directamente en Crucero hoy (métodos TODO),
    // así que dejamos viaje como null hasta que exista la lógica para obtenerlo.
    reserva.setCabina(cabina);
    reserva.setEstadoReserva(estadoReserva.PENDIENTE);
    reserva.setFechaCreacion(LocalDateTime.now());
    // Tarifa mínima; se puede calcular con lógica de negocio más adelante
    Tarifa tarifa = new Tarifa(0.0);
    reserva.setTarifa(tarifa);

    // marcar cabina como reservada y añadir la reserva al historial del cliente
    cabina.setEstado(estadoCabina.RESERVADA);
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
