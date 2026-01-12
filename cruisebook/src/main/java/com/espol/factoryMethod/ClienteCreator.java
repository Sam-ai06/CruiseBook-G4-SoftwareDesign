package com.espol.factoryMethod;

import com.espol.entidades.Cliente;
import com.espol.entidades.Usuario;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;

public class ClienteCreator extends UsersCreator {

    @Override
    public Usuario createUser(
            String nombre,
            Telefono telefono,
            Email mail,
            String usuario,
            String contrasenia
    ) {
        return new Cliente(nombre, telefono, mail, usuario, contrasenia);
    }
}
