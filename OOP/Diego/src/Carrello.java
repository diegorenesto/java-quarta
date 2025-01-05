import java.util.ArrayList;
import java.util.Scanner;

// Classe principale Carrello
public class Carrello {
    private ArrayList<Tablet> listaTablet = new ArrayList<>();
    private int spaziTablet;
    private String nome;

    public Carrello(int spaziTablet, String nome) {
        this.spaziTablet = spaziTablet;
        this.nome = nome;
    }

    public int getSpaziTablet() {
        return spaziTablet;
    }

    public String getNome() {
        return nome;
    }

    public void aggiungiTablet(Tablet t1) {
        if (listaTablet.size() < spaziTablet) {
            listaTablet.add(t1);
            System.out.println("Tablet aggiunto con successo.");
        } else {
            System.out.println("Carrello pieno! Impossibile aggiungere altri tablet.");
        }
    }

    public void rimuoviTablet(int identifier) {
        boolean rimosso = listaTablet.removeIf(t -> t.getIdentifier() == identifier);
        if (rimosso) {
            System.out.println("Tablet rimosso con successo.");
        } else {
            System.out.println("Tablet non trovato.");
        }
    }

    public void modificaStato(int identifier, Stato nuovoStato) {
        for (Tablet tablet : listaTablet) {
            if (tablet.getIdentifier() == identifier) {
                tablet.setStatoTablet(nuovoStato);
                System.out.println("Stato del tablet aggiornato a " + nuovoStato + ".");
                return;
            }
        }
        System.out.println("Tablet non trovato.");
    }

    public void visualizzaTablet() {
        if (listaTablet.isEmpty()) {
            System.out.println("Il carrello è vuoto.");
        } else {
            System.out.println("Lista dei tablet nel carrello:");
            for (Tablet tablet : listaTablet) {
                System.out.println(tablet);
            }
        }
    }

    public Tablet cercaTablet(int identifier) {
        for (Tablet tablet : listaTablet) {
            if (tablet.getIdentifier() == identifier) {
                return tablet;
            }
        }
        return null;
    }

    public int contaTabletPerStato(Stato stato) {
        int cont = 0;
        for (Tablet tablet : listaTablet) {
            if (tablet.getStatoTablet() == stato) {
                cont++;
            }
        }
        return cont;
    }


}