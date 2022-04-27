package application.trabajoBiblioteca;

import application.trabajoBiblioteca.documentos.Libro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro(
                "Libro1",
                "autoresLibro1",
                "editorialLibro1",
                false,
                false,
                1,
                LocalDate.now(),
                null,
                56,
                8
        );

        System.out.println(libro);
    }
}
