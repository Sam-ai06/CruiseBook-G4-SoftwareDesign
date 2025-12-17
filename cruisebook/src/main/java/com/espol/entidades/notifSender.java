package com.espol.entidades;

import java.util.ArrayList;
import java.util.List;
import com.espol.observer.Subject;
import com.espol.observer.Subscriber;

public class notifSender implements Subject {
    private List<Subscriber> subs = new ArrayList<>();

    @Override
    public void subscribe(Subscriber s) { subs.add(s); }
    @Override
    public void unsubscribe(Subscriber s) { subs.remove(s); }

    public void notifySubscribers(String msg) {
        for (Subscriber s : subs) {
            s.update(msg);
        }
    }
}

