package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AtencionClienteTest {
    private AtencionCliente atencion;

    @BeforeEach
    void setUp() {
        atencion = new AtencionCliente(
                "Maria",
                "0987",
                "m@test.com",
                "maria",
                "123",
                "Soporte",
                2
        );
    }

    @Test
    void testConstructorValoresPorDefecto() {
        AtencionCliente ac = new AtencionCliente(
                "Ana", "0888", "ana@test.com",
                "ana", "abcd"
        );

        assertEquals("Atención al Cliente", ac.getArea());
        assertEquals(1, ac.getNivelSoporte());

    }

    @Test
    void testSetArea() {
        atencion.setArea("Reclamos");
        assertEquals("Reclamos", atencion.getArea());
    }

    @Test
    void testSetNivelSoporte() {
        atencion.setNivelSoporte(3);
        assertEquals(3, atencion.getNivelSoporte());
    }
}
