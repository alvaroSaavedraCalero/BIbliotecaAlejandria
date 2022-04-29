package application.trabajoBiblioteca;


import application.trabajoBiblioteca.menuAlmacen.Almacen;
import application.trabajoBiblioteca.personas.Bibliotecario;
import application.trabajoBiblioteca.personas.Cliente;




public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Cliente cliente = (Cliente) almacen.getAlmacenPersonas().get(1);
        Bibliotecario bibliotecario = (Bibliotecario) almacen.getAlmacenPersonas().get(4);
        //cliente.consultarTodosDocumentos(almacen.getAlmacenDocumentos());
        bibliotecario.darAltaCliente(almacen.getAlmacenPersonas());
    }
}
