package com.espol.entidades;

import java.util.ArrayList;
import java.util.List;

import com.espol.observer.Subject;
import com.espol.observer.Subscriber;

public class Notificadora implements Subject {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscribers(String mensaje) {
        for (Subscriber s : subscribers) {
            s.update(mensaje, null);
        }
    }
}
