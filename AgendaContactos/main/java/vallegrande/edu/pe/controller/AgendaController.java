package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;
import java.util.ArrayList;

public class AgendaController {

    //Lista Contactos ( Almacenar )
    private ArrayList<Contacto> contactos;

    //Constructor
    public AgendaController(){
        contactos = new ArrayList<>();
    }

    //Agregar Contacto
    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
        System.out.println("Contacto Agregado correctamente");
    }

    //Listar Contactos
    public void listarContactos(){
        System.out.println("LISTA DE CONTACTOS");
        for (Contacto contacto : contactos){
            contacto.mostrarContacto();
        }
    }

    //Buscar Contacto por nombre o apellido (coincidencia parcial, sin importar mayúsculas/minúsculas)
    public void buscarContacto(String criterio){
        boolean encontrado = false;
        String criterioLower = criterio.toLowerCase();

        for (Contacto contacto : contactos){
            if (contacto.getNombres().toLowerCase().contains(criterioLower) ||
                    contacto.getApellidos().toLowerCase().contains(criterioLower)){
                contacto.mostrarContacto();
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("No se encontró ningún contacto con ese criterio.");
        }
    }

    //Eliminar Contacto por ID
    public void eliminarContacto(int id){
        Contacto contactoAEliminar = null;

        for (Contacto contacto : contactos){
            if (contacto.getId() == id){
                contactoAEliminar = contacto;
                break;
            }
        }

        if (contactoAEliminar != null){
            contactos.remove(contactoAEliminar);
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún contacto con ese ID.");
        }
    }
}