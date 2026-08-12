package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AgendaView;

public class Main {
    public static void main(String[] args) {
        //Crear los componentes
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();

        //Mostrar Información
        view.mostrarTitulo();

        //Precargar 5 contactos de prueba
        controller.agregarContacto(new Contacto(1, "Ana", "Torres", "Cañete", "983745656", "ana@gmail.com"));
        controller.agregarContacto(new Contacto(2, "Carlos", "Perez", "Imperial", "951264456", "carlos@gmail.com"));
        controller.agregarContacto(new Contacto(3, "Maria", "Lopez", "San Vicente", "978564123", "maria@gmail.com"));
        controller.agregarContacto(new Contacto(4, "Jose", "Ramirez", "Nuevo Imperial", "965478123", "jose@gmail.com"));
        controller.agregarContacto(new Contacto(5, "Lucia", "Fernandez", "Quilmana", "912345678", "lucia@gmail.com"));

        int opcion;

        do {
            opcion = view.mostrarMenu();

            switch (opcion){
                case 1:
                    //Registrar contacto
                    int id = view.leerId();
                    String nombres = view.leerNombres();
                    String apellidos = view.leerApellidos();
                    String direccion = view.leerDireccion();
                    String telefono = view.leerTelefono();
                    String correo = view.leerCorreo();

                    Contacto nuevo = new Contacto(id, nombres, apellidos, direccion, telefono, correo);
                    controller.agregarContacto(nuevo);
                    break;

                case 2:
                    //Listar contactos
                    controller.listarContactos();
                    break;

                case 3:
                    //Buscar contacto
                    String criterio = view.leerCriterioBusqueda();
                    controller.buscarContacto(criterio);
                    break;

                case 4:
                    //Eliminar contacto
                    int idEliminar = view.leerIdEliminar();
                    controller.eliminarContacto(idEliminar);
                    break;

                case 5:
                    view.mostrarMensaje("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    view.mostrarMensaje("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 5);
    }
}