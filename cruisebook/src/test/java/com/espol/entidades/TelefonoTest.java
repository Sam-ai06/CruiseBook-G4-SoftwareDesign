package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TelefonoTest{
    @Test
    void testTelefonoFormatoNumerico() { 
        Telefono tel = new Telefono("0998887776");
        assertTrue(tel.getNumero().matches("\\d+"));
    }

    void testTelefonoLongitudInsuficiente(){
        assertThrows(IllegalArgumentException.class, () -> new Telefono("123"));
    }
}