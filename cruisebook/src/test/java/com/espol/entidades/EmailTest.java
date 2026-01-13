package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailTest {
    @Test
    void testEmailCompleto() {
        Email email = new Email("usuario@espol.edu.ec");
        assertEquals("usuario@espol.edu.ec", email.getDireccion());
    }

    @Test
    void testEmailCreado(){
        Email email = new Email("mathias@espol.com");
        assertNotNull(email.getDireccion());
    }

    @Test
    void testCorreosFormatoIncorrecto(){
        assertThrows(IllegalArgumentException.class, () -> new Email("usuario-dominio.com"));
    }
}
