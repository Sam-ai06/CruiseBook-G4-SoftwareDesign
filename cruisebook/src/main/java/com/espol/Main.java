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
import com.espol.entidades.Usuario;
import com.espol.entidades.notifSender;
import com.espol.enums.estadoCabina;
import com.espol.enums.medioNotif;
import com.espol.enums.tipoCabina;
import com.espol.factoryMethod.ClienteCreator;
import com.espol.factoryMethod.GerenciaCreator;
import com.espol.factoryMethod.OperadorCreator;
import com.espol.factoryMethod.UsuarioCreator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         //usuarios de ejemplo (adaptados a factory method)
        UsuarioCreator clienteCreator = new ClienteCreator();
        UsuarioCreator operadorCreator = new OperadorCreator();
        UsuarioCreator gerenciaCreator = new GerenciaCreator("Atención al cliente");

        Usuario cliente1 = clienteCreator.crearUsuario("Samuel", "0989765439", 
        "samuel@mail.com", "samuel", "1234");
        

        Usuario operador1 = operadorCreator.crearUsuario("Annie", "0987654312", 
        "annie@mail.com", "annie", "abcd");
        

        Usuario gerencia1 = gerenciaCreator.crearUsuario("Mathias", "0976543098", 
        "mathias@mail.com", "mathias", "4321");

        List<Usuario> usuarios = List.of(cliente1, operador1, gerencia1);

        Usuario usuarioLogueado = null;

        while (true) {
            System.out.println("\n=== SISTEMA CRUISEBOOK ===");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Usuario: ");
                String user = sc.nextLine();
                System.out.print("Contraseña: ");
                String pass = sc.nextLine();

                /*// Validar login
                for (Usuario u : usuarios) {
                    if (u.login(user, pass)) {
                        usuarioLogueado = u;
                        System.out.println("Inicio de sesión exitoso. Bienvenido, " + u.getNombre());
                        break;
                    }*/
                }

                if (usuarioLogueado == null) {
                    System.out.println("Credenciales incorrectas. ¿Desea crear una cuenta? (s/n):");
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.print("Ingrese su nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese su teléfono: ");
                        String telefono = sc.nextLine();
                        System.out.print("Ingrese su email: ");
                        String email = sc.nextLine();
                        System.out.print("Ingrese su usuario: ");
                        String nuevoUser = sc.nextLine();
                        System.out.print("Ingrese su contraseña: ");
                        String nuevaPass = sc.nextLine();

                        Cliente nuevoCliente = new Cliente(nombre, telefono, email, nuevoUser, nuevaPass);
                        ((ArrayList<Usuario>) usuarios).add(nuevoCliente);
                        System.out.println("Cuenta creada exitosamente. Ahora puede iniciar sesión.");        
                        continue;              
                    }
                    else{
                        System.out.println("Volviendo al menú principal.");
                        continue;
                    }

                    //IMPLEMENTACIÓN INICIAL ESTO PROBABLEMENTE VA A IR A SU PROPIA CLASE O MÉTODO QUE SE ENCARGUE DE PROCESAR EL INICIO DE SESIÓN Y REGISTRO
                    //USO DE BASE DE DATOS O PERSISTENCIA DE ARCHIVOS
                }

                // Menú según tipo de usuario
                if (usuarioLogueado instanceof Cliente cliente) {
                    menuCliente(cliente, sc);
                } else if (usuarioLogueado instanceof Operador operador) {
                    menuOperador(operador, sc);
                } else if (usuarioLogueado instanceof Gerencia gerencia) {
                    menuGerencia(gerencia, sc);
                }

                //usuarioLogueado.logout(); eliminar 
                usuarioLogueado = null;
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
                    sender.notificarUsuario(operador, mensaje, medioNotif.EMAIL); //porfavor apégense a las clases existentes y los enums
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
                    Reserva reserva = new Reserva();
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