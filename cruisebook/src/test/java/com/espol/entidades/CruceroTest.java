package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CruceroTest {
    @Test
    void testConstructor() {
        Ruta ruta = new Ruta("Guayaquil", null, null);
        Crucero crucero = new Crucero(1, "Crucero Caribe", ruta);

        assertEquals(1, crucero.getIdCrucero());
        assertEquals("Crucero Caribe", crucero.getNombre());
        assertEquals(ruta, crucero.getViaje());
    }

    @Test
    void testSettersYGetters() {
        Crucero crucero = new Crucero();

        crucero.setIdCrucero(5);
        crucero.setNombre("Crucero Pacífico");

        assertEquals(5, crucero.getIdCrucero());
        assertEquals("Crucero Pacífico", crucero.getNombre());
    }
}
