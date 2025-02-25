import java.util.Scanner;

public class Partita {
    private Giocatore g1;
    private Giocatore g2;
    int nPartite;
    private boolean partitaInCorso;
    private Dado dado;

    public Partita(Giocatore g1, Giocatore g2, int nPartite, Dado dado) {
        this.g1 = g1;
        this.g2 = g2;
        this.nPartite = nPartite;
        this.dado = dado;
        this.partitaInCorso = true;
    }

    public boolean getPartitaInCorso() {
        return partitaInCorso;
    }

    public void giocaPartita() {
        Scanner tastiera = new Scanner(System.in);
        for (int j = 1; j <= nPartite; j++) {
            System.out.println("Quanti round vuoi giocare?");
            int nRound = tastiera.nextInt();
            for (int i = 1; i <= nRound; i++) {
                System.out.println("\nRound " + i + " :");
                int num1 = g1.lanciaDado();
                System.out.println("Giocatore 1 lancia il dado: " + g1.getNumUscito());
                int num2 = g2.lanciaDado();
                System.out.println("Giocatore 2 lancia il dado: " + g2.getNumUscito());

                if (num1 > num2) g1.haVinto();
                else if (num1 < num2) g2.haVinto();
                else {
                    System.out.println("PAREGGIO");
                    g1.pareggio();
                    g2.pareggio();
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (g1.getRoundVinti() > g2.getRoundVinti())
                g1.vittoria();
            else if (g1.getRoundVinti() < g2.getRoundVinti())
                g2.vittoria();
            else
                System.out.println("La partita e' finita in pareggio");
        }
    }

    public void finePartita() {
        System.out.println("Giocatore 1: " + g1.getNome() + " " + g1.getCognome() + " ha vinto " + g1.getRoundVinti() + " round");
        System.out.println("Giocatore 2: " + g2.getNome() + " " + g2.getCognome() + " ha vinto " + g2.getRoundVinti() + " round");
        partitaInCorso = false;
    }

    public void vincitore() {
        int confronto = g1.compareTo(g2);
        if (confronto > 0)
            System.out.println("Il vincitore e': " + g1);
        else if (confronto < 0)
            System.out.println("Il vincitore e': " + g2);
        else
            System.out.println("La partita e' finita in pareggio");

    }

    public void resetGame() {
        g1.reset();
        g2.reset();
        this.nPartite = 0;
        this.dado = null;
        System.out.println("Partita resettata");
    }

    @Override
    public String toString() {
        return String.format("Giocatore 1: %s, Giocatore 2: %s, Numero partite: %d", g1, g2, nPartite);
    }
}