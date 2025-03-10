import java.util.ArrayList;
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
                    try {
                        System.out.println("Inserisci un nuovo smartphone");
                        // creazione oggetto
                        System.out.println("Inserisci il codice del prodotto");
                        int codice = Integer.parseInt(tastiera.nextLine());
                        System.out.println("Inserisci la marca");
                        String marca = tastiera.nextLine();
                        System.out.println("Inserisci il prezzo");
                        int prezzo = Integer.parseInt(tastiera.nextLine());
                        if (prezzo > 0) { // controllo che il prezzo sia valido
                            System.out.println("Inserisci il modello");
                            String modello = tastiera.nextLine();
                            System.out.println("Inserisci la memoria in GB");
                            int memoria = Integer.parseInt(tastiera.nextLine());
                            if (memoria > 0) { // controllo che la memoria sia valida
                                Smartphone smartphone = new Smartphone(codice, marca, prezzo, modello, memoria);
                                try {
                                    negozio.addProdotto(smartphone); // smartphone aggiunto alla lista
                                } catch (Exception e) {
                                    System.out.println("ERRORE! " + e.getMessage());
                                }
                            } else
                                throw new Exception("LA MEMORIA NON PUO' ESSERE < 0");
                        } else
                            throw new Exception("IL PREZZO NON PUO' ESSERE < 0");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("Rimuovi un prodotto esistente");
                    System.out.println("Inserisci il codice per la rimozione del prodotto");
                    int codiceRimozione = Integer.parseInt(tastiera.nextLine());
                    negozio.removeProdotto(codiceRimozione);
                }
                case 3 -> {
                    System.out.println("Ricerca prodotto per codice");
                    System.out.println("Inserisci il codice da cercare");
                    int codiceRicerca = Integer.parseInt(tastiera.nextLine());
                    try {
                        System.out.println(negozio.ricercaPerCodice(codiceRicerca));
                    } catch (CloneNotSupportedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.println("Modifica il prezzo di un prodotto");
                    System.out.println("Inserisci il codice del prodotto");
                    int codiceRicerca = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci il nuovo prezzo");
                    int nuovoPrezzo = Integer.parseInt(tastiera.nextLine());
                    try {
                        negozio.modificaPrezzo(codiceRicerca, nuovoPrezzo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Visualizza l'elenco dei prodotti");
                    try {
                        ArrayList<ProdottoElettronico> listaRitornata = negozio.ritornaLista();
                        if (!(listaRitornata.isEmpty())) {
                            listaRitornata.forEach(p -> System.out.println(p.toString()));
                        } else
                            System.out.println("Lista vuota");
                    } catch (CloneNotSupportedException e) {
                        System.out.println("ERRORE! " + e.getMessage());
                    }
                }
                case 6 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);
    }
}