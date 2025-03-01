import java.util.Scanner;

public class Partita {
    private Giocatore g1;
    private Giocatore g2;

    public Partita(Giocatore g1, Giocatore g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public Giocatore getG1() {
        return g1;
    }

    public Giocatore getG2() {
        return g2;
    }

    public void giocaRound() {
        System.out.println(g1.getNome() + " " + g1.getCognome() + " lancia il dado: " + g1.getDado().lanciaDado());
        System.out.println(g2.getNome() + " " + g2.getCognome() + " lancia il dado: " + g2.getDado().lanciaDado());
        if (g1.getDado().compareTo(g2.getDado()) > 0)
            g1.vinceRound();
        else if (g1.getDado().compareTo(g2.getDado()) < 0)
            g2.vinceRound();
        else {
            System.out.println("Il round e' finito in pareggio");
            g1.pareggio();
            g2.pareggio();
        }
        System.out.print("\n");
    }

    public void giocaPartita() {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Quanti round vuoi giocare: ");
        int nRound = tastiera.nextInt();
        for (int i = 0; i < nRound; i++) {
            giocaRound();
        }
        vincitore();
    }

    public void giocaPartitaAvanzata() {
        restart();
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Quanti round vuoi giocare: ");
        int nRound = tastiera.nextInt();
        for (int i = 0; i < nRound; i++) {
            giocaRound();
        }
        if (g1.getVittorieConsecutive() == 3)
            g1.vinceTreConsecutive();
        else if (g2.getVittorieConsecutive() == 3)
            g2.vinceTreConsecutive();
        vincitoreAvanzato();
        decretoPunti();
    }

    public void vincitore() { // vincitore della partita
        if (g1.getRoundVinti() > g2.getRoundVinti())
            g1.vincePartita();
        else if (g2.getRoundVinti() > g1.getRoundVinti())
            g2.vincePartita();
        else
            System.out.println("PARTITA FINITA IN PAREGGIO");
    }

    public void vincitoreAvanzato() {
        if (g1.getRoundVinti() > g2.getRoundVinti()) {
            g1.vincePartita();
            g1.incrementaVittorieConsecutive();
            g2.azzeraVittorieConsecutive();
        } else if (g2.getRoundVinti() > g1.getRoundVinti()) {
            g2.vincePartita();
            g2.incrementaVittorieConsecutive();
            g1.azzeraVittorieConsecutive();
        } else {
            System.out.println("PARTITA FINITA IN PAREGGIO");
            g1.azzeraVittorieConsecutive();
            g2.azzeraVittorieConsecutive();
        }
    }

    public void decretoPunti() { // stampa dei punti (incremento per vittoria, e per 3 vittorie consecutive)
        System.out.println("Punti giocatore1: " + g1.getPunti());
        System.out.println("Punti giocatore2: " + g2.getPunti());
    }

    public void restart() { // resetta i round vinti per le partite successive
        g1.restart();
        g2.restart();
    }
}