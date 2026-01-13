package com.espol.entidades;

public class AtencionCliente extends Usuario {

    private String area;
    private int nivelSoporte;

    //constructor actualizado con el objeto DatosUser
    public AtencionCliente(DatosUser datos, String area, int nivelSoporte){
        super(datos);
        this.area = area;
        this.nivelSoporte = nivelSoporte;
    }

    //constructor actualizado con el objeto DatosUser
    public AtencionCliente(DatosUser datos) {
        super(datos);
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
    public void resolverIncidente(Incidente incidente) {
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
