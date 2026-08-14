# Agenda de Contactos MVC

## Descripción
Aplicación de consola desarrollada en Java que permite gestionar una agenda de contactos, aplicando el patrón de arquitectura MVC (Model - View - Controller) para separar responsabilidades de forma clara y ordenada.

## Funcionalidades
- **Registrar contacto**: permite ingresar un nuevo contacto con ID, nombres, apellidos, dirección, teléfono y correo.
- **Listar contactos**: muestra todos los contactos registrados en la agenda.
- **Buscar contacto**: busca contactos por nombre o apellido, con coincidencia parcial y sin distinguir mayúsculas/minúsculas.
- **Eliminar contacto**: elimina un contacto de la agenda según su ID.
- **Menú interactivo**: navegación mediante opciones numéricas del 1 al 5.

## Arquitectura del Proyecto
vallegrande.edu.pe
├── model/Contacto.java
├── controller/AgendaController.java
├── view/AgendaView.java
└── app/Main.java

- **Model**: define los atributos del contacto, su constructor, getters y setters.
- **Controller**: gestiona el ArrayList de contactos y la lógica de negocio (agregar, listar, buscar, eliminar).
- **View**: muestra el menú por consola y captura los datos ingresados por el usuario.
- **App**: punto de entrada del programa, conecta todos los componentes.

## Integrantes
- Ashton Alexander Guevara Salas