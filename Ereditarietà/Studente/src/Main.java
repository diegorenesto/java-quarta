public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Diego", "Renesto", 17, "Rovigo", "Blu", "Adriese");
        Studente s = new Studente("Nicolò", "Zanforlin", 17, "Rovigo", "Verde", "Milan");


        System.out.println(s.getSquadraDelCuore()); // getter ereditato da Persona tramite l' extends

        System.out.println(p.presentazione());
        System.out.println(s.presentazione());


    }
}