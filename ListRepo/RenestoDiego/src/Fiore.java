public class Fiore {
    public String nome;
    public Tipologia tipo; // enumeratore Tipologia
    public int costo;

    public Fiore(String nome, Tipologia tipo, int costo) { // metodo costruttore che inizializza un oggetto Fiore
        this.nome = nome;
        this.tipo = tipo;
        this.costo = costo;
    }

    @Override
    public String toString() { // metodo toString che stampa gli attributi del fiore
        return String.format("Nome: %s, Tipo: %s, Costo: %s", nome, tipo, costo);
    }

}