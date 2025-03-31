import java.util.ArrayList;

/**
 * @author Diego Renesto
 * @version 1.0
 * @since 31/03/2025
 */
public class Negozio {

    private ArrayList<Prodotto> prodotti;

    /**
     * metodo costruttore di Negozio
     */
    public Negozio() {
        prodotti = new ArrayList<>();
    }

    /**
     * metodo per aggiungere un prodotto alla lista
     *
     * @param prodotto
     * @throws Exception
     */
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

    /**
     * metodo per rimuovere un prodotto dalla lista
     *
     * @param codice
     * @throws Exception
     */
    public void removeProdotto(int codice) throws Exception {
        for (Prodotto p : prodotti) {
            if (p instanceof Smartphone && ((Smartphone) p).getCodice() == (codice)) {
                prodotti.remove(p);
                System.out.println("Smartphone rimosso con successo");
                return;
            } else if (p instanceof Manuale && ((Manuale) p).getCodice() == codice) {
                prodotti.remove(p);
                System.out.println("Manuale rimosso con successo");
                return;
            }
            throw new Exception("Prodotto non trovato");
        }
    }


    /**
     * ritorna un ArrayList<Prodotto> temporanea per rispettare l'incapsulamento
     *
     * @return ArrayList<Prodotto>
     * @throws CloneNotSupportedException
     */
    public ArrayList<Prodotto> ritornaLista() throws CloneNotSupportedException {
        ArrayList<Prodotto> temp = new ArrayList<>(); // ArrayList temporanea per rispettare l'incapsulamento
        for (Prodotto p : prodotti) {
            temp.add(p);
        }
        return temp;
    }
}