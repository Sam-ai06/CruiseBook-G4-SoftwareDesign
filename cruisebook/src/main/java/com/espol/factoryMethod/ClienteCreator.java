package com.espol.factoryMethod;

import com.espol.entidades.Cliente;
import com.espol.entidades.Usuario;

public class ClienteCreator extends UsuarioCreator {

    @Override
    public Usuario crearUsuario(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia
    ) {
        return new Cliente(nombre, telefono, mail, usuario, contrasenia);
    }
}
