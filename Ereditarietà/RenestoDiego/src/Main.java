import java.util.Scanner;

import static utility.Tools.Menu;

// RENESTO DIEGO 4F FILA A
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        String[] opzioni = {"VIVAIO", "1. Inserisci pianta", "2. Stampa vivaio", "3. Ricerca pianta", "4. Vendi pianta", "5. Ricerca per categoria", "6. Ricerca per mese di fioritura", "7. Ricerca per prezzo", "8 Fine"};
        Vivaio vivaio = new Vivaio("VIVAIO");
        do {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    System.out.println("Inserisci pianta");
                    Pianta pianta = vivaio.creaPianta(tastiera);
                    vivaio.aggiungiPianta(pianta);
                }
                case 2 -> {
                    System.out.println("Stampa vivavio");
                    vivaio.stampaVivaio();
                }
                case 3 -> {
                    System.out.println("Ricerca pianta");
                    Pianta piantaDaCercare = vivaio.creaPianta(tastiera);
                    if (vivaio.ricercaPianta(piantaDaCercare))
                        System.out.println(piantaDaCercare);
                    else
                        System.out.println(PiantaException.getFindMessage());
                }
                case 4 -> {
                    System.out.println("Vendi pianta");
                    Pianta piantaDaVendere = vivaio.creaPianta(tastiera);
                    if (vivaio.ricercaPianta(piantaDaVendere))
                        vivaio.vendiPianta(piantaDaVendere);
                }
                case 5 -> {
                    System.out.println("Ricerca per categoria");
                    System.out.println("Inserisci la categoria:\n" +
                            "1. ERBACEE,\n" +
                            "2. ARBUSTIVE,\n" +
                            "3. ARBOREE");
                    int categoria = Integer.parseInt(tastiera.nextLine());
                    vivaio.ricercaCategoria(Tipologia.values()[categoria - 1]);
                }

                case 6 -> {
                    System.out.println("Ricerca per mese di fioritura");
                    System.out.println("Inserisci il mese di fioritura: ");
                    String meseFioritura = tastiera.nextLine();
                    vivaio.ricercaMeseFioritura(meseFioritura);
                }
                case 7 -> {
                    System.out.println("Ricerca per prezzo");
                    System.out.println("Inserisci il prezzo: ");
                    int prezzo = Integer.parseInt(tastiera.nextLine());
                    vivaio.ricercaPrezzo(prezzo);
                }
                case 8 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);
    }
}