import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        Negozio negozio = new Negozio();
        String[] opzioni = {"NEGOZIO ELETTRONICA", "1. Inserisci un nuovo smartphone", "2. Rimuovi un prodotto esistente", "3. Ricerca prodotto per codice", "4. Modifica il prezzo di un prodotto", "5. Visualizza l'elenco dei prodotti", "6. Fine"};
        do {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    System.out.println("Inserisci un nuovo smartphone");
                    System.out.println("Inserisci il codice del prodotto");
                    int codice = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci la marca");
                    String marca = tastiera.nextLine();
                    System.out.println("Inserisci il prezzo");
                    int prezzo = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci il modello");
                    String modello = tastiera.nextLine();
                    System.out.println("Inserisci la memoria ing GB");
                    int memoria = Integer.parseInt(tastiera.nextLine());
                    Smartphone smartphone = new Smartphone(codice, marca, prezzo, modello, memoria);
                    try {
                        negozio.addProdotto(smartphone);
                    } catch (CloneNotSupportedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("Rimuovi un prodotto esistente");
                }
                case 3 -> {
                    System.out.println("Ricerca prodotto per codice");
                    System.out.println("Inserisci il codice da cercare");
                    int codice = Integer.parseInt(tastiera.nextLine());
                    negozio.ricercaCodice(codice);
                }
                case 4 -> {
                    System.out.println("Modifica il prezzo di un prodotto");
                }
                case 5 -> {
                    System.out.println("Visualizza l'elenco dei prodotti");
                }
                case 6 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);
    }
}