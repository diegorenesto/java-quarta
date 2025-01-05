import java.time.LocalDate;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);


        System.out.println("\n\nJava Project");
        System.out.println(LocalDate.now());


        // SOURCE CODE

        Carrello carrello = new Carrello(5, "LabInfo");
        String[] opzioni = {"---CARRELLO---", "1. Aggiungi tablet", "2. Rimuovi tablet", "3. Modifica stato tablet",
                "4. Visualizza tablet", "5. Cerca tablet", "6. Conta tablet per stato", "7. Fine"};


        boolean uscita = false;

        while (!uscita) {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {

                case 1 -> {

                    System.out.print("Inserisci marca CPU: ");
                    String marca = tastiera.nextLine();
                    System.out.print("Inserisci identifier: ");
                    int id = tastiera.nextInt();
                    System.out.print("Inserisci spazio RAM: ");
                    int ram = tastiera.nextInt();
                    tastiera.nextLine();
                    carrello.aggiungiTablet(new Tablet(marca, id, ram, Stato.SPENTO));
                }

                case 2 -> {
                    System.out.print("Inserisci l'identifier del tablet da rimuovere: ");

                    int idRimuovi = tastiera.nextInt();
                    carrello.rimuoviTablet(idRimuovi);
                }

                case 3 -> {
                    System.out.print("Inserisci l'identifier del tablet: ");
                    int idModifica = tastiera.nextInt();
                    System.out.println("Scegli il nuovo stato: 1. ACCESO, 2. SPENTO, 3. STANDBY");
                    int statoScelto = tastiera.nextInt();
                    Stato nuovoStato = Stato.values()[statoScelto - 1];
                    carrello.modificaStato(idModifica, nuovoStato);
                }

                case 4 -> {
                    carrello.visualizzaTablet();
                }

                case 5 -> {
                    System.out.print("Inserisci l'identifier del tablet da cercare: ");

                    int idCerca = tastiera.nextInt();
                    Tablet trovato = carrello.cercaTablet(idCerca);
                    if (trovato != null) {
                        System.out.println("Tablet trovato: " + trovato);
                    } else {
                        System.out.println("Tablet non trovato.");
                    }
                }

                case 6 -> {
                    System.out.println("Scegli lo stato da contare: 1. ACCESO, 2. SPENTO, 3. STANDBY");

                    int statoConta = tastiera.nextInt();
                    Stato statoDaContare = Stato.values()[statoConta - 1];
                    int cont = carrello.contaTabletPerStato(statoDaContare);
                    System.out.println("Numero di tablet in stato " + statoDaContare + ": " + cont);
                }

                case 7 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
                default -> System.out.println("Inserisci una scelta valida!");
            }

        }
    }


}