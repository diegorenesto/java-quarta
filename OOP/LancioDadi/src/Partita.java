public class Partita {
    private Giocatore g1;
    private Giocatore g2;
    private int nRound;
    private boolean status = false;

    public Partita(Giocatore g1, Giocatore g2, int nPartite) {
        this.g1 = g1;
        this.g2 = g2;
        this.nRound = nPartite;
    }

    public Giocatore getG1() {
        return g1;
    }

    public Giocatore getG2() {
        return g2;
    }

    public int getnRound() {
        return nRound;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void giocaPartita() {
        for (int i = 1; i <= nRound; i++) {
            System.out.println("\nRound " + i + " :");
            int num1 = g1.lanciaDado();
            System.out.println("Giocatore 1 lancia il dado: " + g1.getNumUscito());
            int num2 = g2.lanciaDado();
            System.out.println("Giocatore 2 lancia il dado: " + g2.getNumUscito());

            if (num1 > num2)
                g1.haVinto();
            else if (num1 < num2)
                g2.haVinto();
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
    }

    public void finePartita() {
        System.out.println("Giocatore 1: " + g1.getNome() + " " + g1.getCognome() + " ha vinto " + g1.getVittore() + " round");
        System.out.println("Giocatore 2: " + g2.getNome() + " " + g2.getCognome() + " ha vinto " + g2.getVittore() + " round");
    }

    public void vincitore() {
        if (g1.getVittore() > g2.getVittore())
            System.out.println("Il vincitore e': " + g1);

        else if (g1.getVittore() < g2.getVittore())
            System.out.println("Il vincitore e': " + g1);
        else {
            System.out.println("La partita e' finita in pareggio");
        }
    }

    @Override
    public String toString() {
        return String.format("Giocatore 1: %s, Giocatore 2: %s, Numero partite: %d", g1, g2, nRound);
    }
}