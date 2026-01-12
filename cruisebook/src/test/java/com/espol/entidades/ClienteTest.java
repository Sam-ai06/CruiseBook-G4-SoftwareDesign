package com.espol.entidades;


import com.espol.enums.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Luis", new Telefono("099"), new Email("l@test.com"), "luis", "123");
    }

    @Test
    void testReservasVaciasAlInicio() {
        assertTrue(cliente.getReservas().isEmpty());
    }

    @Test
    void testReservarCabina() {
        Cabina cabina = new Cabina("C1", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Crucero crucero = new Crucero();

        Reserva reserva = cliente.reservarCabina(cabina, crucero);

        assertNotNull(reserva);
        assertEquals(1, cliente.getReservas().size());
    }

    @Test
    void testReservarCabinaNoDisponible() {
        Cabina cabina = new Cabina("C2", tipoCabina.SUITE, estadoCabina.OCUPADA);
        Reserva reserva = cliente.reservarCabina(cabina, new Crucero());

        assertNull(reserva);
        assertTrue(cliente.getReservas().isEmpty());
    }
}
