package com.espol.factoryMethod;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
import com.espol.entidades.DatosUser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.Gerencia;
import com.espol.entidades.Usuario;

public class GerenciaCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new GerenciaCreator("Finanzas");

        DatosUser datosLaura = new DatosUser("Laura", new Telefono("0771234567"), 
            new Email("l@test.com"), "laura", "123"
        );

        Usuario user = creator.createUser(datosLaura);

        // verificaciones
        assertNotNull(user, "El objeto gerente no deberia ser nulo");
        assertTrue(user instanceof Gerencia, "Debe ser una instancia de Gerencia");
        
        Gerencia gerente = (Gerencia) user;
        assertEquals("Finanzas", gerente.getDepartamento(), "El departamento debe coincidir con el de la fabrica");
    }
}
