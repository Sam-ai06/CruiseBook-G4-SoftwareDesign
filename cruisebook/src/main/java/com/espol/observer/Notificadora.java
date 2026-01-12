package com.espol.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Notificadora {
    private List<Subscriber> suscriptores = new ArrayList<>();

    public void suscribir(Subscriber s) { suscriptores.add(s); }
    public void desuscribir(Subscriber s) { suscriptores.remove(s); }

    public void enviarAlerta(String mensaje) {
        for (Subscriber s : suscriptores) {
            s.update(mensaje);
        }
    }
}