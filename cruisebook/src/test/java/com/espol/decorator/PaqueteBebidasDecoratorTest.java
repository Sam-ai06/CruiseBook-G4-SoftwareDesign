package com.espol.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.espol.entidades.ReservaBasica;

public class PaqueteBebidasDecoratorTest {
    @Test
    void testBebidasDecorator() {
        ReservaBasica base = new ReservaBasica(500.0);
        PaqueteBebidasDecorator decorador = new PaqueteBebidasDecorator(base, 50.0);
        
        // Assert para verificar suma
        assertEquals(550.0, decorador.calcularTotal());
    }
}
