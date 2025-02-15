public class Giocatore {
    private String nome;
    private String cognome;
    private int roundVinti; // round
    private int numUscito;
    private int partiteVinte = 0; // partita = insieme di round

    public Giocatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.roundVinti = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }


    public int getNumUscito() {
        return numUscito;
    }

    public int getRoundVinti() {
        return roundVinti;
    }

    public void vittoria() { // vittoria partita (insieme di più round)
        partiteVinte++;
    }

    public int getPartiteVinte() {
        return partiteVinte;
    }

    public void haVinto() { // vittoria round
        System.out.println(nome + " " + cognome + " ha vinto");
        this.roundVinti++;
    }

    public void pareggio() {
        this.roundVinti++;
    }

    public int lanciaDado() {
        Dado dado = new Dado(6);
        numUscito = dado.lanciaDado();
        return numUscito;
    }

    public void reset() { // metodo usato per fare in modo che la partita venga resettata
        this.nome = null;
        this.cognome = null;
        this.roundVinti = 0;
        this.numUscito = 0;
    }


    @Override
    public String toString() {
        return String.format("Nome: %s, Cognome: %s", nome, cognome);
    }
}