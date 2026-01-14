package com.espol.entidades;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
import com.espol.entidades.DatosUser;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AtencionClienteTest {
    private AtencionCliente atencion;

    @BeforeEach
    void setUp() {
        DatosUser datos = new DatosUser("Maria", new Telefono("0987654321"),
            new Email("m@test.com"), "maria", "123"
        );
        
        atencion = new AtencionCliente(datos, "Soporte", 2);
    }

    @Test
    void testConstructorValoresPorDefecto() {
        DatosUser datosAna = new DatosUser("Ana", new Telefono("0888123456"),
            new Email("ana@test.com"), "ana",  "abcd"
        );
        
        AtencionCliente ac = new AtencionCliente(datosAna);

        assertEquals("Atención al Cliente", ac.getArea());
        assertEquals(1, ac.getNivelSoporte());
        assertEquals("Ana", ac.getNombre());
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

    @Test
    void testIncidenteNull() {
        assertDoesNotThrow(() -> {
            atencion.resolverIncidente(null);
        });
    }

    @Test
    void testConstructorConParametros() {
        DatosUser datos = new DatosUser(
            "Carlos",
            new Telefono("0999999999"),
            new Email("c@test.com"),
            "carlos",
            "pass123"
        );  
        AtencionCliente ac = new AtencionCliente(datos, "Reclamos", 3);

        assertEquals("Carlos", ac.getNombre());
        assertEquals("Reclamos", ac.getArea());
        assertEquals(3, ac.getNivelSoporte());
    }
}
