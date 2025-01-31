import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.Menu;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int incassoGiornaliero = 0;
        final int MAXCLIENTI = 3;
        int numClienti = 0;
        int numTagliandi = 0;

        String[] opzioni = {"---OFFICINA---", "1. Primo intervento", "2. Nuovo intervento", "3. Visualizza tagliandi", "4. Visualizza incasso", "5. Fine"};
        boolean uscita = false;

        ArrayList<Tagliando> listaTagliandi = new ArrayList<>();

        do {
            switch (Menu(opzioni, sc)) {
                case 1 -> {
                    if (numClienti <= MAXCLIENTI) {
                        System.out.println("Primo intervento");

                        System.out.println("Intervento da eseguire: (ispezione, riparazione, sostituzione)");
                        Interventi operazione = Interventi.valueOf(sc.nextLine());
                        System.out.println("Costo intervento: ");
                        int costo = Integer.parseInt(sc.nextLine());
                        System.out.println("Data intervento: (anno-mese-giorno)");
                        LocalDate data = LocalDate.parse(sc.nextLine());

                        listaTagliandi.add(primoIntervento(++numTagliandi, operazione, costo, data));
                        numClienti++;
                        incassoGiornaliero += costo;
                    } else {
                        System.out.println("Raggiunto il numero massimo di clienti");
                    }
                }
                case 2 -> {
                    System.out.println("Nuovo intervento");

                    System.out.println("Inserisci numero tagliando");
                    int tagliandoDaCercare = Integer.parseInt(sc.nextLine());
                    if (cercaTagliando(tagliandoDaCercare, listaTagliandi) == -1) {
                        System.out.println("Numero cliente non presente");
                    } else {
                        System.out.println("Intervento da eseguire: (ispezione, riparazione, sostituzione)");
                        Interventi operazione = Interventi.valueOf(sc.nextLine());
                        System.out.println("Costo intervento: ");
                        int costo = Integer.parseInt(sc.nextLine());
                        System.out.println("Data intervento: (anno-mese-giorno)");
                        LocalDate data = LocalDate.parse(sc.nextLine());

                        listaTagliandi.add(nuovoIntervento(tagliandoDaCercare, operazione, costo, data));
                        incassoGiornaliero += costo;
                    }
                }
                case 3 -> {
                    System.out.println("Visualizza tagliandi");
                    for (int i = 0; i < listaTagliandi.size(); i++) {
                        System.out.println(listaTagliandi.toString());
                    }
                }
                case 4 -> {
                    System.out.println("Visualizzazione incassi");
                    System.out.println(incassoGiornaliero + " euro");
                }
                case 5 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);

    }

    public static Tagliando primoIntervento(int numTagliandi, Interventi operazione, int costo, LocalDate data) {
        Tagliando primoTagliando = new Tagliando();
        primoTagliando.id_tagliando = numTagliandi;
        primoTagliando.interventi = operazione;
        primoTagliando.costo = costo;
        primoTagliando.data = data;
        return primoTagliando;
    }

    public static int cercaTagliando(int tagliandoDaCercare, ArrayList<Tagliando> listTagliandi) {
        for (Tagliando tagliando : listTagliandi) {
            if (tagliando.id_tagliando == tagliandoDaCercare) {
                return tagliandoDaCercare;
            }
        }
        return -1;
    }

    public static Tagliando nuovoIntervento(int tagliandoDaCercare, Interventi operazione, int costo, LocalDate data) {
        Tagliando nuovoTagliando = new Tagliando();
        nuovoTagliando.id_tagliando = tagliandoDaCercare;
        nuovoTagliando.interventi = operazione;
        nuovoTagliando.costo = costo;
        nuovoTagliando.data = data;
        return nuovoTagliando;
    }
}