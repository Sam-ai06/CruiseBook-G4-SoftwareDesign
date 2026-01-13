package com.espol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.espol.entidades.Cabina;
import com.espol.entidades.Cliente;
import com.espol.entidades.Crucero;
import com.espol.entidades.Gerencia;
import com.espol.entidades.Operador;
import com.espol.entidades.PoliticaCancelacion;
import com.espol.entidades.Reserva;
import com.espol.entidades.Tarifa;
import com.espol.entidades.Usuario;
import com.espol.entidades.notifSender;
import com.espol.enums.estadoCabina;
import com.espol.enums.tipoCabina;
import com.espol.factoryMethod.ClienteCreator;
import com.espol.factoryMethod.GerenciaCreator;
import com.espol.factoryMethod.OperadorCreator;
import com.espol.factoryMethod.UsersCreator;
import com.espol.entidades.Telefono;
import com.espol.entidades.Email;
import com.espol.entidades.DatosUser;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         //usuarios de ejemplo (adaptados a factory method)
        UsersCreator clienteCreator = new ClienteCreator();
        UsersCreator operadorCreator = new OperadorCreator();
        UsersCreator gerenciaCreator = new GerenciaCreator("Atención al cliente");

        Usuario cliente1 = clienteCreator.createUser(new DatosUser(
            "Samuel", new Telefono("0989765439"), new Email("samuel@mail.com"), "samuel", "1234"));

        Usuario operador1 = operadorCreator.createUser(new DatosUser(
            "Annie", new Telefono("0987654312"), new Email("annie@mail.com"), "annie", "abcd"));

        Usuario gerencia1 = gerenciaCreator.createUser(new DatosUser(
            "Mathias", new Telefono("0976543098"), new Email("mathias@mail.com"), "mathias", "4321"));
        
        List<Usuario> usuarios = new ArrayList<>(List.of(cliente1, operador1, gerencia1));
        Usuario usuarioLogueado = null;

        while (true) {
            System.out.println("\n=== SISTEMA CRUISEBOOK ===");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 2) break;

            if (op == 1) {
                System.out.print("Usuario: ");
                String user = sc.nextLine();
                System.out.print("Contraseña: ");
                String pass = sc.nextLine();

               for (Usuario u : usuarios) {
                    if (u.getUsuario().equals(user) && u.getPass().equals(pass)) {
                        usuarioLogueado = u;
                        System.out.println("Inicio de sesión exitoso. Bienvenido, " + u.getNombre());
                        break;
                    }
                }

                if (usuarioLogueado == null) {
                    System.out.println("Credenciales incorrectas. ¿Desea crear una cuenta? (s/n):");
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        //registro de nuevo cliente refactorizado
                        System.out.print("Nombre: "); String nombre = sc.nextLine();
                        System.out.print("Teléfono: "); String telf = sc.nextLine();
                        System.out.print("Email: "); String mail = sc.nextLine();
                        System.out.print("Usuario: "); String nUser = sc.nextLine();
                        System.out.print("Pass: "); String nPass = sc.nextLine();

                        //creamos el objeto DatosUser
                        DatosUser nuevosDatos = new DatosUser(nombre, new Telefono(telf), new Email(mail), nUser, nPass);
                        Cliente nuevoCliente = new Cliente(nuevosDatos);
                        usuarios.add(nuevoCliente);
                        
                        System.out.println("Cuenta creada exitosamente.");
                        continue;
                    }
                    } else {
                    //flujo de menús según tipo
                    if (usuarioLogueado instanceof Cliente cliente) menuCliente(cliente, sc);
                    else if (usuarioLogueado instanceof Operador operador) menuOperador(operador, sc);
                    else if (usuarioLogueado instanceof Gerencia gerencia) menuGerencia(gerencia, sc);
                    
                    usuarioLogueado = null; //logout
                    }
            }
        }
    }
                
        
    // --- Menús específicos ---
    
    private static void menuCliente(Cliente cliente, Scanner sc) {
        int opcion = 0;
        while (true) {
            System.out.println("\n*** MENÚ CLIENTE ***");
            System.out.println("1. Buscar crucero");
            System.out.println("2. Reservar cabina");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Fecha de salida: ");
                    String salida = sc.nextLine();
                    System.out.print("Fecha de llegada: ");
                    String llegada = sc.nextLine();
                    System.out.print("Duración (días): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    Crucero crucero = cliente.buscarCrucero(destino, salida, llegada, duracion);
                    System.out.println("Crucero encontrado: " + crucero);
                }
                case 2 -> {
                    System.out.println("Reserva de cabina (simulado)");
                    // logica de llamada a reservarCabina, to do
                }
                case 3 -> {
                    System.out.println("Cerrando sesión...");
                    return; 
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuOperador(Operador operador, Scanner sc) {
        while (true) {
            System.out.println("\n*** MENÚ OPERADOR ***");
            System.out.println("1. Gestionar estado de cabina");
            System.out.println("2. Enviar notificación");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    // Metodo ejemplificado, se podria pedir el numero de cabina para gestionarla
                    Cabina cabina = new Cabina("202", tipoCabina.FAMILIAR, estadoCabina.RESERVADA);
                    System.out.println("Estado actual: " + cabina.getEstado());         
                    operador.gestionarEstadoCabina(cabina, estadoCabina.DISPONIBLE);    
                    System.out.println("Cabina actualizada a: DISPONIBLE");
                }
                case 2 -> {
                    // Metodo simplificado, se pediria el usuario del cliente para enviar la notificacion
                    System.out.print("Mensaje: ");
                    String mensaje = sc.nextLine();
                    notifSender sender = new notifSender();
                    sender.subscribe(operador);
                    sender.notifySubscribers(mensaje);
                    System.out.println("Notificación enviada por correo.");
                }
                case 3 -> {
                    System.out.println("Cerrando sesión de operador...");
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuGerencia(Gerencia gerencia, Scanner sc) {
        System.out.println("\n*** MENÚ GERENCIA ***");
        System.out.println("1. Aprobar reembolso");
        System.out.println("2. Revisar políticas");
        System.out.println("3. Cerrar sesión");

        while (true) {
            System.out.println("\n** MENÚ GERENCIA **");
            System.out.println("1. Aprobar reembolso");
            System.out.println("2. Revisar políticas");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                        //cliente simulado
                        DatosUser datosPrueba = new DatosUser("Cliente Prueba", new Telefono("0000000000"), 
                            new Email("cliente@mail.com"), "cliente", "1234");
                        Cliente cliente = new Cliente(datosPrueba);

                        //cabina simulada
                        Cabina cabina = new Cabina("101",tipoCabina.INTERIOR,estadoCabina.RESERVADA);
                        //tarifa base
                        Tarifa tarifa = new Tarifa(100.0);
                        Reserva reserva = new Reserva(cliente,  null,cabina,tarifa);
                        gerencia.aprobarReembolso(reserva);
                        System.out.println("Reembolso aprobado correctamente.");
                    }
                case 2 -> {
                    PoliticaCancelacion politica = new PoliticaCancelacion("No hay reembolso si cancela despues de partir");
                    gerencia.revisarPoliticas(politica);
                    System.out.println("Política revisada y actualizada.");
                }
                case 3 -> {
                    System.out.println("Cerrando sesión de gerencia...");
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    
    
}