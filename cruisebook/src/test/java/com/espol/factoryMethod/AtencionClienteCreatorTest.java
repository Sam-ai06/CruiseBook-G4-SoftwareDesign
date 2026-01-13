package com.espol.factoryMethod;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
import com.espol.entidades.DatosUser;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.espol.entidades.AtencionCliente;
import com.espol.entidades.Usuario;

public class AtencionClienteCreatorTest {
    @Test
    void testCreateUser() {
        UsersCreator creator = new AtencionClienteCreator();

        // REFACTOR: Creamos el objeto de datos que ahora requiere la fábrica
        DatosUser datosAna = new DatosUser("Ana", new Telefono("0991234567"), 
            new Email("a@test.com"), "ana", "123"
        );

        Usuario user = creator.createUser(datosAna);

        // verificaciones
        assertNotNull(user, "El usuario creado no debería ser nulo");
        assertTrue(user instanceof AtencionCliente, "El usuario debería ser una instancia de AtencionCliente");
    }
}
