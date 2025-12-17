package com.espol.entidades;

import com.espol.enums.estadoCabina;
import com.espol.enums.tipoCabina;

public class Cabina {
  private String numeroCabina;
  private tipoCabina tipo;
  private estadoCabina estado;


  public Cabina(String numeroCabina, tipoCabina tipo, estadoCabina estado) {
    this.numeroCabina = numeroCabina;
    this.tipo = tipo;
    this.estado = estado;
  }

  //reservar una cabina
  public void reservarCabina(){
    //to do
  }

  //liberar la cabina y cambiar su estado a disponible
  public void liberarCabina(){
    //to do
  }

  //enviar cabina a mantenimiento y cambiar su estado
  public void enviarAMantenimiento(){
    //to do
  }

  //getters y setters
  public String getNumeroCabina() {
    return numeroCabina;
  }


  public void setNumeroCabina(String numeroCabina) {
    this.numeroCabina = numeroCabina;
  }


  public tipoCabina getTipo() {
    return tipo;
  }


  public void setTipo(tipoCabina tipo) {
    this.tipo = tipo;
  }


  public estadoCabina getEstado() {
    return estado;
  }


  public void setEstado(estadoCabina estado) {
    this.estado = estado;
  }

}
