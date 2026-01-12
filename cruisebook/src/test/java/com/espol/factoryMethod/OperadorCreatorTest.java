package com.espol.factoryMethod;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.Operador;
import com.espol.entidades.Usuario;

public class OperadorCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new OperadorCreator();

        Usuario user = creator.createUser(
                "Juan", new Telefono("066"), new Email("j@test.com"), "juan", "123"
        );

        assertNotNull(user);
        assertTrue(user instanceof Operador);
    }
}
