import java.util.ArrayList;

public class Concessionaria {

    private String nome;
    private ArrayList<Veicolo> officina = new ArrayList();

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public ArrayList<Veicolo> getOfficina() {
        return officina;
    }

    public void setOfficina(ArrayList<Veicolo> officina) {
        this.officina = officina;
    }

    public void addVeicolo(Veicolo v) throws Exception {
        if (!officina.contains(v))
            officina.add(v);
        else
            throw new Exception("Il veicolo e' gia' presente nell'officina");
    }


}