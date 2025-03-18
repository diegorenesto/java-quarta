import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Machine - interface
        // Programmable device - abstract
        // Server - concreto
        // Playstation - concreto
        // Lavatrice - concreto
        // Arduino - concreto

        Server server = new Server(1, 16, true, TipologiaOS.LINUX);
        Arduino arduino = new Arduino(2, 4, false, "C++");
        Playstation playstation = new Playstation(3, 700, true, TipologiaPlay.PS5, true);
        Lavatrice lavatrice = new Lavatrice(15, ProgrammaLavaggio.COTONE, "A+++");

        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(server);
        machines.add(arduino);
        machines.add(playstation);
        machines.add(lavatrice);

        machines.forEach(System.out::println);
    }
}
