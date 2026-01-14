package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DestinoTest {
    @Test
    void testObtenerResumenRuta() {
        Destino d = new Destino("Manta", "Ciudad portuaria", "Ecuador");
        String resumen = d.obtenerResumenRuta();
        assertEquals("Manta, Ecuador - Ciudad portuaria", resumen);
    }

    @Test
    void testGettersSetters() {
        Destino d = new Destino("Lima", "Ciudad costera", "Perú");

        d.setDescripcion("Capital");
        d.setPais("PER");

        assertEquals("Capital", d.getDescripcion());
        assertEquals("PER", d.getPais());
    }
}