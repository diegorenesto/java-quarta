public class Main {
    public static void main(String[] args) {

        Cubo c = new Cubo(7, 2);
        Sfera s = new Sfera(8.5, 12);

        System.out.println(c.peso());
        System.out.println(s.peso());

    }
}