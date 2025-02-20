import java.util.ArrayList;


public class Teatro {
    ArrayList<Persona> persone;
    final int MAXPERSONE = 10;

    public Teatro() {
        persone = new ArrayList<>();
    }

    public void entrataTeatro(Persona p) throws Exception {
        if (!(persone.contains(p)) && persone.size() < MAXPERSONE) {
            // E' UNA SHALLOW COPY E QUINDI VIENE COPIATO IL RIFERIMENTO AGLI OGGETTI E NON SI HA UNA DEEP COPY (NON SI RISPETTA DUNQUE L'INCAPSULAMENTO)
//            try {
//                persone.add(p.clone());
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
            // SOLUZIONE PER LA DEEP COPY
//            Persona temp = null;
//            if (p instanceof Studente s) {
//                temp = new Studente(s);
//            } else if (p instanceof Docente d) {
//                temp = new Docente(d);
//            }
//            persone.add(temp);
            // SOLUZIONE CON CLONE ASSOCIATA A DEEP COPY. BISOGNA RICORDARSI DI FARE LA NEW DEL LIBRO QUANDO SI ISTANZA
            try {
                persone.add(p.clone());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new Exception("Questa persona è già presente all'interno del teatro");
        }
    }

    public void stampaAVideo() { //NON DA FARE POICHE' NON E' BUONA PRATICA STAMPARE DA DENTRO LE CLASSI, BISOGNA RITORNARE UNA NUOVA LISTA E STAMPARLA
        for (Persona persona : persone) {
            System.out.println(persona.presentazione());
        }
    }
}
