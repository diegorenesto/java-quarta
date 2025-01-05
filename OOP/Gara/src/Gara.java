import java.util.ArrayList;

public class Gara {
    private String nomeGara;
    private ArrayList<Scuderia> autoInGara;

    public Gara(String nomeGara) {
        this.nomeGara = nomeGara;
        this.autoInGara = new ArrayList<>();
    }

    public void aggiungiScuderia(Scuderia scuderia) {
        autoInGara.add(scuderia);
    }

    public String corriGara() {
        return "La gara " + nomeGara + " è finita!";
    }
}
