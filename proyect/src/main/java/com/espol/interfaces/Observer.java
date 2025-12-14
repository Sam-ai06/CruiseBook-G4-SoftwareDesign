package com.espol.interfaces;

import com.espol.enums.medioNotif;

public interface Observer {
    void recibirNotificacion(String mensaje, medioNotif medio);
}
