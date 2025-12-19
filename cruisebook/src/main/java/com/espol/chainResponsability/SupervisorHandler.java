package main.java.com.espol.chainResponsability;
import com.espol.entidades.Incidente;
import com.espol.enums.estadoIncidente;

public class SupervisorHandler extends ManejadorIncidente {
    
    @Override
    public boolean puedeManejar(Incidente incidente) {
        return incidente.getEstado() == estadoIncidente.EN_PROCESO && 
               incidente.getDescripcion().length() < 100;
    }
    
    @Override
    public void manejarIncidente(Incidente incidente) {
        if (puedeManejar(incidente)) {
            incidente.setEstado(estadoIncidente.RESUELTO);
            System.out.println("Incidente resuelto por Supervisor");
        } else {
            asignarAgente(incidente);
        }
    }
    
    private void asignarAgente(Incidente incidente) {
        System.out.println("SupervisorHandler: Escalando incidente a gerencia...");
        if (siguiente != null) {
            siguiente.manejarIncidente(incidente);
        }
    }
}
