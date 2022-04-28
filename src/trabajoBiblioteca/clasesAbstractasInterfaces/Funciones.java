package application.trabajoBiblioteca.clasesAbstractasInterfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Funciones {

    private static final Scanner entrada = new Scanner(System.in);

    /**
     *
     * @return
     */
    public static Integer pedirNumero() {
        Integer retorno = null;
        boolean continuar = true;
        while (continuar){
            try {
                System.out.println("Ingrese una opcion");
                retorno = Integer.parseInt(entrada.nextLine());
                continuar = false;
            } catch (NumberFormatException error){
                System.out.println("No ha escrito un numero.");
            }
        }
        return retorno;
    }

    public static Integer buscaPosicionDocumentosReservados(Integer id, ArrayList<Integer> documentosReservados){
        int i = 0;
        boolean continuar = true;
        Integer retorno = null;
        while (continuar && documentosReservados.size() < i){
            if (documentosReservados.get(i).equals(id)){
                retorno = i;
                continuar = false;
            }
        }
        return retorno;
    }
}
