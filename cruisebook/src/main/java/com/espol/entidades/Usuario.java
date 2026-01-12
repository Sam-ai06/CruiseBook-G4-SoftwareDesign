package com.espol.entidades;

import com.espol.interfaces.ValidadorCredenciales;
import com.espol.interfaces.autenticable;
import com.espol.enums.medioNotif;
import com.espol.observer.Subscriber;

public abstract class Usuario implements Subscriber  {
  private String nombre;
  private Telefono telefono;
  private Email mail;
  private String usuario;
  private String contrasenia;

  //constructor
  public Usuario(String nombre, Telefono telefono, Email mail, String usuario, String contrasenia) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.mail = mail;
    this.usuario = usuario;
    this.contrasenia = contrasenia;
  }

    //getters y setters


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Telefono getTelefono() {
    return telefono;
  }

  public void setTelefono(Telefono telefono) {
    this.telefono = telefono;
  }

  public Email getMail() {
    return mail;
  }

  public void setMail(Email mail) {
    this.mail = mail;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getContrasenia() {
    return contrasenia;
  }

  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }

  //uso de abstracciones
  private ValidadorCredenciales validador;

  public void update(String mensaje) {
    System.out.println("Notificación para " + nombre + ": " + mensaje);
  }

  /*//login y logout
  @Override
  public Usuario login(String user, String pass){
     return validador.validar(user, pass);
  }

  @Override
  public boolean logout(){
    //to do
    return true;
  }

  @Override
  public Usuario registrar(String nombre, String telefono, String email, String user, String password) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'registrar'");
  }
    */
}
