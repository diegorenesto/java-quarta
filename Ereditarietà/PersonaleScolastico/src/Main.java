public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente("Giacomo", 'M', "Viale De Gasperi, 29");
        System.out.println("DIPENDENTE: " + dipendente1);

        Docente docente1 = new Docente("MaCs", 'M', "Via Vittor Pisani", "Jolly", "Sistemi e reti");
        System.out.println("DOCENTE: " + docente1);
        System.out.println(docente1.ritornaIndirizzoMaiuscolo());
        // mettendo protected sull'indirizzo posso avere libero accesso

//        Dipendente d2;
//        d2 = docente1; // UP-CASTING

        Impiegato impiegato1 = new Impiegato("Giuliana", 'F', "Viale De Gasperix 100", "Ufficio1");
        System.out.println("IMPIEGATO: " + impiegato1);
        System.out.println(impiegato1.getIncentivo());


        Docente docente2 = new Docente("Enrico", 'M', "Viale dei Mille", "ITP", "Informatica");
        Dipendente dipendente3 = new Docente("Enricone", 'M', "Viale dei Mille", "ITP", "Informatica");
        Impiegato dipendente4 = new Impiegato("Rodolfo", 'F', "Brontolo", "trabajo");
        Dipendente dipendente5 = new Impiegato("Henry", 'F', "Brontolo", "trabajo");

        System.out.println("\n\n");

        Istituto s = new Istituto("IIS VIOLA MARCHESINI");
        System.out.println("STAMPA INCENTIVI DEI DIPENDENTI DELL ISTITUTO " + s.getNome());
        try {
            s.addDipendente(docente2);
            s.addDipendente(dipendente3);
            s.addDipendente(dipendente4);
            s.addDipendente(dipendente5);
            s.stampaIncentivi();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}