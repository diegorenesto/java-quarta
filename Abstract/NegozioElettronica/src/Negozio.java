import java.util.ArrayList;

public class Negozio {
    private ArrayList<ProdottoElettronico> prodotti;

    public Negozio() {
        prodotti = new ArrayList<>();
    }

    public void addProdotto(ProdottoElettronico prodotto) throws CloneNotSupportedException {
        if (prodotto != null && !(prodotti.contains(prodotto)))
            prodotti.add(prodotto.clone());
        else
            throw new CloneNotSupportedException();
    }

    public void removeProdotto(ProdottoElettronico prodotto) {

    }

    public ProdottoElettronico ricercaCodice(int code) {
        for (ProdottoElettronico p : prodotti) {
            if (p.getCodiceProdotto() == code)
                return p;
        }
        return null;
    }

    public ProdottoElettronico modificaPrezzo(ProdottoElettronico prodotto, int prezzo) throws Exception {
        if (prodotto != null) {
            if (prodotti.contains(prodotto)) {
                ProdottoElettronico prodClone = prodotto.clone();
                prodClone.setPrezzo(prezzo);
                return prodClone;
            } else
                throw new Exception();
        } else
            throw new Exception();
    }

    public ArrayList<ProdottoElettronico> ritornaLista() throws CloneNotSupportedException {
        ArrayList<ProdottoElettronico> temp = new ArrayList<>();
        for (ProdottoElettronico p : prodotti) {
            temp.add(p.clone());
        }
        return temp;
    }

}