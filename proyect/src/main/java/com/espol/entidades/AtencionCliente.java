package com.espol.entidades;

public class AtencionCliente extends Usuario {

    private String area;
    private int nivelSoporte;

    //constructor
    public AtencionCliente(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia,
            String area,
            int nivelSoporte
    ) {
        super(nombre, telefono, mail, usuario, contrasenia);
        this.area = area;
        this.nivelSoporte = nivelSoporte;
    }

    //onstructor 
    public AtencionCliente(
            String nombre,
            String telefono,
            String mail,
            String usuario,
            String contrasenia
    ) {
        super(nombre, telefono, mail, usuario, contrasenia);
        this.area = "Atención al Cliente";
        this.nivelSoporte = 1;
    }

    //getters y setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNivelSoporte() {
        return nivelSoporte;
    }

    public void setNivelSoporte(int nivelSoporte) {
        this.nivelSoporte = nivelSoporte;
    }

    //metodos propios
    public void atenderIncidente(Incidente incidente) {
        if (incidente != null) {
            System.out.println(
                "Atención al Cliente está revisando el incidente: "
                + incidente.getDescripcion()
            );
        }
    }

    public void derivarIncidenteAGerencia(Incidente incidente) {
        if (incidente != null) {
            System.out.println(
                "Incidente derivado a Gerencia para resolución final."
            );
        }
    }
}
