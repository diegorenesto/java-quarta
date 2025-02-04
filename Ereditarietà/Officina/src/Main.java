public class Main {
    public static void main(String[] args) {

        // Dichiarazione delle variabili
        Veicolo veicolo1 = new Veicolo("Fiat", "Panda", 10000, Carburante.BENZINA);
        Veicolo veicolo2 = new Veicolo("Toyota", "Yaris", 10000, Carburante.METANO);
        Automobile auto1 = new Automobile("Marca1", "Modello1", 20000, 5, Carburante.GPL);
        Automobile auto2 = new Automobile("Marca2", "Modello2", 10000, 10, Carburante.METANO);
        Automobile auto3 = new Automobile("Marca4", "Modello4", 20000, 500, Carburante.GPL);
        Moto moto1 = new Moto("Marca5", "Modello5", 4000, 500, Carburante.DIESEL);
        Camion camion = new Camion("Scania", "R500", 120000, 40.0, 90, Carburante.GPL);
        Concessionaria concessionaria1 = new Concessionaria("OFFICINA");


        System.out.println("CONCESSIONARIA: " + concessionaria1.getNome());
        System.out.println("ADD");
        try {
            concessionaria1.addVeicolo(veicolo1);
            concessionaria1.addVeicolo(veicolo2);
            concessionaria1.addVeicolo(auto1);
            concessionaria1.addVeicolo(auto2);
            concessionaria1.addVeicolo(moto1);
            concessionaria1.stampaConcessionaria();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------");
        System.out.println("REMOVE");
        try {
            concessionaria1.removeVeicolo(veicolo2);
            concessionaria1.removeVeicolo(auto2);
            concessionaria1.stampaConcessionaria();
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }

        System.out.println("--------");
        System.out.println("TROVA");
        try {
            System.out.println(concessionaria1.trovaVeicolo(auto1));
            System.out.println(concessionaria1.trovaVeicolo(auto3));
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }

        System.out.println("--------");
        System.out.println("MODIFICA PREZZO");
        try {
            System.out.println("Prezzo iniziale: " + auto1.getPrezzo());
            concessionaria1.modificaPrezzo(auto1, 5000);
            System.out.println("Prezzo modificato: " + auto1.getPrezzo());
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }

        System.out.println("--------");
        System.out.println("CERCA MARCA");
        try {
            System.out.println(concessionaria1.trovaMarca("Fiat"));
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }

        System.out.println("--------");
        System.out.println(camion);
        try {
            concessionaria1.addVeicolo(camion);
            concessionaria1.cappottamento(camion);
            System.out.println(concessionaria1.trovaMarca("Scania"));
        } catch (VehicleException v) {
            System.out.println(v.getMessage());
        }
    }
}