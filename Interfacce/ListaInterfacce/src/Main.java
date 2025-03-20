import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cubo c = new Cubo(7, 2);
        Sfera s = new Sfera(8.5, 12);

        // lista di interfacce
        ArrayList<CorpoSolido> listaInterfacce = new ArrayList<>();
        listaInterfacce.add(c);
        listaInterfacce.add(s);

        listaInterfacce.forEach(System.out::println);

        for (CorpoSolido corpoSolido : listaInterfacce) {
            if (corpoSolido instanceof Validatore)
                System.out.println("Ok tipo cubo, login!");
            else
                System.out.println("Login non concesso");
        } // elemento ulteriore di FLESSIBILITA' del linguaggio java
    }
}