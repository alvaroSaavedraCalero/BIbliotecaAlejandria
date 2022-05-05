package clasesAbstractasInterfaces;

import java.util.ArrayList;

public interface InterfaceDirector {
    void aniadirBibliotecario(ArrayList<Persona> almacenPersonas);
    void eliminarBibliotecario(ArrayList<Persona> almacenPersonas);
    void comprobarDatosBibliotecario(ArrayList<Persona> almacenPersonas);
    void comprobarTodosBibliotecarios(ArrayList<Persona> almacenPersonas);
}
