package com.espol.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.ReservaBasica;

public class ExcursionDecoratorTest {
    @Test
    void testDecoradoExcursion() {
        ReservaBasica base = new ReservaBasica(500.0);
        ExcursionDecorator decorador = new ExcursionDecorator(base, 100.0);
        
        // Assert para verificar suma
        assertEquals(600.0, decorador.calcularTotal());
        
        // Assert para verificar la descripción extendida
        assertTrue(decorador.obtenerDescripcion().contains("Excursión"));
    }
}
