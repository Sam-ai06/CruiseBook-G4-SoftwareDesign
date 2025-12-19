package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DestinoTest {
    @Test
    void testObtenerResumenRuta() {
        Destino d = new Destino("Quito", "Capital", "Ecuador");
        String resumen = d.obtenerResumenRuta();
        assertEquals("Quito, Ecuador - Capital", resumen);
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
