package com.espol.entidades;

import com.espol.enums.estadoCabina;

public class Operador extends Usuario {

  // Constructor actualizado con el objeto DatosUser
  public Operador(DatosUser datos) {
    super(datos);
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
