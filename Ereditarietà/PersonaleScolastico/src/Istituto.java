import java.util.ArrayList;

public class Istituto {

    // Aggiungi dipendente assicurandosi ceh il nome non corrisponda, stampa gli incentivi dei dipendenti
    private String nome;
    private ArrayList<Dipendente> scuola;

    public Istituto(String nome) {
        ;
        this.nome = nome;
        scuola = new ArrayList<>();
    }

    public ArrayList<Dipendente> getScuola() {
        return scuola;
    }

    public void setScuola(ArrayList<Dipendente> scuola) {
        this.scuola = scuola;
    }

    public void addDipendente(Dipendente d) throws Exception {
        if (!scuola.contains(d))
            scuola.add(d);
        else
            throw new Exception("Il dipendente e' gia' presente nella lista");
    }


}