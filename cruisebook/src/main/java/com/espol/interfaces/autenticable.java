package com.espol.interfaces;

import com.espol.entidades.Usuario;

public interface autenticable {

  Usuario login(String user, String password);
  void logout(Usuario user);
  Usuario registrar(String nombre, String telefono, String email, String user, String password);

}
