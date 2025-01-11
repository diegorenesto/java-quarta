import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner tastiera = new Scanner(System.in);
        ArrayList<Automobile> automobili = new ArrayList<>();


        Automobile auto1 = new Automobile("Fiat", "Panda", 1000);
        Automobile auto2 = new Automobile("Fiat", "Panda", 1000);
        Automobile auto3 = new Automobile("Kia", "Stonic", 1400);


        System.out.println("Auto 1 e Auto 2 hanno gli stessi attribruti? " + auto1.equals(auto2));
        System.out.println("Auto 1 e Auto 3 hanno gli stessi attributi? " + auto1.equals(auto3));


        System.out.println("La cilindrata di auto 1 e' maggiore di quella di auto 2? " + auto1.compareTo(auto2));
        System.out.println("La cilindrata di auto 1 e' maggiore di quella di auto 3? " + auto1.compareTo(auto3));


        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());


        Automobile auto4 = new Automobile("Kia", "Sportage", 1500);
        Automobile auto5 = new Automobile("Renault", "Clio", 1200);

        automobili.add(auto1);
        automobili.add(auto2);
        automobili.add(auto3);
        automobili.add(auto4);
        automobili.add(auto5);


        System.out.println("\n\nOrdine crescente: ");
        Collections.sort(automobili);
        System.out.println(automobili);


        System.out.println("\n\nOrdine decrescente: ");
        Collections.sort(automobili, Collections.reverseOrder());
        System.out.println(automobili);


    }
}
