public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Gino", "Angela", 70, "Venezia", "Azzurro", "Inter");
        Studente studente1 = new Studente("Luigi", "Bonaparte", 18, "Parigi", "Tricolore", "PSG");
        Studente studente2 = new Studente("Luigi", "Zanforlin", 4, "Rovigo", "Verde", "Milan");
        Teatro teatro = new Teatro();

        try {
            teatro.entrata(docente);
            teatro.entrata(studente1);
            teatro.entrata(studente2);
            teatro.stampaAVideo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}