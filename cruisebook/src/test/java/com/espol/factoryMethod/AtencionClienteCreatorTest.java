package com.espol.factoryMethod;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.AtencionCliente;
import com.espol.entidades.Usuario;

public class AtencionClienteCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new AtencionClienteCreator();

        Usuario user = creator.createUser(
                "Ana", "099", "a@test.com", "ana", "123"
        );

        assertNotNull(user);
        assertTrue(user instanceof AtencionCliente);
    }
}
