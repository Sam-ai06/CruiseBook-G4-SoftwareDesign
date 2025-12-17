package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AtencionClienteTest {

    @Test
    void testConstructorValoresPorDefecto() {
        AtencionCliente ac = new AtencionCliente(
                "Ana", "0888", "ana@test.com",
                "ana", "abcd"
        );

        assertEquals("Atención al Cliente", ac.getArea());
        assertEquals(1, ac.getNivelSoporte());

    }
}
