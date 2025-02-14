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
            nuovaMensola.add(new Libro("autore", "titolo", 100));
        }
        return nuovaMensola;
    }

    public boolean isEmpty() {
        return mensola.isEmpty();
    }

    public boolean findLibro(Libro libro) {
        boolean trovato = false;
        for (Libro l : mensola) {
            if (l.getAutore().equals(libro.getAutore()) && l.getTitolo().equals(libro.getTitolo())) {
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
            byte[] jsonContent = Files.readAllBytes(Paths.get(fileName));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Libro[] collezione = gson.fromJson(new String(jsonContent), Libro[].class);
            mensola = new ArrayList<>(Arrays.asList(collezione)); // permette ad un array di diventare ArrayList
            System.out.println(mensola);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String csv() {
        return String.format("%s", mensola);
    }

    public void visualizzaMensola() {
        for (Libro l : mensola) {
            System.out.println(l.stampaLibro());
        }
    }

    public static Libro leggiLibro(Scanner tastiera) {
        System.out.println("Inserisci l'autore del libro: ");
        String autore = tastiera.nextLine();
        System.out.println("Inserisci il titolo del libro: ");
        String titolo = tastiera.nextLine();
        System.out.println("Inserisci il numero di pagine del libro: ");
        int nPagine = Integer.parseInt(tastiera.nextLine());

        return new Libro(autore, titolo, nPagine);

    }

    public Libro libroNonGenerico(Scanner tastiera, String autore, String titolo, int nPagine, Genere genere) throws Exception {
//        System.out.println("Inserisci l'autore del libro: ");
//        String autore = tastiera.nextLine();
//        System.out.println("Inserisci il titolo del libro: ");
//        String titolo = tastiera.nextLine();
//        System.out.println("Inserisci il numero di pagine del libro: ");
//        int nPagine = Integer.parseInt(tastiera.nextLine());
//        System.out.println("Inserisci il genere del libro:\n" +
//                "ROMANZO,\n" +
//                "MANUALE,\n" +
//                "THRILLER");
//        Genere genere = Genere.valueOf(tastiera.nextLine());
        if (genere.equals(Genere.ROMANZO)) {
            System.out.println("Inserisci il genere letterario del libro:\n" +
                    "1. ROMANZOSTORICO,\n" +
                    "2. FANTASY,\n" +
                    "3. ARMONY");
            int genereLetterario = Integer.parseInt(tastiera.nextLine());
            return new Romanzo(autore, titolo, nPagine, GenereLetterario.values()[genereLetterario - 1]);
        } else if (genere.equals(Genere.MANUALE)) {
            System.out.println("Inserisci l'argomento del libro: ");
            String argomento = tastiera.nextLine();
            System.out.println("Inserisci il livello del libro:\n" +
                    "1. BASE,\n" +
                    "2. PRINCIPIANTE,\n" +
                    "3. ESPERTO");
            int livello = Integer.parseInt(tastiera.nextLine());
            return new Manuale(autore, titolo, nPagine, argomento, Livello.values()[livello - 1]);
        } else if (genere.equals(Genere.THRILLER)) {
            System.out.println("il libro ha una serie TV? (s/n)");
            String risposta = tastiera.nextLine();
            boolean serieTv;
            if (risposta.equals("s"))
                serieTv = true;
            else
                serieTv = false;
            return new Thriller(autore, titolo, nPagine, serieTv);
        } else
            throw new Exception("ERRORE NELLA CREAZIONE DEL LIBRO!");
    }

}