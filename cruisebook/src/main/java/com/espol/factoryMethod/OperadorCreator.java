package com.espol.factoryMethod;

import com.espol.entidades.Operador;
import com.espol.entidades.Usuario;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
public class OperadorCreator extends UsersCreator {

    @Override
    public Usuario createUser(
            String nombre,
            Telefono telefono,
            Email mail,
            String usuario,
            String contrasenia
    ) {
        return new Operador(nombre, telefono, mail, usuario, contrasenia);
    }
}
