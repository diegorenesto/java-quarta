import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dichiarazione delle variabili
        Scanner sc = new Scanner(System.in);
        Concessionaria concessionaria = new Concessionaria("CENTRO AUTO");
        Veicolo v1 = new Veicolo("Fiat", "Panda", 5000, Carburante.BENZINA);
        Automobile a1 = new Automobile("Kia", "Stonic", 25000, Carburante.GPL, 4);
        Moto m1 = new Moto("Yamaha", "modello", 200, Carburante.DIESEL, 2000);
        Automobile a2 = new Automobile("Toyota", "Yaris", 8000, Carburante.BENZINA, 4);
        ArrayList<Veicolo> officina = new ArrayList<>();

        try {
            concessionaria.addVeicolo(v1);
            concessionaria.addVeicolo(a1);
            concessionaria.addVeicolo(m1);
            concessionaria.addVeicolo(a2);
        } catch (VehicleException v) {
            System.out.println(v.getAddMessage());
        }

        concessionaria.stampaConcessionaria();

        System.out.println("-----------");

        try {
            concessionaria.removeVeicolo(m1);
            concessionaria.removeVeicolo(a2);
        } catch (VehicleException v) {
            System.out.println(v.getRemoveMessage());
        }

        concessionaria.stampaConcessionaria();

        System.out.println("Continuare con JSON? (s/n)");
        String answ = sc.nextLine();
        if (answ.equals("s")) {
            System.out.println("Come vuoi salvare il file JSON (nomeFile.json)");
            concessionaria.salvaJson(sc.nextLine());
            System.out.println("Leggi JSON");
            concessionaria.leggiJson(sc.nextLine());
        } else
            System.out.println("Fine programma");
    }
}