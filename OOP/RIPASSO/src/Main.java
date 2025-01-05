public class Main {
    public static void main(String[] args) {

        // Object = An entity that contains data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type


        // Constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values



        // CREATE AN UNIQUE OBJECT
        Studente studente1 = new Studente("Diego", "Renesto", 17, 7.1);

        System.out.println(studente1.getNome());
        System.out.println(studente1.getCognome());
        System.out.println(studente1.getEta());
        System.out.println(studente1.getMedia());


        studente1.setNome("Francesco");
        studente1.setCognome("Rossi");
        studente1.setMedia(4.9);

        System.out.println(studente1.toString());


        System.out.println(studente1.isStudying());
        studente1.studia();
        System.out.println(studente1.isStudying());
        studente1.stop();
        System.out.println(studente1.isStudying());



    }
}