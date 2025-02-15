public class Giocatore {
    private String nome;
    private String cognome;
    private int vittore;
    private int numUscito;

    public Giocatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.vittore = 0;
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

    public int getVittore() {
        return vittore;
    }

    public void haVinto() {
        System.out.println(nome + " " + cognome + " ha vinto");
        this.vittore++;
    }

    public void pareggio() {
        this.vittore++;
    }

    public int lanciaDado() {
        Dado dado = new Dado(6);
        numUscito = dado.lanciaDado();
        return numUscito;
    }


    @Override
    public String toString() {
        return String.format("Nome: %s, Cognome: %s", nome, cognome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Giocatore giocatore = (Giocatore) o;
        return nome.equals(giocatore.nome) && cognome.equals(giocatore.cognome);
    }
}