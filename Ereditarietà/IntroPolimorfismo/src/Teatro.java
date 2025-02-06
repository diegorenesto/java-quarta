import java.util.ArrayList;

public class Teatro {
    private ArrayList<Persona> persone;
    final int MAXPERSONE = 10;

    public Teatro() {
        persone = new ArrayList<>();
    }

    public void entrata(Persona p) throws Exception {
        if (!(persone.contains(p)) && persone.size() < MAXPERSONE)
            persone.add(p);
        else
            throw new Exception("Persona gia' presente all'interno del teatro");
    }

    public void stampaAVideo() { // NON DA FARE...
        for (Persona persona : persone) {
            System.out.println(persona.presentazione());
        }
    }

}