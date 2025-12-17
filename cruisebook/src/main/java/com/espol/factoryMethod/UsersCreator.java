package com.espol.factoryMethod;

import com.espol.entidades.Usuario;

public abstract class UsersCreator {

    public abstract Usuario createUser(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia
    );
}
