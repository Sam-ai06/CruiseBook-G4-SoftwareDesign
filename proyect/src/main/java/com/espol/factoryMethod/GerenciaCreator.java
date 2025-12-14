package com.espol.factoryMethod;

import com.espol.entidades.Gerencia;
import com.espol.entidades.Usuario;

public class GerenciaCreator extends UsuarioCreator {

    private String departamento;

    public GerenciaCreator(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public Usuario crearUsuario(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia
    ) {
        return new Gerencia(
                nombre, telefono, mail, usuario, contrasenia, departamento
        );
    }
}

