public class Main {
    public static void main(String[] args) {
        Elementare elementare = new Elementare("AB123", "Zingaretti", "Via tomaso albinoni", "Ceregnano", 50, 2, 1, 5);
        Media media = new Media("BC456", "Carlo Goldoni", "Via tomaso albinoni", "Ceregnano", 120, 6, 1, 8);
        Superiore superiore = new Superiore("DE789", "Viola Marchesini", "Via Alcide de Gasperi", "Rovigo", 750, 40, 4, 15, Tipologia.TECNICO);

        System.out.println("Contributo scuola elementare: " + elementare.contributoAnnuale());
        System.out.println("Contributo scuola media: " + media.contributoAnnuale());
        System.out.println("Contributo scuola superiore: " + superiore.contributoAnnuale());
    }
}