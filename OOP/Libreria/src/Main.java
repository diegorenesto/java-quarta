import backend.Genere;
import backend.Libro;
import frontend.Tools;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        boolean soluzioni = false;


        Libro libro1 = new Libro("Parini", "Il Giorno", 1000, Genere.GENERICO);
        Libro libro2 = new Libro("Rosseau", "Julie o la nouvelle Eloise", 1000, Genere.GENERICO);
        Libro libro3 = new Libro("Parini", "Il Giorno", 1000, Genere.GENERICO);


        System.out.println("Il libro 1 e libro 2 sono uguali? " + libro1.equals(libro2));
        System.out.println("Il libro 1 e libro 3 sono uguali? " + libro1.equals(libro3));


        System.out.println("\n\n");


        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());

        System.out.println("\n\n");


        System.out.println("Crea un nuovo libro");
        Libro nuovoLibro = Tools.leggiLibro(tastiera, soluzioni);
        System.out.println(nuovoLibro.toString());


        System.out.println("\n\nProgramma terminato");


    }
}