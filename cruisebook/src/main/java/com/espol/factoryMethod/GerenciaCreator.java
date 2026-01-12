package com.espol.factoryMethod;

import com.espol.entidades.Gerencia;
import com.espol.entidades.Usuario;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
public class GerenciaCreator extends UsersCreator {

    private String departamento;

    public GerenciaCreator(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public Usuario createUser(
            String nombre,
            Telefono telefono,
            Email mail,
            String usuario,
            String contrasenia
    ) {
        return new Gerencia(
                nombre, telefono, mail, usuario, contrasenia, departamento
        );
    }
}

