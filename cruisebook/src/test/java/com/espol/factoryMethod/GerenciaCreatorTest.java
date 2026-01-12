package com.espol.factoryMethod;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.Gerencia;
import com.espol.entidades.Usuario;

public class GerenciaCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new GerenciaCreator("Finanzas");

        Usuario user = creator.createUser(
                "Laura", new Telefono("077"), new Email("l@test.com"), "laura", "123"
        );

        assertNotNull(user);
        assertTrue(user instanceof Gerencia);

    }
}
