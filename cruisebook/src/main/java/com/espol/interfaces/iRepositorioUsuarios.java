package com.espol.interfaces;

import java.util.List;

import com.espol.entidades.Usuario;

public interface iRepositorioUsuarios {
  Usuario buscarCredenciales(String user, String password);
  void agregar(Usuario user);
  List<Usuario> obtenerUsuarios();

}
