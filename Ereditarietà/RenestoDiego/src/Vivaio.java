import java.util.ArrayList;
import java.util.Scanner;

public class Vivaio {
    private String nome;
    private ArrayList<Pianta> piante;

    public Vivaio(String nome) {
        this.nome = nome;
        piante = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Pianta> getPiante() {
        return piante;
    }

    public Pianta creaPianta(Scanner tastiera) { // categoria, colore, mesePotatura, meseFioritura, prezzo
        System.out.println("Inserisci il codice alfanumerico: ");
        String codice = tastiera.nextLine();
        System.out.println("Inserisci la categoria:\n" +
                "1. ERBACEE,\n" +
                "2. ARBUSTIVE,\n" +
                "3. ARBOREE");
        int categoria = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci il colore: ");
        String colore = tastiera.nextLine();
        System.out.println("Inserisci il mese di potatura: ");
        String mesePotatura = tastiera.nextLine();
        System.out.println("Inserisci il mese di fioritura: ");
        String meseFioritura = tastiera.nextLine();
        System.out.println("Inserisci il prezzo: ");
        int prezzo = Integer.parseInt(tastiera.nextLine());
        if (categoria == 1) {
            System.out.println("Inserisci la sfumatura: ");
            String sfumatura = tastiera.nextLine();
            System.out.println("Inserisci lo spessore: ");
            int spessore = Integer.parseInt(tastiera.nextLine());
            return new Erbacee(codice, Tipologia.values()[categoria - 1], colore, mesePotatura, meseFioritura, prezzo, sfumatura, spessore);
        } else if (categoria == 2) {
            System.out.println("Inserisci l'altezza massima: ");
            int altezzaMax = Integer.parseInt(tastiera.nextLine());
            return new Arbustive(codice, Tipologia.values()[categoria - 1], colore, mesePotatura, meseFioritura, prezzo, altezzaMax);
        } else if (categoria == 3) {
            System.out.println("Inserisci l'altezza massima: ");
            int altezzaMax = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci la superficie: ");
            int superficie = Integer.parseInt(tastiera.nextLine());
            return new Arboree(codice, Tipologia.values()[categoria - 1], colore, mesePotatura, meseFioritura, prezzo, altezzaMax, superficie);
        } else
            System.out.println(PiantaException.getChoiceMessage());

        return null;
    }

    public void aggiungiPianta(Pianta pianta) throws PiantaException {
        if (pianta != null) {
            if (!piante.contains(pianta)) // pianta NON e' contenuta nella lista
                piante.add(pianta);
            else // pianta e' contenuta nella lista
                System.out.println(PiantaException.getAddMessage());
        } else // pianta e' null
            System.out.println(PiantaException.getNullMessage());
    }

    public void vendiPianta(Pianta pianta) throws PiantaException {
        if (pianta != null) {
            if (piante.contains(pianta)) // pianta e' contenuta nella lista
                piante.remove(pianta);
            else
                System.out.println(PiantaException.getRemoveMessage()); // pianta NON e' contenuta nella lista
        } else // pianta e' null
            System.out.println(PiantaException.getNullMessage());
    }

    public void stampaVivaio() {
        for (Pianta p : piante) {
            System.out.println(p.toString());
        }
    }

    public boolean ricercaPianta(Pianta pianta) {
        if (piante.contains(pianta))
            return true;
        else
            System.out.println(PiantaException.getFindMessage());
        return false;
    }

    public void ricercaCategoria(Tipologia categoria) { // ricerca pianta per categoria
        for (Pianta p : piante) {
            if (p.getTipologia().equals(categoria))
                System.out.println(p);
        }
    }

    public void ricercaMeseFioritura(String meseFioritura) { // ricerca per mese di fioritura
        for (Pianta p : piante) {
            if (p.getMeseFioritura().equals(meseFioritura))
                System.out.println(p);
        }
    }

    public void ricercaPrezzo(int prezzo) { // ricerca per prezzo
        for (Pianta p : piante) {
            if (p.getPrezzo() == (prezzo))
                System.out.println(p);
        }
    }
}