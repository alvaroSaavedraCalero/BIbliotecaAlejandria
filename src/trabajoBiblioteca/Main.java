package application.trabajoBiblioteca;


import application.trabajoBiblioteca.menuAlmacen.Almacen;
import application.trabajoBiblioteca.personas.Cliente;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Cliente cliente = (Cliente) almacen.getAlmacenPersonas().get(1);
        cliente.reservarDocumento(almacen.getAlmacenDocumentos());
        System.out.println(cliente.getDocumentosReservados());
    }
}
