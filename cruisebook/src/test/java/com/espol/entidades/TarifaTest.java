package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TarifaTest {

    private Tarifa tarifa;

    @BeforeEach
    void setUp() {
        tarifa = new Tarifa(100.0);
    }

    @Test
    void testTarifaInicialPrecioBase() {
        Tarifa tar = new Tarifa(200.0);
        assertEquals(200.0, tar.getPrecioTotal());
    }

    @Test
    void testSetPrecioBase() {
        tarifa.setPrecioBase(150.0);
        assertEquals(150.0, tarifa.getPrecioBase());
    }

    @Test
    void testCalcularTotalSinServicios() {
        double total = tarifa.calcularTotal();
        assertEquals(100.0, total);
        assertEquals(100.0, tarifa.getPrecioTotal());
    }

    @Test
    void testCalcularTotalConServicioAdicional() {
        ServicioAdicional servicio = new ServicioAdicional("Servicio", 20.0) {
            @Override
            public double obtenerCosto() {
                return this.getPrecio();
            }
        };

        tarifa.agregarServicio(servicio);

        double total = tarifa.calcularTotal();

        assertEquals(120.0, total);
    }
}

