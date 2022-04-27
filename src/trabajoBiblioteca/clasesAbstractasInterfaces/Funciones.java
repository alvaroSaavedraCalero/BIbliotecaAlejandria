package application.trabajoBiblioteca.clasesAbstractasInterfaces;

import java.util.Scanner;

public class Funciones {

    private static final Scanner entrada = new Scanner(System.in);

    public static Integer pedirNumero() {
        Integer retorno = null;
        boolean continuar = true;
        while (continuar){
            try {
                retorno = Integer.parseInt(entrada.nextLine());
                continuar = false;
            } catch (NumberFormatException error){
                System.out.println("No ha escrito un numero.");
            }
        }
        return retorno;
    }
}
