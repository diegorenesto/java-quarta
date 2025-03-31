import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.*;

/**
 * @author Diego Renesto
 * @version 1.0
 * @since 31/03/2025
 */
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        Negozio negozio = new Negozio();
        String[] opzioni = {"NEGOZIO ELETTRONICA", "1. Inserisci un nuovo smartphone", "2. Inserisci un nuovo manuale", "3. Rimuovi un prodotto esistente", "4. Visualizza l'elenco dei prodotti", "5. Fine"};
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
                    System.out.println("Inserisci un nuovo manuale");
                    // creazione oggetto
                    System.out.println("Inserisci il nome: ");
                    String nome = tastiera.nextLine();
                    System.out.println("Inserisci la descrizione: ");
                    String descrizione = tastiera.nextLine();
                    System.out.println("Inserisci l'autore: ");
                    String autore = tastiera.nextLine();
                    System.out.println("Inserisci l'ISBN: ");
                    int isbn = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci il prezzo: ");
                    int prezzo = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci la quantita': ");
                    int quantita = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci l'argomento: ");
                    String argomento = tastiera.nextLine();
                    Manuale manuale = new Manuale(nome, descrizione, autore, isbn, prezzo, quantita, argomento);
                    try {
                        negozio.addProdotto(manuale); // manuale aggiunto alla lista
                    } catch (Exception e) {
                        System.out.println("ERRORE! " + e.getMessage());
                    }
                }

                case 3 -> {
                    System.out.println("Rimuovi un prodotto esistente");
                    System.out.println("Inserisci il codice (o l'isbn) per rimuovere un prodotto: ");
                    int codice = Integer.parseInt(tastiera.nextLine());
                    try {
                        negozio.removeProdotto(codice);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 4 -> {
                    System.out.println("Visualizza l'elenco dei prodotti");
                    try {
                        ArrayList<Prodotto> listaRitornata = negozio.ritornaLista();
                        if (!(listaRitornata.isEmpty())) {
                            listaRitornata.forEach(p -> System.out.println(p.toString()));
                        } else
                            System.out.println("Lista vuota");
                    } catch (CloneNotSupportedException e) {
                        System.out.println("ERRORE! " + e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);
    }
}