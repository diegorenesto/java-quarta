import backend.Genere;
import backend.Libro;
import backend.Mensola;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import frontend.Tools;

import static frontend.Tools.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        Mensola libreria = new Mensola(3);

        String[] opzioni = {"---LIBRERIA---", "1. Inserimento Libro Generico", "2. Libro non generico", "3. Visualizzazione", "4. Ricerca", "5. Cancellazione", "6. Salva su file JSON", "7. Leggi File JSON", "8. Salva su file CSV", "9. Leggi File CSV", "10. Fine"};
        do {
            clrScr();
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    try {
                        System.out.println("Inserimento Libro Generico");
                        if (!libreria.checkSpace())
                            libreria.addLibro(libreria.leggiLibro(tastiera));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.println("Libro non generico");
                    try {
                        System.out.println("Inserisci l'autore del libro: ");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci il titolo del libro: ");
                        String titolo = tastiera.nextLine();
                        System.out.println("Inserisci il numero di pagine del libro: ");
                        int nPagine = Integer.parseInt(tastiera.nextLine());
                        System.out.println("Inserisci il genere del libro:\n" + "ROMANZO,\n" + "MANUALE,\n" + "THRILLER");
                        Genere genere = Genere.valueOf(tastiera.nextLine());
                        Libro l = libreria.libroNonGenerico(tastiera, autore, titolo, nPagine, genere);
                        if (!libreria.checkSpace())
                            libreria.addLibro(l);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }

                case 3 -> {
                    System.out.println("Visualizzazione");
                    if (!libreria.isEmpty()) {
                        libreria.visualizzaMensola();
                    }
                }

                case 4 -> {
                    System.out.println("Ricerca");
                    if (!libreria.isEmpty()) {
                        System.out.println("Inserisci un'autore: ");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci un titolo: ");
                        String titolo = tastiera.nextLine();

                        Libro libroDaTrovare = new Libro(autore, titolo);
                        System.out.println("Il libro è presente nella mensola: " + libreria.findLibro(libroDaTrovare));
                    }
                }

                case 5 -> {
                    System.out.println("Cancellazione");

                    if (!libreria.isEmpty()) {
                        System.out.println("Inserisci l'autore del libro");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci il titolo del libro");
                        String titolo = tastiera.nextLine();

                        Libro libroDaRimuovere = new Libro(autore, titolo);
                        if (libreria.findLibro(libroDaRimuovere)) {
                            try {
                                libreria.removeBook(libroDaRimuovere);
                                System.out.println("Libro eliminato");
                            } catch (Exception e) {
                                System.out.println("Errore: " + e.getMessage());
                            }
                        }
                    }
                }

                case 6 -> {
                    System.out.println("Salva su file JSON");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    libreria.salvaJson(fileName);
                }

                case 7 -> {
                    System.out.println("Leggi file JSON");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    libreria.leggiJson(fileName);
                }

                case 8 -> {
                    System.out.println("Scrivi Mensola");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    scriviMensola(libreria, fileName);
                }

                case 9 -> {
                    System.out.println("Scrivi Mensola");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    leggiMensola(libreria, fileName);
                }

                case 10 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);

    }

    public static void scriviMensola(Mensola m, String fileName) {
        ArrayList<String> strings = new ArrayList<>();
        try {
            for (int i = 0; i < m.getMensola().size(); i++) {
                strings.add(m.csv());
            }
            Files.write(Paths.get(fileName), strings);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Mensola leggiMensola(Mensola m, String fileName) {
        ArrayList<Mensola> archivio = new ArrayList<>();
        try {
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
            String[] attributi;
            for (int i = 0; i < m.getMensola().size(); i++) {
                attributi = lines.get(i).split(";");
                archivio.add(new Mensola(Integer.parseInt(attributi[0], Integer.parseInt(attributi[1]))));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return m;
    }
}