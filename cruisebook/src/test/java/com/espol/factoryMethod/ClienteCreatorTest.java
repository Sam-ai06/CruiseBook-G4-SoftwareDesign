package com.espol.factoryMethod;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.Cliente;
import com.espol.entidades.Usuario;

public class ClienteCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new ClienteCreator();

        Usuario user = creator.createUser(
                "Carlos", "088", "c@test.com", "carlos", "123"
        );

        assertNotNull(user);
        assertTrue(user instanceof Cliente);
    }
}
