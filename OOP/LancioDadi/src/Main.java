import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Giocatore g1 = new Giocatore("Diego", "Renesto");
        Giocatore g2 = new Giocatore("Nicolo'", "Zanforlin");

        System.out.println(g1);
        System.out.println(g2);

        System.out.println("Quante partite vuoi giocare?");
        int nPartite = tastiera.nextInt();
        Partita partita = new Partita(g1, g2, nPartite, new Dado(6));

        try {
            partita.giocaPartita();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
        partita.finePartita();
        partita.vincitore();


        System.out.println("--------");
        System.out.println(g1.getNome() + " " + g1.getCognome() + " ha vinto " + g1.getPartiteVinte() + " partite");
        System.out.println(g2.getNome() + " " + g2.getCognome() + " ha vinto " + g2.getPartiteVinte() + " partite");


        System.out.println("--------");
        partita.resetGame();
        System.out.println(partita);
    }
}