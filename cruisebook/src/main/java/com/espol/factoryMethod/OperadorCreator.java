package com.espol.factoryMethod;

import com.espol.entidades.Operador;
import com.espol.entidades.Usuario;
import com.espol.entidades.DatosUser;
public class OperadorCreator extends UsersCreator {

    @Override
    public Usuario createUser(DatosUser dato) {
        return new Operador(dato);
    }
}
