// RENESTO DIEGO

import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uscita = false;
        final int MAXFIORI = 3; // capienza della vetrina
        ArrayList<Fiore> vetrina = new ArrayList<>();

        String[] opzioni = {"FIORERIA", "1. Inserimento", "2. Modifica prezzo", "3. Visualizza vetrina", "4. Fine"};

        do {
            int scelta = Menu(opzioni, sc); // scelta del Menu, metodo della classe Tools del package utility
            switch (scelta) {
                case 1 -> {
                    System.out.println("Inserimento");
                    try {
                        if (checkSpace(vetrina, MAXFIORI)) { // controlla se c'è spazio in vetrina
                            Fiore f = creazioneFiore(sc); // crea il fiore
                            if (!fioreDoppio(vetrina, f)) { // se il fiore non è presente nella vetrina, lo aggiunge all'ArrayList
                                vetrina.add(f);
                                System.out.println("Fiore inserito nella vetrina");
                            } else {
                                System.out.println("Fiore gia' presente nella vetrina");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // situazione anomala intercettata dal try catch tramite il throws Exception nel metodo checkSpace
                    }
                }

                case 2 -> {
                    System.out.println("Modifica prezzo");
                    System.out.println("Inserisci il nome del fiore per la modifica del prezzo: ");
                    String nomeFiore = sc.nextLine();
                    try {
                        modificaCosto(nomeFiore, sc, vetrina); // metodo che modifica il prezzo del fiore avente per nome nomeFiore
                        System.out.println("Prezzo del fiore modificato");
                    } catch (
                            Exception e) { // situazione anomala intercettata dal try catch tramite il throws Exception nel metodo modificaCosto
                        System.out.println(e.getMessage());
                    }
                }

                case 3 -> {
                    System.out.println("Visualizza vetrina");
                    vetrina.forEach(System.out::println); // metodo forEach delle liste che per ogni fiore esegue un println
                }

                case 4 -> {
                    System.out.println("Fine");
                    uscita = true; // uscita dal programma
                }
            }
        } while (!uscita);
    }

    public static boolean checkSpace(ArrayList<Fiore> vetrina, final int MAXFIORI) throws Exception {
        if (vetrina.size() < MAXFIORI) { // controlla se c'è spazio
            return true;
        } else {
            throw new Exception("VETRINA PIENA");
        }
    }

    public static Fiore creazioneFiore(Scanner sc) { // metodo che permette la creazione di un Fiore
        System.out.println("Inserisci il nome del fiore: ");
        String nome = sc.nextLine();
        int tipologia;
        do {
            System.out.println("Inserisci la tipologia del fiore:\n" +
                    "1. ROSE\n" +
                    "2. TULIPANI\n" +
                    "3. VIOLE\n" +
                    "4. GERBERE");
            tipologia = Integer.parseInt(sc.nextLine()); // Integer.parseInt per fare in modo che il buffer non dia problemi
        } while (tipologia < 1 || tipologia > 4); // ciclo che si ripete affinchè tipologia sia una scelta valida
        System.out.println("Inserisci il costo del fiore: ");
        int costo = Integer.parseInt(sc.nextLine());

        return new Fiore(nome, Tipologia.values()[tipologia - 1], costo); // passo come Tipologia il .values che converte tipologia(int) in tipo Tipologia
    }

    public static boolean fioreDoppio(ArrayList<Fiore> vetrina, Fiore f) {
        for (int i = 0; i < vetrina.size(); i++) {
            if (f.nome.equals(vetrina.get(i).nome)) {
                return true;
            }
        }
        return false;
    }

    public static void modificaCosto(String nomeFiore, Scanner sc, ArrayList<Fiore> vetrina) throws Exception { // metodo che modifica il costo del fiore
        for (Fiore f : vetrina) {
            if (nomeFiore.equals(f.nome)) {
                System.out.println("Inserisci il nuovo costo: ");
                int nuovoCosto = Integer.parseInt(sc.nextLine());
                if (nuovoCosto <= (f.costo + (f.costo * 0.1))) // se il nuovoCosto aumenta di meno del 10% assegna nuovoCosto a f.costo
                    f.costo = nuovoCosto;
                else {
                    throw new Exception("Prezzo inserito troppo grande"); // generazione dell'eccezione
                }
            }
        }
    }
}