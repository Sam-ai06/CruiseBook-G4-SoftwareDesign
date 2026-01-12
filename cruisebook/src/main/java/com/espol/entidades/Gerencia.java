package com.espol.entidades;

public class Gerencia extends Usuario {

  private String departamento;

  // Constructor
  public Gerencia(String nombre, Telefono telefono, Email mail, String usuario, String contrasenia, String departamento) {
    super(nombre, telefono, mail, usuario, contrasenia);
    this.departamento = departamento;
  }

  // Getter y Setter
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  // Métodos principales
  public void resolverIncidente(Incidente incidente) {
    // to do
  }

  public void aprobarReembolso(Reserva reserva) {
    // to do
  }

  public void revisarPoliticas(PoliticaCancelacion politica) {
    // to do
  }

}
