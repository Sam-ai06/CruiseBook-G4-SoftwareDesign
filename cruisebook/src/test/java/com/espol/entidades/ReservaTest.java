package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.espol.enums.*;

import org.junit.jupiter.api.Test;

public class ReservaTest {

    @Test
    void testProcesarPago() {
        DatosUser datosLuis = new DatosUser("Luis", new Telefono("0991234567"), 
            new Email("l@test.com"), "luis", "123"
        );

        Cliente cliente = new Cliente(datosLuis);
        Cabina cabina = new Cabina("C1", tipoCabina.SUITE, estadoCabina.RESERVADA);
        Tarifa tarifa = new Tarifa(100);

        Reserva reserva = new Reserva(cliente, null, cabina, tarifa);

        Pago pago = new Pago(100, "Tarjeta", Pago.EstadoPago.EXITOSO);

        boolean resultado = reserva.procesarPago(pago);

        assertTrue(resultado);
        assertEquals(estadoReserva.CONFIRMADA, reserva.getEstado());
    }

    @Test
    void ValidarObserverSetter() {
        DatosUser datosAlejandro = new DatosUser("alejandro", new Telefono("0932038771"),
            new Email("testn@testing.com"), "alejo", "123");

        Cliente cliente = new Cliente(datosAlejandro);
        Cabina cabina = new Cabina("A1", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Tarifa tarifa = new Tarifa(150);
        Ruta ruta = new Ruta("R1", new ArrayList<>(), new ArrayList<>());
        Viaje viaje = new Viaje(LocalDate.of(2026, 2, 3), 7, ruta, List.of(cabina));
        Reserva reserva = new Reserva(cliente, viaje, cabina, tarifa);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        try {
            reserva.setEstado(estadoReserva.CONFIRMADA);
        } finally {
            System.setOut(original);
        }

        String consola = out.toString();
        assertTrue(consola.contains("La reserva ha cambiado"), "No se notificó el cambio por consola");
        assertTrue(consola.contains("CONFIRMADA"), "No aparece el nuevo estado en la notificación");
    }

    @Test
    void testObtenerDescripcionReserva() {
        DatosUser datosJuan = new DatosUser(
            "Juan",
            new Telefono("0912345678"),
            new Email("juan@test.com"),
            "juan",
            "123"
        );

        Cliente cliente = new Cliente(datosJuan);
        Cabina cabina = new Cabina("B1", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Tarifa tarifa = new Tarifa(80);

        Reserva reserva = new Reserva(cliente, null, cabina, tarifa);

        String descripcion = reserva.obtenerDescripcion();

        assertEquals("Reserva para Juan", descripcion);
    }
}
