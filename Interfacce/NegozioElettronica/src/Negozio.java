import java.util.ArrayList;

public class Negozio {

    private ArrayList<Prodotto> prodotti;

    public Negozio() {
        prodotti = new ArrayList<>();
    }

    public void addProdotto(Prodotto prodotto) throws Exception {
//        if (prodotto != null) {
//            if (!(prodotti.contains(prodotto)))
//                prodotti.add(prodotto); // NON uso clone() perche' l oggetto deriva da un interfaccia
//            else
//                throw new Exception();
//        }
        if (prodotto instanceof Smartphone) {
            if (!(prodotti.contains(prodotto))) {
                prodotti.add(((Smartphone) prodotto).clone());
            }
        } else if (prodotto instanceof Manuale) {
            if (!(prodotti.contains(prodotto))) {
                prodotti.add(((Manuale) prodotto).clone());
            }
        } else
            throw new Exception("Prodotto non trovato");
    }

    public void removeProdotto(int codice) throws Exception {
        for (Prodotto p : prodotti) {
            if (p instanceof Smartphone && ((Smartphone) p).getCodiceProdotto() == (codice)) {
                prodotti.remove(p);
                System.out.println("Smartphone rimosso con successo");
                return;
            } else if (p instanceof Manuale && ((Manuale) p).getIsbn() == codice) {
                prodotti.remove(p);
                System.out.println("Manuale rimosso con successo");
                return;
            }
            throw new Exception("Prodotto non trovato");
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