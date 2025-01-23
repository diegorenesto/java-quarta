public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Diego", "Renesto", 17, "Rovigo", "Blu", "Adriese");
        Studente s = new Studente("Nicolò", "Zanforlin", 17, "Rovigo", "Verde", "Milan");


//        System.out.println(s.getSquadraDelCuore()); // getter ereditato da Persona tramite l' extends
//
//        System.out.println(p.presentazione());
//        System.out.println(s.presentazione());


        System.out.println("\n------------ UP-CASTING -----------------\n");

        // UP-CASTING
        Persona p2; // Dichiarazione di variabile
        p2 = p;
        p2 = s; // UP-CASTING , posso assegnare un oggetto della sottoclasse alla variabile della superclasse (cast implicito)
        System.out.println(p2.metodoGenerico());


        Persona p3 = new Studente("Napoleone", "Bonaparte", 22, "Corsica", "Tricolore", "Lyon");
        System.out.println(p3.metodoGenerico());


//        // DOWN-CASTING
//        Persona p5 = new Persona("Vittorio", "Alfieri", 26, "Rovigo", "Verde", "Milan");
//        Studente s5;
//
//        s5 = (Studente) p5;  // down-casting (casting esplicito), OPERAZIONE NON POSSIBILE
//        System.out.println(s5.metodoGenerico()); // avra' i metodi di persona, piu' i suoi
//        // il down casting e' un operazione non lecita. da errore non dal compilatore ma in runtime


        System.out.println("\n\n------------ BINDING DIMANICO -----------------\n");

        // BINDING DINAMICO
        Persona p10 = new Studente("Luigi", "Bonaparte", 18, "Parigi", "Tricolore", "PSG");
        Persona p20 = new Docente("MaCs", "Raspa", 30, "Rovigo", "Verde", "Sassuolo");

        System.out.println(p10.presentazione());
        System.out.println(p20.presentazione()); // a runtime chiama il metodo corretto


    }
}