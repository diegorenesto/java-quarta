import java.util.ArrayList;

public class Negozio {

    private ArrayList<ProdottoElettronico> prodotti;

    public Negozio() {
        prodotti = new ArrayList<>();
    }

    public void addProdotto(ProdottoElettronico prodotto) throws CloneNotSupportedException {
        if (prodotto != null) {
            if (!(prodotti.contains(prodotto))) prodotti.add(prodotto.clone());
            else throw new CloneNotSupportedException();
        } else throw new NullPointerException();
    }

    public void removeProdotto(int codice) {
        prodotti.removeIf(p -> p.getCodiceProdotto() == codice);
    }

    public ProdottoElettronico ricercaPerCodice(int codice) throws CloneNotSupportedException {
        for (ProdottoElettronico p : prodotti) {
            if (p.getCodiceProdotto() == codice) return p.clone();
        }
        return null;
    }

    public void modificaPrezzo(int codice, int prezzo) throws Exception {
        for (ProdottoElettronico p : prodotti) {
            if (p.getCodiceProdotto() == codice) p.setPrezzo(prezzo);
        }
    }

    public ArrayList<ProdottoElettronico> ritornaLista() throws CloneNotSupportedException {
        ArrayList<ProdottoElettronico> temp = new ArrayList<>(); // ArrayList temporanea per rispettare l'incapsulamento
        for (ProdottoElettronico p : prodotti) {
            temp.add(p.clone());
        }
        return temp;
    }

}