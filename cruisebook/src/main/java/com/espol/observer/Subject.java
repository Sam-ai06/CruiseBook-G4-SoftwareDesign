package com.espol.observer;

public interface Subject {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscribers(String mensaje);
}
