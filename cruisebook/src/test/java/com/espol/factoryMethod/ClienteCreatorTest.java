package com.espol.factoryMethod;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.Cliente;
import com.espol.entidades.Usuario;
import com.espol.entidades.DatosUser;

public class ClienteCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new ClienteCreator();

        DatosUser datosCarlos = new DatosUser("Carlos", new Telefono("0881234567"), 
            new Email("c@test.com"), "carlos", "123"
        );

        Usuario user = creator.createUser(datosCarlos);

        // verificaciones
        assertNotNull(user, "El objeto usuario no debería ser nulo");
        assertTrue(user instanceof Cliente, "La factoría debería retornar una instancia de Cliente");
    }
}
