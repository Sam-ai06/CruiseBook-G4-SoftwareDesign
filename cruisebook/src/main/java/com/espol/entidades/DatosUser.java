package com.espol.entidades;


//aqui agrupamos los datos que se repiten en Usuario y sus subclases
public class DatosUser {
    private String nombre;
    private Telefono telefono; 
    private Email mail;       
    private String user;
    private String pass;

    public DatosUser(String nombre, Telefono telefono, Email mail, String user, String pass) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.user = user;
        this.pass = pass;
    }

    //getters
    public String getNombre() { return nombre; }
    public Telefono getTelefono() { return telefono; }
    public Email getMail() { return mail; }
    public String getUser() { return user; }
    public String getPassword() { return pass; }
}