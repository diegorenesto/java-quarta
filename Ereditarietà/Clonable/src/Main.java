public class Main {
    public static void main(String[] args) {
        Docente d1 = new Docente("Fabio", "Cucu", 756, "Napoli", "Marrone", "Napoli");
        Studente s1 = new Studente("Bazaj", "Francesco", 33, "Napoli", "Nero", "Milan");
        Studente s2 = new Studente("Riccardo", "Gianesella", 33, "Napoli", "Nero", "Milan");
        Teatro t = new Teatro();
        try {
            t.entrataTeatro(d1);
            t.entrataTeatro(s1);
            t.entrataTeatro(s2);
            t.stampaAVideo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // con Clone rispettiamo l'incapsulamento
        s1.setColorePreferito("giallo");
        System.out.println(s1.getColorePreferito());
        System.out.println("****");
        t.stampaAVideo();

        // con Clone NON rispettiamo l'incapsulamento
        Libro l = new Libro("Johann Wolfgang Von Goethe", "I dolori del giovane Werther");
        Studente studioso = new Studente("Diego", "Renesto", 17, "Rovigo", "Blu", "Adriese", l);
        System.out.println("------------");
        try {
            t.entrataTeatro(studioso);
            t.stampaAVideo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}