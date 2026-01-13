package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
}
