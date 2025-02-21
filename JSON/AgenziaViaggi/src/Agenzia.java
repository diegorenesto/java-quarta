import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Agenzia {

    private String nomeAgenzia;
    private ArrayList<Viaggio> viaggi = new ArrayList<Viaggio>();

    public Agenzia(String nomeAgenzia) {
        this.nomeAgenzia = nomeAgenzia;
    }

    public String getNomeAgenzia() {
        return nomeAgenzia;
    }

    public ArrayList<Viaggio> getViaggi() {
        return viaggi;
    }

    public void aggiungiaViaggio(Viaggio v) throws ViaggiException {
        if (v != null) {
            if (!viaggi.contains(v))  // controllo che v non sia gia' presente nella lista
                viaggi.add(v);
            else
                System.out.println(ViaggiException.getAddMessage());

        } else // v e' null
            System.out.println(ViaggiException.getNullMessage());
    }

    public void rimuoviViaggio(Viaggio v) throws ViaggiException {
        if (v != null) {
            if (viaggi.contains(v))
                viaggi.remove(v);
            else
                System.out.println(ViaggiException.getRemoveMessage());
        } else
            System.out.println(ViaggiException.getNullMessage());
    }

    public void stampaViaggi() {
//        for (Viaggio v : viaggi) {
//            System.out.println(v.toString());
//        }
        viaggi.forEach(v -> System.out.println(v.toString()));
    }

    public Viaggio creazioneViaggio(Scanner tastiera) {
        System.out.println("Inserisci la destinazione: ");
        String destinazione = tastiera.nextLine();
        System.out.println("Inserisci il costo: ");
        int costo = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci il numero di giorni: ");
        int giorni = Integer.parseInt(tastiera.nextLine());
        return new Viaggio(destinazione, costo, giorni);
    }

    public Viaggio viaggioNonGenerico(Scanner tastiera, GenereViaggio genereViaggio) throws ViaggiException {
        if (genereViaggio == GenereViaggio.VOLO) {
            System.out.println("Inserisci la destinazione: ");
            String destinazione = tastiera.nextLine();
            System.out.println("Inserisci il costo: ");
            int costo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci il numero di giorni: ");
            int giorni = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci la compagnia aerea: ");
            String compagniaAerea = tastiera.nextLine();
            System.out.println("Inserisci il numero del volo: ");
            int numeroVolo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci l'aeroporto di partenza: ");
            String partenza = tastiera.nextLine();
            System.out.println("Inserisci l'aeroporto di arrivo: ");
            String arrivo = tastiera.nextLine();
            System.out.println("Inserisci la classe:\n" +
                    "1. ECONOMY,\n" +
                    "2. BUSINESS,\n" +
                    "3. FIRST");
            int classe = Integer.parseInt(tastiera.nextLine());
            return new Volo(destinazione, costo, giorni, compagniaAerea, numeroVolo, partenza, arrivo, Classe.values()[classe - 1]);
        } else if (genereViaggio == GenereViaggio.CROCIERA) {
            System.out.println("Inserisci la destinazione: ");
            String destinazione = tastiera.nextLine();
            System.out.println("Inserisci il costo: ");
            int costo = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci il numero di giorni: ");
            int giorni = Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci il nome della nave: ");
            String nomeNave = tastiera.nextLine();
            System.out.println("Inserisci il porto di partenza: ");
            String portoPartenza = tastiera.nextLine();
            System.out.println("Inserisci il tipo di cabina:\n" +
                    "1. INTERNA,\n" +
                    "2. ESTERNA,\n" +
                    "3. SUITE");
            int cabina = Integer.parseInt(tastiera.nextLine());
            System.out.println("Pasti inclusi? (s/n)");
            String risposta = tastiera.nextLine();
            boolean pastiInclusi = false;
            if (risposta.equals("s"))
                pastiInclusi = true;
            return new Crociera(destinazione, costo, giorni, nomeNave, portoPartenza, TipoCabina.values()[cabina - 1], pastiInclusi);
        } else
            System.out.println(ViaggiException.getChoiceMessage());
        return null;
    }

    public Viaggio trovaViaggio(String destinazione, int costo, int giorni) {
        for (Viaggio v : viaggi) {
            if (destinazione.equals(v.getDestinazione()) && costo == v.getCosto() && giorni == v.getGiorni()) {
                return v;
            }
        }
        return null;
    }

    public void salvaJson(String fileName) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonContent = gson.toJson(viaggi);
            Files.write(Paths.get(fileName), jsonContent.getBytes());
            System.out.println("Dati salvati con successo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leggiJson(String fileName) {
        try {
            byte[] jsonContent = Files.readAllBytes(Paths.get(fileName));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Viaggio[] collezione = gson.fromJson(new String(jsonContent), Viaggio[].class);
            viaggi = new ArrayList<>(Arrays.asList(collezione));
            System.out.println(viaggi);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}