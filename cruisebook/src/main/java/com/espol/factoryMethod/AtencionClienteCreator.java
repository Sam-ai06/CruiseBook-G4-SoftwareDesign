package com.espol.factoryMethod;

import com.espol.entidades.AtencionCliente;
import com.espol.entidades.Email;
import com.espol.entidades.Usuario;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
public class AtencionClienteCreator extends UsersCreator {

    @Override
    public Usuario createUser(
            String nombre,
            Telefono telefono,
            Email mail,
            String usuario,
            String contrasenia
    ) {
        return new AtencionCliente(nombre, telefono, mail, usuario, contrasenia);
    }
}