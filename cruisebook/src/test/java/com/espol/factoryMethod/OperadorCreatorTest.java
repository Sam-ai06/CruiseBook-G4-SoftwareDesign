package com.espol.factoryMethod;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
import com.espol.entidades.DatosUser;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.Operador;
import com.espol.entidades.Usuario;

public class OperadorCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new OperadorCreator();

        DatosUser datosJuan = new DatosUser("Juan", new Telefono("0661234567"), 
            new Email("j@test.com"), "juan", "123"
        );

        Usuario user = creator.createUser(datosJuan);

        // verificaciones
        assertNotNull(user, "El objeto operador no deberia ser nulo");
        assertTrue(user instanceof Operador, "La factoria debería retornar una instancia de Operador");
    }
}
