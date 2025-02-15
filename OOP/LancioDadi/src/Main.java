import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Giocatore giocatore1 = new Giocatore("Diego", "Renesto");
        Giocatore giocatore2 = new Giocatore("Nicolo'", "Zanforlin");

        System.out.println("Quanti round vuoi giocare?");
        int nRound = tastiera.nextInt();
        Partita partita = new Partita(giocatore1, giocatore2, nRound);

        try {
            partita.giocaPartita();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
        partita.finePartita();
        partita.vincitore();

    }
}