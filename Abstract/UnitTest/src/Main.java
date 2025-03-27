import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // objects
        Sfera s = new Sfera(1.7, 4);
        Cubo c = new Cubo(12.5, 6);
        GalleriaDeiSolidi g = new GalleriaDeiSolidi();
        ArrayList<Solido> listaRitornata;

        try {
            g.addSolido(s);
            g.addSolido(c);
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            listaRitornata = g.visualizzaGalleria();
            listaRitornata.forEach(System.out::println);
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}