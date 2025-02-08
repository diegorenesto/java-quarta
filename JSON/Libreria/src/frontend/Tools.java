
package frontend;

import backend.Genere;
import backend.Libro;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Tools {
    /*public static void main(String[] args) {

    }*/
    private Tools() {
    }

    ; //impedisce di istanziare la classe

    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int Menu(String opzioni[], Scanner tastiera) {// parametri formali
        int scelta;

        do {
            clrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println("[" + i + "]" + " " + opzioni[i]);
            }
            scelta = (Integer.parseInt(tastiera.nextLine()));
            //tastiera.nextLine();
            if ((scelta < 1) || (scelta > opzioni.length - 1)) {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1) || (scelta > opzioni.length - 1));
        //tastiera.nextLine();
        return scelta;
    }

    public static Libro leggiLibro(Scanner tastiera, boolean soluzioni) {
        Genere[] tipoGenere = Genere.values();
        String[] sceltaGenere = {"GENERE", "ROMANZO", "MANUALE", "THRILLER", "GENERICO"};


        System.out.print("Inserisci l'autore del libro: ");
        String autore = tastiera.nextLine();
        System.out.print("Inserisci il titolo del libro: ");
        String titolo = tastiera.nextLine();
        System.out.print("Inserisci il numero di pagine del libro: ");
        int nPagine = Integer.parseInt(tastiera.nextLine());
//        System.out.println("Inserisci il tipo del libro: ");
//         Menu(sceltaGenere, tastiera);
//        Genere tipo = tipoGenere[Menu(sceltaGenere, tastiera) - 1]; // visto che Menu parte da indice 1


//        Libro l = new Libro(autore, titolo, nPagine, tipo);
//        return l;
        return new Libro(autore, titolo, nPagine);

    }

    public static String[] findFile(String[] dir, String fileExt) {
        String[] arr = new String[dir.length + 1];
        arr[0] = "LISTA FILE " + fileExt;
        int counter = 0;
        for (String s : dir) {
            if (s.endsWith(fileExt)) {
                arr[++counter] = s;
            }
        }
        String[] secondArr = new String[counter + 1];
        System.arraycopy(arr, 0, secondArr, 0, secondArr.length);
        return secondArr;
    }

    public static int fileSelection(String[] list, Scanner tastiera) {
        if (list == null || list.length == 0) {
            System.out.println("La directory è vuota");
            return -1;
        }

        System.out.println("Seleziona un file dalla lista: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("[" + (i + 1) + "] " + list[i]);
        }

        int scelta;
        do {
            System.out.print("Inserisci il numero del file: ");
            scelta = Integer.parseInt(tastiera.nextLine());
            if (scelta < 1 || scelta > list.length) {
                System.out.println("SCELTA NON VALIDA!");
            }
        } while (scelta < 1 || scelta > list.length);

        return scelta - 1;
    }
}