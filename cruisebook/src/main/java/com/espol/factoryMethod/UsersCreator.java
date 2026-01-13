package com.espol.factoryMethod;

import com.espol.entidades.Usuario;
import com.espol.entidades.DatosUser;

public abstract class UsersCreator {

    public abstract Usuario createUser(DatosUser datos);
}
