import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;



        ArrayList<Machine> machines = new ArrayList<>();
        ListaDispositivi lista = new ListaDispositivi();
//        machines.add(s);
//        machines.add(a);
//        machines.add(p);
//        machines.add(l);
//
//        machines.forEach(System.out::println);
//
//
//        l.accendi();
//        l.spegni();
//        System.out.println(l.isOn());

        String[] opzioni = {"MACHINES", "1. Crea Dispotivo", "2. Crea Lavatrice", "3. Stampa Lista", "4. Accendi dispositivi", "5. Fine"};
        do {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    System.out.println("Crea dispositivo");
                    Server s = new Server(1, 16, true, TipologiaOS.LINUX);
                    Arduino a = new Arduino(2, 4, false, "C++");
                    Playstation p = new Playstation(3, 700, true, TipologiaPlay.PS5, true);
                    lista.addMachine(s);
                    lista.addMachine(a);
                    lista.addMachine(p);
                }
                case 2 -> {
                    System.out.println("Crea lavatrice");
                    Lavatrice l = new Lavatrice(15, ProgrammaLavaggio.COTONE, "A+++");
                    lista.addLavatrice(l);
                }
                case 3 -> {
                    System.out.println("Stampa Lista");
                    ArrayList<Machine> listaRitornata = lista.ritornaLista();
                    listaRitornata.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Spegni dispositivi");
                    lista.accendiDispositivi();
                    System.out.println("Dispositivo acceso?");
                    lista.checkStatus();
                }
                case 5 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        } while (!uscita);

    }
}
