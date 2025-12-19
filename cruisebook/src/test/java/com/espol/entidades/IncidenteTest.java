package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.espol.enums.estadoIncidente;

public class IncidenteTest {
    @Test
    void testConstructor() {
        Incidente i = new Incidente("Error en pago");

        assertEquals("Error en pago", i.getDescripcion());
        assertEquals(estadoIncidente.ABIERTO, i.getEstado());
    }

    @Test
    void testSetEstado() {
        Incidente i = new Incidente("Error en pago");

        i.setEstado(estadoIncidente.RESUELTO);
        assertEquals(estadoIncidente.RESUELTO, i.getEstado());
    }
}
