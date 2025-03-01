import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        // objects
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        Giocatore g1 = new Giocatore("Giuseppe", "Parini");
        Giocatore g2 = new Giocatore("Vittorio", "Alfieri");
        Partita partita = new Partita(g1, g2);

        String[] opzioni = {"GARA LANCIO DADI", "1. Gioca partita base", "2. Gioca partita avanzate", "3. Fine"};
        do {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    System.out.println("Partita base");
                    partita.giocaPartita();
                }
                case 2 -> {
                    System.out.println("Partita avanzate");
                    partita.giocaPartitaAvanzata();
                }
                case 3 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);
    }
}