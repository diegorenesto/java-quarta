public class Docente extends Persona {
    private String disciplina;

    public Docente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore);
    }

    //COPY CONSTRUCTOR
    public Docente(Docente d) {
        super(d.getNome(), d.getCognome(), d.getEta(), d.luogoDiNascita, d.colorePreferito, d.squadraDelCuore);
        this.disciplina = d.disciplina;
    }

    @Override
    public String presentazione() {
        return super.presentazione() + " e sono anche un Docente";
    }
}
