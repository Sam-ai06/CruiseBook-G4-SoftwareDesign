package com.espol.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class RutaTest {

    @Test
    void testObtenerResumenRuta() {

        // Destinos válidos
        ArrayList<Destino> destinos = new ArrayList<>();
        destinos.add(new Destino("Guayaquil", "Ciudad portuaria", "Ecuador"));
        destinos.add(new Destino("Quito", "Capital del país", "Ecuador"));

        // Escalas
        ArrayList<String> escalas = new ArrayList<>();
        escalas.add("Cuenca");
        escalas.add("Ambato");

        Ruta ruta = new Ruta("Manta", destinos, escalas);

        // Ejecución
        String resultado = ruta.obtenerResumenRuta();

        // Resultado esperado
        String esperado =
            "Origen: Manta\n" +
            "Destinos: Guayaquil, Quito\n" +
            "Escalas: Cuenca, Ambato";

        assertEquals(esperado, resultado);
    }
}
