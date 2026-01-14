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
        Tarifa tar = new Tarifa(200);
        assertEquals(200, tar.getPrecioTotal());
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
    void testAgregarServicioCalculateTotal(){
        ServicioAdicional servicioTest = new ServicioAdicional("test", 50.0) {
            @Override
            public double obtenerCosto() {
                return this.getPrecio();
            }
            
        };

        Tarifa tar = new Tarifa(10); //precio base puede cambiarse
        double antes = tar.getPrecioTotal();
        tar.agregarServicio(servicioTest);
        double total = tar.calcularTotal();
        

        assertEquals(servicioTest, tar);
    }

}
