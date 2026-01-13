package com.espol.entidades;

public class Gerencia extends Usuario {

  private String departamento;

  // Constructor actualizado con el objeto DatosUser
  public Gerencia(DatosUser datos, String departamento) {
        super(datos);
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
