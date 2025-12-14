package com.espol.factoryMethod;

import com.espol.entidades.AtencionCliente;
import com.espol.entidades.Usuario;

public class AtencionClienteCreator extends UsuarioCreator {

    @Override
    public Usuario crearUsuario(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia
    ) {
        return new AtencionCliente(nombre, telefono, mail, usuario, contrasenia);
    }
}