import backend.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // objects
        Romanzo r = new Romanzo("Johann Wolfgang Goethe", "I dolori del giovane Werther", 130, Genere.ROMANZO, GenereLetterario.EPISTOLARE);
        Manuale m = new Manuale("Herbert Schildt", "Java: A Beginner's Guide", 720, Genere.MANUALE, "Java programming language", Livello.PRINCIPIANTE);
        Thriller t = new Thriller("Dan Brown", "Il Codice da Vinci", 600, Genere.MANUALE, true);
        Mensola mensola = new Mensola();
        ArrayList<Libro> listaRitornata;

        try {
            mensola.addLibro(r);
            mensola.addLibro(m);
            mensola.addLibro(t);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        try {
            listaRitornata = mensola.visualizzaMensola();
            listaRitornata.forEach(System.out::println);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

    }
}