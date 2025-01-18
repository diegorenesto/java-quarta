import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> persone = new ArrayList<>();
        Persona p1 = new Persona("Diego", 17);
        Persona p2 = new Persona("Nicolò", 17);
        Persona p3 = new Persona("Simone", 17);


        // aggiungo le persone alla lista
        persone.add(p1);
        persone.add(p2);
        persone.add(p3);


        scriviPersone(persone, "persone.csv");

        System.out.println("\n\n");

        ArrayList<Persona> nuovoArchivio = leggiPersone("persone.csv");


    }

    public static void scriviPersone(ArrayList<Persona> archivio, String fileName) {
        ArrayList<String> strings = new ArrayList<>();
        try {
            for (Persona p : archivio) {
                strings.add(p.csv());
            }
            Files.write(Paths.get(fileName), strings);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Persona> leggiPersone(String fileName) {
        ArrayList<Persona> archivio = new ArrayList<>();
        try {
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
            String[] attributi;
            for (String line : lines) {
                attributi = line.split(";");
                archivio.add(new Persona(attributi[0], Integer.parseInt(attributi[1])));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return archivio;
    }
}