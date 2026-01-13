package com.espol.factoryMethod;

import com.espol.entidades.Gerencia;
import com.espol.entidades.Usuario;
import com.espol.entidades.DatosUser;


public class GerenciaCreator extends UsersCreator {

    private String departamento;

    public GerenciaCreator(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public Usuario createUser(DatosUser datos) {
        return new Gerencia(
                datos, departamento
        );
    }
}

