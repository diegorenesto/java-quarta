public class Giocatore {
    private String nome;
    private String cognome;
    private Dado dado;
    private int roundVinti = 0;
    private int partiteVinte = 0;
    private int vittorieConsecutive = 0;
    private int punti = 0; // si accumulano vincendo una partita, o vincendone tre di fila

    public Giocatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        dado = new Dado(6);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Dado getDado() {
        return dado;
    }

    public int getRoundVinti() {
        return roundVinti;
    }

    public int getPartiteVinte() {
        return partiteVinte;
    }

    public int getVittorieConsecutive() {
        return vittorieConsecutive;
    }

    public int getPunti() {
        return punti;
    }

    public void vinceRound() {
        System.out.println("RISULTATO: " + nome + " " + cognome + " ha vinto il round");
        roundVinti++;
    }

    public void pareggio() {
        roundVinti++;
    }

    public void restart() { // resetta i round vinti per le partite successive
        roundVinti = 0;
    }

    public void vincePartita() {
        System.out.println("VINCITORE: " + nome + " " + cognome);
        partiteVinte++;
        punti++;
    }

    public void incrementaVittorieConsecutive() {
        vittorieConsecutive++;
    }

    public void azzeraVittorieConsecutive() {
        vittorieConsecutive = 0;
    }

    public void vinceTreConsecutive() {
        punti++;
        azzeraVittorieConsecutive();
    }

    @Override
    public String toString() {
        return String.format("Nome: %s Cognome: %s", nome, cognome);
    }
}