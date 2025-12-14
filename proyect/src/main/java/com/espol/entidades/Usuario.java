package com.espol.entidades;

import com.espol.interfaces.ValidadorCredenciales;
import com.espol.interfaces.autenticable;

public class Usuario {// implements autenticable{
  private String nombre;
  private String telefono;
  private String mail;
  private String usuario;
  private String contrasenia;

  //constructor
  public Usuario(String nombre, String telefono, String mail, String usuario, String contrasenia) {
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

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
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
