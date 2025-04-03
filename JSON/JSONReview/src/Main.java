import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(new Persona("Nome1", "Cognome1", 17, true));
        persone.add(new Persona("Nome2", "Cognome2", 18, true));
        persone.add(new Persona("Nome3", "Cognome3", 19, false));
        persone.add(new Persona("Nome4", "Cognome4", 20, true));
        persone.add(new Persona("Nome5", "Cognome5", 21, false));
        try {
            salvaJson("Persone.json", persone);
            leggiJson("Persone.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void salvaJson(String fileName, ArrayList<Persona> persone) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = gson.toJson(persone);
        System.out.println(jsonContent);
        Files.write(Paths.get(fileName), jsonContent.getBytes());
    }

    public static void leggiJson(String fileName) throws IOException {
        Gson gson = new Gson();
        byte[] jsonData = Files.readAllBytes(Path.of(fileName));
        Persona[] persone = gson.fromJson(new String(jsonData), Persona[].class);
    }
}