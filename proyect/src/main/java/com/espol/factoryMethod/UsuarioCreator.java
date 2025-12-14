package com.espol.factoryMethod;

import com.espol.entidades.Usuario;

public abstract class UsuarioCreator {

    public abstract Usuario crearUsuario(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia
    );
}
