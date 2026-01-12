package com.espol.factoryMethod;

import com.espol.entidades.Usuario;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;

public abstract class UsersCreator {

    public abstract Usuario createUser(
            String nombre,
            Telefono telefono,
            Email mail,
            String usuario,
            String contrasenia
    );
}
