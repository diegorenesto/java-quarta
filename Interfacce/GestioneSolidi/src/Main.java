import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cubo c = new Cubo(5);
        Sfera s = new Sfera(12);
        Quadrato q = new Quadrato(10);

        System.out.println("CUBO");
        System.out.println("Superficie: " + c.superficie());
        System.out.println("Volume: " + c.volume());

        System.out.println("\nSFERA");
        System.out.println("Superficie: " + s.superficie());
        System.out.println("Volume: " + s.volume());

        System.out.println("\nQUADRATO");
        System.out.println("Superficie: " + q.superficie());
        System.out.println("Il quadrato, figura bidimensionale, non e' dotato di volume");

        ArrayList<CorpoSolido> solidi = new ArrayList<>();
        solidi.add(c);
        solidi.add(s);
        solidi.add(q);

        solidi.forEach(solido -> solido.toString());
        Quadrato q2 = new Quadrato(35) {
            @Override
            public String toString() {
                return "Sono un quadrato anonimo";
            }
        };

        System.out.println("\n" + q2.toString());
    }
}