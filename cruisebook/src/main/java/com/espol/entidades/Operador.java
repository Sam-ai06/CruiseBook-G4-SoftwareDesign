package com.espol.entidades;

import com.espol.enums.estadoCabina;

public class Operador extends Usuario {

  // Constructor
  public Operador(String nombre, String telefono, String mail, String usuario, String contrasenia) {
    super(nombre, telefono, mail, usuario, contrasenia);
  }

  // Métodos principales
  public void definirPoliticaCancelacion(PoliticaCancelacion politica) {
    // to do
  }

  public void actualizarPoliticaReembolso(PoliticaCancelacion politica) {
    // to do
  }

  public void gestionarEstadoCabina(Cabina cabina, estadoCabina nuevoEstado) {
    // to do
  }

  //eliminado el método notificarUsuario ya que se encuentra en notifSender
}
