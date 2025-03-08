package backend;

import java.util.ArrayList;

public class Mensola {
    private int nLibri = 0;
    private final int maxLibri = 5;
    ArrayList<Libro> libreria;

    public Mensola() {
        libreria = new ArrayList<Libro>();
    }

    public int getnLibri() {
        return nLibri;
    }

    public ArrayList<Libro> getLibreria() {
        return libreria;
    }

    public void addLibro(Libro libro) throws CloneNotSupportedException {
        if (libro != null & !(libreria.contains(libro))) {
            libreria.add(libro.clone());
        } else
            throw new CloneNotSupportedException("ERRORE! SOLIDO NON INSERITO NELLA MENSOLA!");
    }

    public ArrayList<Libro> visualizzaMensola() throws CloneNotSupportedException {
        ArrayList<Libro> temp = new ArrayList<>();
        for (Libro l : libreria) {
            temp.add(l.clone());
        }
        return temp;
    }
}