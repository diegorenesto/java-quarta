import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static utility.Tools.Menu;

public class Frontend {
    public void avvia() {
        Scanner tastiera = new Scanner(System.in);
        Random random = new Random();
        boolean uscita = false;
        List<Pilota> piloti = new ArrayList<>();
        List<Scuderia> scuderie = new ArrayList<>();
        List<Cronometro> cronometri = new ArrayList<>();

        String[] opzioni = {"---GARA AUTOMOBILISTICA---", "1. Inserimento Piloti", "2. Scuderie", "3. Cronometri", "4. Risultato", "5. Fine"};

        while (!uscita) {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    System.out.println("Inserimento piloti");
                    System.out.print("Da quanti piloti e' composta la gara: ");
                    int numPiloti = Integer.parseInt(tastiera.nextLine());

                    for (int i = 0; i < numPiloti; i++) {
                        System.out.println("Inserimento pilota " + (i + 1));
                        piloti.add(metodoCreazionePilota(tastiera));
                    }
                }

                case 2 -> {
                    System.out.println("Scuderie");
                    scuderie.clear(); // Pulisce le scuderie precedenti
                    for (int i = 0; i < piloti.size(); i++) {
                        System.out.println("Inserisci il nome della Scuderia per il pilota " + piloti.get(i).getNome() + ": ");
                        String nomeScuderia = tastiera.nextLine();
                        scuderie.add(new Scuderia(nomeScuderia, random.nextInt(1000, 5000), piloti.get(i)));
                    }
                }

                case 3 -> {
                    System.out.println("Cronometri");
                    for (int i = 0; i < scuderie.size(); i++) {
                        Cronometro cr = new Cronometro();
                        int tempoGiro = random.nextInt(1000, 5000);

                        // inizio gara
                        cr.setStartTime();
                        wait(tempoGiro);
                        cr.setEndTime();
                        try {
                            cr.calcolaIntTimer();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }

                        cronometri.add(cr);

                        System.out.println("Tempo Scuderia " + scuderie.get(i).getScuderia() + ": " + cr.getTempoGiro() + " secondi");
                    }
                }

                case 4 -> {
                    System.out.println("Risultato: ");
                    Pilota vincitore = null;
                    Scuderia scuderiaVincitrice = null;
                    double migliorTempo = Double.MAX_VALUE;

                    for (int i = 0; i < cronometri.size(); i++) {
                        Cronometro cr = cronometri.get(i);
                        if (cr.getTempoGiro() < migliorTempo) {
                            migliorTempo = cr.getTempoGiro();
                            vincitore = scuderie.get(i).getPilota();
                            scuderiaVincitrice = scuderie.get(i);
                        }
                    }

                    if (vincitore != null) {
                        System.out.println("La scuderia " + scuderiaVincitrice.getScuderia() +
                                " con il pilota " + vincitore.getNome() + " ha vinto con un tempo di " + migliorTempo + " secondi");
                    } else {
                        System.out.println("La gara è finita in pareggio");
                    }
                }

                case 5 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        }
    }

    private static void wait(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Pilota metodoCreazionePilota(Scanner tastiera) {
        System.out.println("Inserisci il nome del pilota: ");
        String nome = tastiera.nextLine();
        System.out.println("Inserisci il cognome del pilota: ");
        String cognome = tastiera.nextLine();
        System.out.println("Inserisci la nazionalita del pilota: ");
        String nazionalita = tastiera.nextLine();

        return new Pilota(nome, cognome, nazionalita);
    }
}