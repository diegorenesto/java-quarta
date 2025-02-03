public class Main {
    public static void main(String[] args) {

        // Dichiarazione delle variabili
        Veicolo veicolo1 = new Veicolo("Fiat", "Panda", 10000);
        Veicolo veicolo2 = new Veicolo("Fiat", "Panda", 8000);
        Veicolo veicolo3 = new Veicolo("Toyota", "Yaris", 10000);
        Automobile auto1 = new Automobile("Marca1", "Modello1", 20000, 5);
        Automobile auto2 = new Automobile("Marca2", "Modello2", 10000, 10);
        Moto moto1 = new Moto("Marca5", "Modello5", 4000, 500);
        Moto moto2 = new Moto("Marca6", "Modello6", 200, 1000);


//        System.out.println("Le macchine sono uguali? " + veicolo1.equals(veicolo2));
//        System.out.println("Le macchine sono uguali? " + veicolo1.equals(veicolo3));
//
//        System.out.println(auto1.toString());
//        System.out.println(auto2.toString());
//
//        System.out.println(moto1.toString());
//        System.out.println(moto2.toString());


        Concessionaria concessionaria1 = new Concessionaria("OFFICINA");

        System.out.println("CONCESSIONARIA: " + concessionaria1.getNome());
        System.out.println("ADD");
        try {
            concessionaria1.addVeicolo(veicolo1);
            concessionaria1.addVeicolo(veicolo2);
            concessionaria1.addVeicolo(veicolo3);
            concessionaria1.addVeicolo(auto1);
            concessionaria1.addVeicolo(moto1);
            concessionaria1.stampaConcessionaria();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------");
        System.out.println("REMOVE");
        try {
            concessionaria1.removeVeicolo(veicolo1);
            concessionaria1.removeVeicolo(veicolo3);
            concessionaria1.stampaConcessionaria();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------");
        System.out.println("TROVA");
        Automobile auto4 = new Automobile("Marca4", "Modello4", 20000, 500);
        try {
            System.out.println(concessionaria1.trovaVeicolo(concessionaria1, auto1));
            System.out.println(concessionaria1.trovaVeicolo(concessionaria1, auto4));
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }

        System.out.println("\nMODIFICA PREZZO");
        try {
            System.out.println("Prezzo iniziale: " + auto1.getPrezzo());
            concessionaria1.modificaPrezzo(concessionaria1, auto1, 5000);
            System.out.println("Prezzo modificato: " + auto1.getPrezzo());
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }

        System.out.println("--------");
        System.out.println("CERCA MODELLO");
        try {
            concessionaria1.trovaMarca("Fiat");
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }

    }
}