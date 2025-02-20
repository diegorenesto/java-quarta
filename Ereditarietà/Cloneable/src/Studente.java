public class Studente extends Persona {

    private Libro libro;
    private Integer media; // DA PROVARE SE FUNZIONA O MENO IL CLONE CON UNA CLASSE WRAPPER

    public Studente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore);
    }

    // COPY CONSTRUCTOR
//    public Studente(Studente s) {
//        super(s.nome, s.cognome, s.eta, s.luogoDiNascita, s.colorePreferito, s.squadraDelCuore);
//        libro = new Libro(s.libro.getAutore(), s.libro.getTitolo());
//    }

    public Studente() {
        super();
    }

    public Studente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore, Libro libro) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore);
        this.libro = new Libro(libro.getAutore(), libro.getTitolo());
    }

    @Override
    public String presentazione() {
        if (libro != null) {
            return super.presentazione() + " e sono anche uno studente, e il titolo del mio libro è: " + libro.getTitolo();
        } else {
            return super.presentazione() + " e sono anche uno studente";
        }
    }

    public String presentazione2() {
        return "ATTENZIONE! " + super.presentazione();
    }

    public String metodoNuovo() {
        return "ciao sono metodoNuovo di Studente";
    }
}
