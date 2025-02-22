public class Pianta {
    /*            Pianta con codiceAlfanumerico, categoria, colore, mesePotatura, meseFioritura, prezzo
     */
    private String codiceAlfanumerico;
    private Tipologia tipologia;
    private String colore;
    private String mesePotatura;
    private String meseFioritura;
    private int prezzo;

    public Pianta(String codiceAlfanumerico, Tipologia tipologia, String colore, String mesePotatura, String meseFioritura, int prezzo) {
        this.codiceAlfanumerico = codiceAlfanumerico;
        this.tipologia = tipologia;
        this.colore = colore;
        this.mesePotatura = mesePotatura;
        this.meseFioritura = meseFioritura;
        this.prezzo = prezzo;
    }

    public String getCodiceAlfanumerico() {
        return codiceAlfanumerico;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public String getColore() {
        return colore;
    }

    public String getMesePotatura() {
        return mesePotatura;
    }

    public String getMeseFioritura() {
        return meseFioritura;
    }

    public int getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return String.format("Codice alfanumerico: %s, Tipologia: %s, Colore: %s, Mese potatura: %s, Mese Fioritura: %s, Prezzo: %d", codiceAlfanumerico, tipologia, colore, mesePotatura, meseFioritura, prezzo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pianta pianta = (Pianta) o;
        return codiceAlfanumerico.equals(pianta.codiceAlfanumerico) && tipologia == pianta.tipologia && colore.equals(pianta.colore);
    }
}