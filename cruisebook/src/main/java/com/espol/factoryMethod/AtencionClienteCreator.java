package com.espol.factoryMethod;

import com.espol.entidades.AtencionCliente;
import com.espol.entidades.Usuario;
import com.espol.entidades.DatosUser;

public class AtencionClienteCreator extends UsersCreator {

    @Override
    public Usuario createUser(DatosUser datos) {
        return new AtencionCliente(datos);
    }
}