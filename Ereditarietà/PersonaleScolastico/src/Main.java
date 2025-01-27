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


        Istituto istituto1 = new Istituto("IIS VIOLA MARCHESINI");
        try {
            istituto1.addDipendente(dipendente1);
            System.out.println(istituto1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}