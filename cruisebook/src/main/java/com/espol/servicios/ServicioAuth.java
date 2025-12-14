package com.espol.servicios;

import com.espol.entidades.Usuario;
import com.espol.interfaces.autenticable;
import com.espol.interfaces.iRepositorioUsuarios;

public class ServicioAuth implements autenticable {
  private final iRepositorioUsuarios repositorioUsuarios;

  
  public ServicioAuth(iRepositorioUsuarios repositorioUsuarios) {
    this.repositorioUsuarios = repositorioUsuarios;
  }

  @Override
  public Usuario login(String user, String password) {
    return repositorioUsuarios.buscarCredenciales(user, password);
  }

  @Override
  public void logout(Usuario usuario) {
    
    
    
  }

  @Override
  public Usuario registrar(String nombre, String telefono, String email, String user, String password) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'registrar'");
  }

}
