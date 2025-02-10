import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Concessionaria {

    private String nome;
    private ArrayList<Veicolo> officina = new ArrayList<>();

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Veicolo> getOfficina() {
        return officina;
    }

    public void addVeicolo(Veicolo v) throws VehicleException {
        if (!officina.contains(v)) {
            officina.add(v);
        } else
            throw new VehicleException();
    }

    public void removeVeicolo(Veicolo v) throws VehicleException {
        if (officina.contains(v)) {
            officina.remove(v);
        } else
            throw new VehicleException();
    }

    public void stampaConcessionaria() {
        for (Veicolo v : officina) {
            System.out.println(v.toString());
        }
    }

    public void salvaJson(String fileName) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonContent = gson.toJson(officina);
            Files.write(Paths.get(fileName), jsonContent.getBytes());
            System.out.println("Dati salvati con successo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void leggiJson(String fileName) {
        try {
            byte[] jsonContent = Files.readAllBytes(Paths.get(fileName));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Veicolo[] collezione = gson.fromJson(new String(jsonContent), Veicolo[].class);
            officina = new ArrayList<>(Arrays.asList(collezione)); // permette ad un array di diventare ArrayList
            System.out.println(officina);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}