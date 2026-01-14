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
        DatosUser datos = new DatosUser("Luis", new Telefono("0991234567"), 
            new Email("l@test.com"), "luis", "123"
        );
        
        cliente = new Cliente(datos);
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

    @Test
    void testReservarCabinaNull(){
        try {
            cliente.reservarCabina(null, new Crucero());
        } catch (IllegalArgumentException e) {
            assertEquals("La cabina no puede ser nula", e.getMessage());
        }

        try {
            Cabina cabina = new Cabina("C3", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
            cliente.reservarCabina(cabina, null);
        } catch (IllegalArgumentException e) {
            assertEquals("El crucero no puede ser nulo", e.getMessage());
        }
    }

    @Test
    void testReservarCabinaOcupada(){
        Cabina cabina = new Cabina("C4", tipoCabina.SUITE, estadoCabina.OCUPADA);
        Reserva reserva = cliente.reservarCabina(cabina, new Crucero());

        assertNull(reserva);
        assertTrue(cliente.getReservas().isEmpty());
    }


    @Test
    void testReservarCabinaDisponible(){
        Cabina cabina = new Cabina("C5", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Reserva reserva = cliente.reservarCabina(cabina, new Crucero());

        assertNotNull(reserva);
        assertEquals(1, cliente.getReservas().size());

    }

}
