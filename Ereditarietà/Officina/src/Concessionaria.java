import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Concessionaria {

    private String nome;
    private ArrayList<Veicolo> officina = new ArrayList();

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Veicolo> getOfficina() {
        return officina;
    }

    public void addVeicolo(Veicolo v) throws VehicleException { // CREATE
        if (!officina.contains(v))
            officina.add(v);
        else
            throw new VehicleException();
    }

    public void removeVeicolo(Veicolo v) throws VehicleException { // REMOVE
        if (officina.contains(v))
            officina.remove(v);
        else
            throw new VehicleException();
    }

    public void stampaConcessionaria() { // READ
        for (Veicolo v : officina) {
            System.out.println(v);
        }
    }

    public Veicolo trovaVeicolo(Veicolo veicolo) throws VehicleException { // FIND
        for (Veicolo v : officina) {
            if (v.equals(veicolo))
                return v;
        }
        throw new VehicleException();
    }

    public void modificaPrezzo(Veicolo veicolo, int nuovoPrezzo) throws VehicleException {
        if (trovaVeicolo(veicolo) == veicolo) {
            veicolo.setPrezzo(nuovoPrezzo);
        } else
            throw new VehicleException();
    }

    public Veicolo trovaMarca(String marca) throws VehicleException {
        for (Veicolo v : officina) {
            if (v.getMarca().equals(marca)) {
                return v;
            }
        }
        throw new VehicleException();
    }

    public void cappottamento(Camion camion) throws VehicleException {
        officina.remove(camion);
        System.out.println("Veicolo cappottato!");
    }

    public void salvaJson(String fileName) {

        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonContent = gson.toJson(officina);
            Files.write(Paths.get(fileName), jsonContent.getBytes());
            System.out.println("Dati salvati con successo");
        } catch (Exception e) {
            System.out.println("Errore durante il salvataggio: " + e.getMessage());
        }
    }

    public void leggiJson(String fileName) {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(fileName));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Automobile[] collezione = gson.fromJson(new String(jsonData), Automobile[].class);
            officina = new ArrayList<>(Arrays.asList(collezione));
            System.out.println(officina);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}