package com.espol.entidades;

import com.espol.interfaces.ValidadorCredenciales;
import com.espol.interfaces.autenticable;
import com.espol.enums.medioNotif;
import com.espol.observer.Subscriber;

public abstract class Usuario implements Subscriber  {
 protected DatosUser datos; //refactoring

  //constructor
    //ahora el constructor recibe el objeto completo
  public Usuario(DatosUser datos) {
    this.datos = datos;
  }

  //getters
  public String getNombre() { return datos.getNombre(); }
  public Telefono getTelefono() { return datos.getTelefono(); }
  public Email getMail() { return datos.getMail(); }
  public String getUsuario() { return datos.getUser(); }
  public String getPass() { return datos.getPassword(); }

  public void update(String mensaje) {
    System.out.println("Notificación para " + getNombre() + ": " + mensaje);
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
