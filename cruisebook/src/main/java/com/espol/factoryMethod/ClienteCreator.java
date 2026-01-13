package com.espol.factoryMethod;

import com.espol.entidades.Cliente;
import com.espol.entidades.Usuario;
import com.espol.entidades.DatosUser;


public class ClienteCreator extends UsersCreator {

    @Override
    public Usuario createUser(DatosUser datos) {
        return new Cliente(datos);
    }
}
