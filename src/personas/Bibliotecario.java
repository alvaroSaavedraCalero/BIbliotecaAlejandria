package personas;

import clasesAbstractasInterfaces.Documento;
import clasesAbstractasInterfaces.Funciones;
import clasesAbstractasInterfaces.InterfaceBibliotecario;
import clasesAbstractasInterfaces.Persona;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Bibliotecario extends Cliente implements InterfaceBibliotecario {

    private static final Scanner entrada = new Scanner(System.in);
    private ArrayList<Integer> documentosReservados;
    /**
     * Constructor con todos los parametro, heredado en este caso.
     * @param nombre
     * @param edad
     * @param password
     * @param rol
     * @param id
     */
    public Bibliotecario(String nombre, int edad, String password, String rol, Integer id) {
        super(nombre, edad, password, rol, id);
        this.documentosReservados = new ArrayList<>();
    }

    public Bibliotecario() {
    }

    public ArrayList<Integer> getDocumentosReservados() {
        return documentosReservados;
    }

    public void setDocumentosReservados(ArrayList<Integer> documentosReservados) {
        this.documentosReservados = new ArrayList<>(documentosReservados);
    }

    @Override
    public void darAltaCliente(ArrayList<Persona> almacenPersonas) {
        System.out.println("¿Cual es el nombre del nuevo Cliente?");
        String nombreCliente = entrada.nextLine();
        System.out.println("¿Que edad tiene el nuevo Cliente?");
        Integer edadCliente = Funciones.pedirNumero();
        System.out.println("¿Cual es la contraseña del nuevo Cliente?");
        String passCliente = entrada.nextLine();
        Integer idCliente = null;
        boolean continuar = true;
        while (continuar){
            System.out.println("¿Que id numerico quiere el nuevo Cliente?");
            idCliente = Funciones.pedirNumero();
            if (Funciones.existeIdPersonas(almacenPersonas, idCliente)){
                System.out.println("Ese id ya existe, escoja otro.");
            } else {
                System.out.println("Id disponible.");
                continuar = false;
            }
        }

        Cliente nuevoCliente = new Cliente(
                nombreCliente,
                edadCliente,
                passCliente,
                "CLIENTE",
                idCliente
                );
        almacenPersonas.add(nuevoCliente);
        System.out.println("User: " + nuevoCliente.getUser());
        System.out.println("Password: " + nuevoCliente.getPassword());
    }

    @Override
    public void darBajaCliente(ArrayList<Persona> almacenPersonas) {
        Iterator<Persona> iterator = almacenPersonas.iterator();
        boolean continuar = true;
        while (continuar && iterator.hasNext()){
            Persona persona = iterator.next();
            System.out.println("¿Cual es el id de la persona?");
            Integer idPersona = Funciones.pedirNumero();
            if (persona.getId().equals(idPersona)){
                System.out.println("Se va a eliminar a: ");
                System.out.println(persona);
                boolean cont = true;
                while (cont){
                    System.out.println("¿Esta seguro? 1.Si/2.No");
                    Integer respuesta = Funciones.pedirNumero();
                    if (respuesta.equals(1)){
                        iterator.remove();
                        cont = false;
                    } else if (respuesta.equals(2)){
                        System.out.println("Saliendo...");
                        cont = false;
                        continuar = false;
                    } else {
                        System.out.println("No ha escrito un numero correcto");
                    }
                }
            }
            if (iterator.hasNext() == false){
                System.out.println("No se ha encontrado ningun id en el almacen.");
            }
        }
    }

    @Override
    public void consultarCliente(ArrayList<Persona> almacenPersonas) {
        Iterator<Persona> iterator = almacenPersonas.iterator();
        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Por que campo quiere consultar el cliente?");
            System.out.println("1. Id");
            System.out.println("2. Nombre");
            System.out.println("3. Salir");
            Integer respuesta = Funciones.pedirNumero();
            switch (respuesta){
                case 1:
                    System.out.println("¿Cual es el Id de la persona?");
                    Integer idPersona = Funciones.pedirNumero();
                    boolean continuar1 = true;
                    while (iterator.hasNext() && continuar1){
                        Persona per = iterator.next();
                        if (per.getId().equals(idPersona)){
                            System.out.println(per);
                            continuar1 = false;
                        }
                        if (iterator.hasNext() == false){
                            System.out.println("No se encontro ninguna persona con ese id");
                        }
                    }
                break;

                case 2:
                    System.out.println("¿Cual es el nombre de la persona?");
                    String nombrePersona = entrada.nextLine();
                    boolean continuar2 = true;
                    while (iterator.hasNext() && continuar2){
                        Persona per = iterator.next();
                        HashSet<Persona> personas = new HashSet<>();
                        if (per.getNombre().equals(nombrePersona)){
                            personas.add(per);
                        }
                        System.out.println("Las personas con ese nombre son: ");
                        System.out.println(personas);
                        continuar2 = false;
                        if (iterator.hasNext() == false){
                            System.out.println("No se han encontrado personas con ese nombre");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
            }
        }
    }

    @Override
    public void consultarTodosClientes(ArrayList<Persona> almacenPersonas) {
        for (Persona per:
             almacenPersonas) {
            System.out.println(per);
        }
    }

    @Override
    public void darAltaDocumento(ArrayList<Documento> almacenDocumentos) {
        System.out.println("¿Que tipo de documento quiere añadir?");
    }

    @Override
    public void darBajaDocumento(ArrayList<Documento> almacenDocumentos) {

    }

    @Override
    public String toString() {
        return "Biliotecario{" +
                "nombre='" + this.getNombre() + '\'' +
                ", edad=" + this.getEdad() +
                ", password='" + this.getPassword() + '\'' +
                ", user=" + this.getUser() +
                ", rol='" + this.getRol() + '\'' +
                ", id=" + this.getId() +
                '}';
    }
}
