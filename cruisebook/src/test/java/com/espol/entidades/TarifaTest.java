package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TarifaTest {
    @Test
    void tarifaInicial_precioTotalIgualBase() {
        Tarifa tarifa = new Tarifa(200);
        assertEquals(200, tarifa.getPrecioTotal());
    }
}
