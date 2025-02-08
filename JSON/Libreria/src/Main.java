import backend.Genere;
import backend.Libro;
import backend.Mensola;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import frontend.Tools;

import static frontend.Tools.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean uscita = false;

        Scanner tastiera = new Scanner(System.in);
        boolean soluzioni = false;
        Mensola libreria = new Mensola(3);

        String[] opzioni = {"---LIBRERIA---", "1. Inserimento", "2. Visualizzazione", "3. Ricerca", "4. Cancellazione", "5. Salva su file JSON", "6. Leggi File JSON", "7. Salva su file CSV", "8. Leggi File CSV", "9. Libro non generico", "10. Fine"};
        do {
            clrScr();
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    try {
                        System.out.println("Inserimento");
                        if (!libreria.checkSpace()) {
                            libreria.addLibro(Tools.leggiLibro(tastiera, soluzioni));
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.println("Visualizzazione");
                    if (!libreria.isEmpty()) {
                        libreria.visualizzaMensola();
                    }
                }

                case 3 -> {
                    System.out.println("Ricerca");
                    if (!libreria.isEmpty()) {
                        System.out.println("Inserisci un'autore: ");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci un titolo: ");
                        String titolo = tastiera.nextLine();

                        System.out.println("Il libro è presente nella mensola: " + libreria.findLibro(autore, titolo));
                    }
                }

                case 4 -> {
                    System.out.println("Cancellazione");
                    int i = 0;

                    if (!libreria.isEmpty()) {
                        System.out.println("Inserisci l'autore del libro");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci il titolo del libro");
                        String titolo = tastiera.nextLine();

                        if (libreria.findLibro(autore, titolo)) {
                            for (i = 0; i < libreria.getMensola().size(); i++) {
                                Libro libro1 = libreria.getMensola().get(i);
                                if (libro1.getAutore().equals(autore) && libro1.getTitolo().equals(titolo)) {
                                    try {
                                        libreria.removeBook(libro1);
                                        System.out.println("Libro eliminato");
                                    } catch (Exception e) {
                                        System.out.println("Errore: " + e.getMessage());
                                    }
                                }
                            }
                        }
                    }

                }


                case 5 -> {
                    System.out.println("Salva su file JSON");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    libreria.salvaJson(fileName);
                }

                case 6 -> {
                    System.out.println("Leggi file JSON");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    libreria.leggiJson(fileName);
                }

                case 7 -> {
                    System.out.println("Scrivi Mensola");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    scriviMensola(libreria, fileName);
                }

                case 8 -> {
                    System.out.println("Scrivi Mensola");
                    System.out.println("Inserisci il nome del file: ");
                    String fileName = tastiera.nextLine();
                    leggiMensola(libreria, fileName);
                }

                case 9 -> {
                    System.out.println("Libro non generico");
                    Manuale m = new Manuale("Diego Renesto", "OOP", 10000, "Java", Livello.ESPERTO);
                    Romanzo r = new Romanzo("Franz Kafka  ", "Il Processo", 1000, GenereLetterario.FANTASY);
                    Thriller t = new Thriller("Joel Dicker", "Un animale selvaggio", 1000, true);
                    try {
                        libreria.addLibro(m);
                        libreria.addLibro(r);
                        libreria.addLibro(t);
                        libreria.visualizzaMensola();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                }

                case 10 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        }
        while (!uscita);

//        String userDirectory = System.getProperty("user.dir");
//        File dir = new File(userDirectory);
//        String[] list = dir.list();
//
//
//        findFile();
//        System.out.println("\n\n");
//        fileSelection(list, tastiera);


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