package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;
import com.espol.enums.*;

import org.junit.jupiter.api.Test;

public class ViajeTest {
    @Test
    void testObtenerCabinasDisponibles() {
        Cabina c1 = new Cabina("C1", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Cabina c2 = new Cabina("C2", tipoCabina.SUITE, estadoCabina.OCUPADA);

        Viaje viaje = new Viaje(
                LocalDate.now(), 5, null, List.of(c1, c2)
        );

        List<Cabina> disponibles = viaje.obtenerCabinasDisponibles(tipoCabina.SUITE);

        assertEquals(1, disponibles.size());
        assertEquals("C1", disponibles.get(0).getNumeroCabina());
    }

    @Test
    void obtenerCabinasDisponibles_filtraPorTipoYEstado() {
        Cabina c1 = new Cabina("1", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Cabina c2 = new Cabina("2", tipoCabina.SUITE, estadoCabina.RESERVADA);
        Cabina c3 = new Cabina("3", tipoCabina.INTERIOR, estadoCabina.DISPONIBLE);

        Viaje viaje = new Viaje(
                LocalDate.now(),
                7,
                null,
                List.of(c1, c2, c3)
        );

        List<Cabina> disponibles = viaje.obtenerCabinasDisponibles(tipoCabina.SUITE);

        assertEquals(1, disponibles.size());
        assertEquals("1", disponibles.get(0).getNumeroCabina());
    }

    @Test
    void ObtenercabinasDisponibles_tipoSuite(){
        Cabina c1 = new Cabina("1", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Cabina c2 = new Cabina("2", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
        Cabina c3 = new Cabina("3", tipoCabina.INTERIOR, estadoCabina.RESERVADA);

        Viaje viaje = new Viaje(
                LocalDate.now(),
                7,
                null,
                List.of(c1, c2, c3)
        );
        List<Cabina> disponibles = viaje.obtenerCabinasDisponibles(tipoCabina.SUITE);
        assertEquals(1, disponibles.size());
        assertEquals("1", disponibles.get(0).getNumeroCabina());
    }
    
}
