package com.espol.factoryMethod;

import com.espol.entidades.Operador;
import com.espol.entidades.Usuario;

public class OperadorCreator extends UsersCreator {

    @Override
    public Usuario createUser(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia
    ) {
        return new Operador(nombre, telefono, mail, usuario, contrasenia);
    }
}
