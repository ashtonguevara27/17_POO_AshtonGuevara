package vallegrande.edu.pe.view;

import java.util.Scanner;

public class AgendaView {

    private Scanner scanner = new Scanner(System.in);

    //Mostrar Titulo
    public void mostrarTitulo() {
        System.out.println("===== AGENDA DE CONTACTOS =====");
    }

    //Mostrar Mensaje
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //Mostrar Menú y leer opción elegida
    public int mostrarMenu(){
        System.out.println("\n===== AGENDA DE CONTACTOS =====");
        System.out.println("1. Registrar contacto");
        System.out.println("2. Listar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");

        int opcion = Integer.parseInt(scanner.nextLine());
        return opcion;
    }

    //Métodos para leer los datos de un nuevo contacto
    public int leerId(){
        System.out.print("ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String leerNombres(){
        System.out.print("Nombres: ");
        return scanner.nextLine();
    }

    public String leerApellidos(){
        System.out.print("Apellidos: ");
        return scanner.nextLine();
    }

    public String leerDireccion(){
        System.out.print("Dirección: ");
        return scanner.nextLine();
    }

    public String leerTelefono(){
        System.out.print("Teléfono: ");
        return scanner.nextLine();
    }

    public String leerCorreo(){
        System.out.print("Correo: ");
        return scanner.nextLine();
    }

    //Leer criterio de búsqueda
    public String leerCriterioBusqueda(){
        System.out.print("Ingrese nombre o apellido a buscar: ");
        return scanner.nextLine();
    }

    //Leer ID para eliminar
    public int leerIdEliminar(){
        System.out.print("Ingrese el ID del contacto a eliminar: ");
        return Integer.parseInt(scanner.nextLine());
    }
}