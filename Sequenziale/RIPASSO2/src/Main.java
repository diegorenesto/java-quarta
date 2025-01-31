import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uscita = false;
        int idBiglietto = 0;
        final int MAXCLIENTI = 3;
        ArrayList<Persona> clienti = new ArrayList<Persona>();

        String[] opzioni = {"LUNA PARK", "1. Ingresso", "2. Uscita", "3. Vai in giostra", "4. Visualizza giostre", "5. Fine"};

        do {
            int scelta = Menu(opzioni, sc);
            switch (scelta) {
                case 1 -> {
                    System.out.println("Ingresso");
                    entra(idBiglietto, clienti, MAXCLIENTI);
                    idBiglietto++;
                }

                case 2 -> {
                    System.out.println("Uscita");
                    System.out.println("Inserisci il numero del biglietto: ");
                    int bigliettoUscita = Integer.parseInt(sc.nextLine());
                    esci(bigliettoUscita, clienti);
                }

                case 3 -> {
                    System.out.println("Vai in giostra");
                    System.out.println("Inserisci il numero del biglietto: ");
                    int bigliettoGiostra = Integer.parseInt(sc.nextLine());
                    System.out.println("In che giostra vuoi andare: 1. RUOTAPANORAMICA, 2. OTTOVOLANTE, 3. AUTOSCONTRO, 4. TAGADA");
                    int sceltaGiostra = Integer.parseInt(sc.nextLine());
                    if (sceltaGiostra >= 1 && sceltaGiostra <= 4) {
                        resitraGiro(bigliettoGiostra, Giostre.values()[sceltaGiostra - 1], clienti);
                    } else
                        System.out.println("Scelta non valida");
                }

                case 4 -> {
                    System.out.println("Visualizza giostra");
                    System.out.println("Inserisci il numero del biglietto: ");
                    int bigliettoVisualizza = Integer.parseInt(sc.nextLine());
                    visualizzaGiostre(bigliettoVisualizza, clienti);
                }

                case 5 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);
        
    }

    public static void entra(int idBiglietto, ArrayList<Persona> clienti, final int MAXCLIENTI) {
        if (clienti.size() >= MAXCLIENTI) {
            System.out.println("Luna park pieno!");
        } else {
            Persona persona = new Persona(++idBiglietto);
            clienti.add(persona);
            System.out.println("Persona entrata con biglietto: " + idBiglietto);
        }
    }

    public static void esci(int idBiglietto, ArrayList<Persona> clienti) {
        for (int i = 0; i < clienti.size(); i++) {
            if (clienti.get(i).idBiglietto == idBiglietto) {
                clienti.remove(i);
                System.out.println("Persona uscita con biglietto: " + idBiglietto);
            }
            return;
        }
        System.out.println("Errore: biglietto non valido");
    }

    public static void resitraGiro(int idBiglietto, Giostre giostra, ArrayList<Persona> clienti) {
        for (Persona p : clienti) {
            if (p.idBiglietto == idBiglietto) {
                p.giostreProvate.add(giostra);
                p.orariGiostre.add(new Date());
                System.out.println("Giro registrato su " + giostra + " per il biglietto " + idBiglietto);
                return;
            }
        }
        System.out.println("Errore: persona non trovata");
    }

    public static void visualizzaGiostre(int idBiglietto, ArrayList<Persona> clienti) {
        for (Persona p : clienti) {
            if (p.idBiglietto == idBiglietto) {
                System.out.println("Biglietto " + idBiglietto + " ha provato:");
                for (int i = 0; i < p.giostreProvate.size(); i++) {
                    System.out.println("Giostra: " + p.giostreProvate.get(i) + ", Orario: " + p.orariGiostre.get(i));
                }
                return;
            }
        }
        System.out.println("Errore: persona non trovata");
    }
}