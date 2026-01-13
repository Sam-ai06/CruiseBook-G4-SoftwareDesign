package com.espol.entidades;

import com.espol.enums.estadoCabina;
import com.espol.enums.tipoCabina;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CabinaTest {

  @Test
  public void testCabinaConstructor() {
    String numeroCabina = "A101";
    tipoCabina tipo = tipoCabina.SUITE;
    estadoCabina estado = estadoCabina.DISPONIBLE;
    
    Cabina cabina = new Cabina(numeroCabina, tipo, estado);
    
    assertEquals(numeroCabina, cabina.getNumeroCabina());
    assertEquals(tipo, cabina.getTipo());
    assertEquals(estado, cabina.getEstado());
  }

  @Test
  public void testSetNumeroCabina() {
    Cabina cabina = new Cabina("A101", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
    cabina.setNumeroCabina("B202");
    assertEquals("B202", cabina.getNumeroCabina());
  }

  @Test
  public void testSetTipo() {
    Cabina cabina = new Cabina("A101", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
    cabina.setTipo(tipoCabina.FAMILIAR);
    assertEquals(tipoCabina.FAMILIAR, cabina.getTipo());
  }

  @Test
  public void testSetEstado() {
    Cabina cabina = new Cabina("A101", tipoCabina.SUITE, estadoCabina.DISPONIBLE);
    cabina.setEstado(estadoCabina.RESERVADA);
    assertEquals(estadoCabina.RESERVADA, cabina.getEstado());
  }

  @Test
    void testCambioEstadoCabina() {
        Cabina cabina = new Cabina("B2", null, estadoCabina.DISPONIBLE);
        cabina.ocupar();
        assertSame(estadoCabina.OCUPADA, cabina.getEstado());
    }

}