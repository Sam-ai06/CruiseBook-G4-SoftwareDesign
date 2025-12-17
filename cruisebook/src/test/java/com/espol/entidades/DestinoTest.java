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
}
