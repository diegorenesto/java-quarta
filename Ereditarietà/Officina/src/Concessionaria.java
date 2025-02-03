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

    public void setOfficina(ArrayList<Veicolo> officina) {
        this.officina = officina;
    }


    public void addVeicolo(Veicolo v) throws Exception { // CREATE
        if (!officina.contains(v))
            officina.add(v);
        else
            throw new Exception("Il veicolo e' gia' presente nella concessionaria");
    }

    public void removeVeicolo(Veicolo v) throws Exception { // REMOVE
        if (officina.contains(v))
            officina.remove(v);
        else
            throw new Exception("Il veicolo non e' presente nella concessionaria");
    }

    public void stampaConcessionaria() { // READ
        for (Veicolo v : officina) {
            System.out.println(v);
        }
    }

    public Veicolo trovaVeicolo(Concessionaria c, Veicolo veicolo) throws VehicleException { // TROVA
        for (Veicolo v : officina) {
            if (v.equals(veicolo))
                return v;
        }
        throw new VehicleException();
    }

    public void modificaPrezzo(Concessionaria c, Veicolo veicolo, int nuovoPrezzo) throws VehicleException {
        if (trovaVeicolo(c, veicolo) == veicolo) {
            veicolo.setPrezzo(nuovoPrezzo);
        } else
            throw new VehicleException();
    }

    public String trovaMarca(String marca) throws VehicleException {
        for (Veicolo v : officina) {
            if (v.getMarca().equals(marca)) {
                return v.getMarca();
            }
        }
        throw new VehicleException();
    }
}