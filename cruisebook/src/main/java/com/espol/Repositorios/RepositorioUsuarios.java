package com.espol.Repositorios;

import java.util.ArrayList;
import java.util.List;

import com.espol.entidades.Cliente;
import com.espol.entidades.Gerencia;
import com.espol.entidades.Operador;
import com.espol.entidades.Usuario;
import com.espol.interfaces.iRepositorioUsuarios;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
import com.espol.entidades.DatosUser;


public class RepositorioUsuarios implements iRepositorioUsuarios{
  private final List<Usuario> usuarios;

  public RepositorioUsuarios(List<Usuario> usuarios) {
    this.usuarios = usuarios;
    this.cargarDatos();
  }

  private void cargarDatos(){
    usuarios.add(new Operador(new DatosUser("Samuel", new Telefono("0967023910"), 
    new Email("sammyvilla3006@gmail.com"), "samvr", "1234")));

    usuarios.add(new Gerencia(new DatosUser("paula", new Telefono("0993191139"), 
    new Email("pauvbn@gmail.com"), "pauvbn", "1234"), "Finanzas")); 

    usuarios.add(new Cliente(new DatosUser("Abigail", new Telefono("0991101231"), 
    new Email("ejemplo@gmail.com"), "abicruz", "4356")));
  }
  

  @Override
  public Usuario buscarCredenciales(String user, String password) {
    for (Usuario u : usuarios) {
      if (u.getUsuario().equals(user) && u.getPass().equals(password)) {
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
