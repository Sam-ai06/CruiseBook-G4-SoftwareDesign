package com.espol.observer;

import com.espol.enums.medioNotif;

public interface Subscriber {
    void update(String mensaje, medioNotif medio);
}