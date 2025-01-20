
package backend;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mensola {
    private int numeroLibri = 0;
    private int maxLibri;
    private ArrayList<Libro> mensola = new ArrayList<>();

    public Mensola(int numeroLibri) {
        this.maxLibri = numeroLibri;
    }

    public int getNumeroLibri() {
        return numeroLibri;
    }

    public ArrayList<Libro> getMensola() {
        return mensola;
    }

    public boolean checkSpace() throws Exception {
        boolean piena = true;
        if (numeroLibri == maxLibri)
            throw new Exception("La mensola è piena");
        else
            return false;
    }

    public void addLibro(Libro l) throws Exception {
        if (l != null && !mensola.contains(l)) {
            mensola.add(l);
            numeroLibri++;
        } else
            throw new Exception("Il libro è presente nella mensola");
    }

    public void removeBook(Libro l) throws Exception {
        if (l != null && mensola.contains(l)) {
            mensola.remove(l);
            numeroLibri--;
        } else
            throw new Exception("Il libro non è presente nella mensola");
    }

    public void setInto(Libro l, int posizione, Scanner tastiera) {
        System.out.println("In che posizione vuoi settare il libro: ");
        posizione = tastiera.nextInt();
        mensola.set(posizione, l);
    }

    public boolean containsBook(Libro l) {
        return mensola.contains(l);
    }

    public ArrayList<Libro> getVolumi() {
        ArrayList<Libro> nuovaMensola = new ArrayList<>();
        for (Libro libro : mensola) {
            nuovaMensola.add(new Libro(libro));
        }
        return nuovaMensola;
    }

    public boolean isEmpty() {
        return mensola.isEmpty();
    }

    public boolean findLibro(String autore, String titolo) {
        boolean trovato = false;
        for (Libro l : mensola) {
            if (l.getAutore().equals(autore) && l.getTitolo().equals(titolo)) {
                l.toString();
                trovato = true;
            }
        }
        if (!trovato)
            System.out.println("Libro non presente nella mensola");


        return trovato;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void salvaJson(String fileName) {

        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonContent = gson.toJson(mensola);
            Files.write(Paths.get(fileName), jsonContent.getBytes());
            System.out.println("Dati salvati con successo");
        } catch (Exception e) {
            System.out.println("Errore durante il salvataggio: " + e.getMessage());
        }
    }

    public void leggiJson(String fileName) {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(fileName));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Libro[] collezione = gson.fromJson(new String(jsonData), Libro[].class);
            mensola = new ArrayList<>(Arrays.asList(collezione));
            System.out.println(mensola);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String csv() {
        return String.format("%s", mensola);
    }

}
