public class Studente extends Persona {

    public Studente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore); // chiama il costruttore della classe genitore (Persona)
    }
}