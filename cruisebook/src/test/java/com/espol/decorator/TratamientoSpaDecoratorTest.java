package com.espol.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.espol.entidades.ReservaBasica;

public class TratamientoSpaDecoratorTest {
    @Test
    void testSpaDecorator() {
        ReservaBasica base = new ReservaBasica(500.0);
        TratamientoSpaDecorator decorador = new TratamientoSpaDecorator(base, 80.0);
        
        // Assert para verificar suma
        assertEquals(580.0, decorador.calcularTotal());
    }
}
