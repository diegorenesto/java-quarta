public class Main {
    public static void main(String[] args) {
        Frontend frontend = new Frontend();
        try {
            frontend.avvia();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}