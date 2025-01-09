import java.util.Objects;


public class Automobile implements Comparable<Automobile>{

    /*
     * creare classe Automobile:
     * att. marca modello cilindrata.
     * getter setter
     * 1 costrutore che accetta attributi
     * 1 costruttore che accetta un tipo Automobile
     * metodo toString (con override) per la stampa dei tre attributi.
     * metodo per verificare se due auto sono uguali.
     * provare il metodo del punto precedente nel main
     * metodo per confrontare due auto in base alla cilindrata
     * provare il metodo del punto precedente nel main
     * creare lista (nel main) di auto (5-6) e stamparla
     * ordinare la lista in ordine crescente di cilindrata e stampare
     * ordinare la lista in ordine decrescente di cilindrata e stampare
     * */


    private String marca;
    private String modello;
    private Integer cilindrata;


    public Automobile(String marca, String modello, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }


    public Automobile(Automobile auto) {
    }


    public String getMarca() {
        return marca;
    }


    public String getModello() {
        return modello;
    }


    public int getCilindrata() {
        return cilindrata;
    }


    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }


    @Override
    public String toString() {
        return String.format("Marca: %s, Modello: %s, Cilindrata: %d", marca, modello, cilindrata);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile auto = (Automobile) o;
        return cilindrata == auto.cilindrata && Objects.equals(marca, auto.marca) && Objects.equals(modello, auto.modello);
    }

    @Override
    public int compareTo(Automobile auto) {
        return this.cilindrata.compareTo(auto.cilindrata);
    }
}
