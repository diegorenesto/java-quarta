import java.util.ArrayList;

public class Negozio {

    //    private ArrayList<ProdottoElettronico> prodotti;
    private ArrayList<Prodotto> prodotti;

    public Negozio() {
        prodotti = new ArrayList<>();
    }

    public void addProdotto(Prodotto prodotto) throws Exception {
//        if (prodotto != null) {
//            if (!(prodotti.contains(prodotto)))
//                prodotti.add(prodotto.clone());
//            else
//                throw new CloneNotSupportedException();
//        } else
//            throw new NullPointerException();
        if (prodotto != null) {
            if (!(prodotti.contains(prodotto)))
                prodotti.add(prodotto); // NON uso clone() perche' l oggetto deriva da un interfaccia
            else
                throw new Exception();
        }
    }

    public void removeProdotto(int codice) {
        for (Prodotto p : prodotti) {
            if (p instanceof ProdottoElettronico && ((ProdottoElettronico) p).getCodiceProdotto() == (codice)) {
                prodotti.remove(p);
                System.out.println("Smartphone rimosso con successo");
            } else if (p instanceof Libro && ((Libro) p).getIsbn() == codice) {
                prodotti.remove(p);
                System.out.println("Manuale rimosso con successo");
            }
        }
    }


    public ArrayList<Prodotto> ritornaLista() throws CloneNotSupportedException {
        ArrayList<Prodotto> temp = new ArrayList<>(); // ArrayList temporanea per rispettare l'incapsulamento
        for (Prodotto p : prodotti) {
            temp.add(p);
        }
        return temp;
    }
}