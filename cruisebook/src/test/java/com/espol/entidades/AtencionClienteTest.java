package com.espol.entidades;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AtencionClienteTest {
    private AtencionCliente atencion;

    @BeforeEach
    void setUp() {
        atencion = new AtencionCliente(
                "Maria",
                new Telefono("0987"),
                new Email("m@test.com"),
                "maria",
                "123",
                "Soporte",
                2
        );
    }

    @Test
    void testConstructorValoresPorDefecto() {
        AtencionCliente ac = new AtencionCliente(
                "Ana", new Telefono("0888"), new Email("ana@test.com"),
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
