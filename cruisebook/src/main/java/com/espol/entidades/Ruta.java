package com.espol.entidades;

import java.util.List;
import java.util.stream.Collectors;

public class Ruta {

    private final String origen;
    private final List<Destino> destinos;
    private final List<String> escalas;

    public Ruta(String origen, List<Destino> destinos, List<String> escalas) {
        this.origen = origen;
        this.destinos = destinos;
        this.escalas = escalas;
    }

    public String getOrigen() {
        return origen;
    }

    public List<Destino> getDestinos() {
        return List.copyOf(destinos);
    }

    public List<String> getEscalas() {
        return List.copyOf(escalas);
    }

    public String obtenerResumenRuta() {
        return """
               Origen: %s
               Destinos: %s
               Escalas: %s
               """.formatted(
                origen,
                obtenerDestinosComoTexto(),
                String.join(", ", escalas)
        );
    }

    private String obtenerDestinosComoTexto() {
        return destinos.stream()
                        .map(d -> d.obtenerDescripcion())
                        .collect(Collectors.joining(", "));
    }
}

