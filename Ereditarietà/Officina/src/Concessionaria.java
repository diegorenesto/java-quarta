import java.util.ArrayList;

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
}