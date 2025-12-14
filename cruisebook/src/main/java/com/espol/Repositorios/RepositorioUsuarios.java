package com.espol.Repositorios;

import java.util.ArrayList;
import java.util.List;

import com.espol.entidades.Cliente;
import com.espol.entidades.Gerencia;
import com.espol.entidades.Operador;
import com.espol.entidades.Usuario;
import com.espol.interfaces.iRepositorioUsuarios;

public class RepositorioUsuarios implements iRepositorioUsuarios{
  private final List<Usuario> usuarios;

  public RepositorioUsuarios(List<Usuario> usuarios) {
    this.usuarios = usuarios;
    this.cargarDatos();
  }

  private void cargarDatos(){
    usuarios.add(new Operador("Samuel", "0967023910", "sammyvilla3006@gmail.com", "samvr", "1234"));
    usuarios.add(new Gerencia("paula", "0993191139", "pauvbn@gmail.com", "pauvbn", "1234", "Finanzas"));
    usuarios.add(new Cliente("Abigail", "0991101231", "ejemplo@gmail.com", "abicruz", "4356"));
    //más datos
  }

  @Override
  public Usuario buscarCredenciales(String user, String password) {
    for (Usuario u : usuarios) {
      if (u.getUsuario().equals(user) && u.getContrasenia().equals(password)) {
        return u;
      }
    }
    return null;
  }

  @Override
  public void agregar(Usuario user) {
    usuarios.add(user);
  }

  @Override
  public List<Usuario> obtenerUsuarios() {
    return new ArrayList<>(usuarios);
  }

  
}
