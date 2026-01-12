package com.espol.factoryMethod;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;

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
                "Carlos", new Telefono("088"), new Email("c@test.com"), "carlos", "123"
        );

        assertNotNull(user);
        assertTrue(user instanceof Cliente);
    }
}
