import java.util.Scanner;

import static utility.Tools.Menu;

public class Main {
    public static void main(String[] args) {
        // Dichiarazione delle variabili
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        Agenzia agenzia = new Agenzia("AGENZIA");

        String[] opzioni = {"AGENZIA DI VIAGGI", "1. Aggiungi viaggio generico", "2. Aggiungi viaggio NON generico", "3. Rimuovi Viaggio", "4. Stampa viaggi", "5. Json", "6. Fine"};
        do {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    System.out.println("Aggiungi viaggio generico");
                    Viaggio v = agenzia.creazioneViaggio(tastiera);
                    agenzia.aggiungiaViaggio(v);
                }
                case 2 -> {
                    System.out.println("Aggiungi viaggio NON generico");
                    System.out.println("Inserisci il tipo del viaggio\n" +
                            "1. VOLO,\n" +
                            "2. CROCIERA");
                    int tipoViaggio = Integer.parseInt(tastiera.nextLine());
                    Viaggio v = agenzia.viaggioNonGenerico(tastiera, GenereViaggio.values()[tipoViaggio - 1]);
                    agenzia.aggiungiaViaggio(v);
                }
                case 3 -> {
                    System.out.println("Rimuovi Viaggio");
                    System.out.println("Inserisci la destinazione: ");
                    String destinazione = tastiera.nextLine();
                    System.out.println("Inserisci il costo: ");
                    int costo = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Inserisci il numero di giorni: ");
                    int giorni = Integer.parseInt(tastiera.nextLine());
                    agenzia.rimuoviViaggio(agenzia.trovaViaggio(destinazione, costo, giorni));
                    System.out.println("Viaggio rimosso");

                }
                case 4 -> {
                    System.out.println("Stampa viaggi");
                    agenzia.stampaViaggi();
                }

                case 5 -> {
                    System.out.println("Json");
                    System.out.println("Inserisci il nome del file per salvare su Json: ");
                    String fileName = tastiera.nextLine();
                    agenzia.salvaJson(fileName);
                    System.out.println("Inserisci il nome del file per leggere da Json");
                    String fileName2 = tastiera.nextLine();
                    agenzia.leggiJson(fileName2);
                }

                case 6 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);
    }
}