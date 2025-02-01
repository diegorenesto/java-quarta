public class Test {
    public static void main(String[] args) {
        Desktop desktop = new Desktop("Intel i7", 16, 512, "Dell", "OptiPlex", "Windows 10", "Medio", "NVIDIA GTX 1650");
        Server server = new Server("AMD EPYC", 64, 2000, "HP", "ProLiant", "Linux", "Grande", 2, true);
        Notebook notebook = new Notebook("Apple M1", 8, 256, "Apple", "MacBook Air", "macOS", 1.2, 1.5, 30, 20, 13.3);

        // Stampe
        System.out.println("Desktop: " + desktop);
        System.out.println("Server: " + server);
        System.out.println("Notebook: " + notebook);

        // Test metodi equals
        Desktop desktop2 = new Desktop("Intel i7", 16, 512, "Dell", "OptiPlex", "Windows 10", "Medio", "NVIDIA GTX 1650");
        System.out.println("I due desktop sono uguali? " + desktop.equals(desktop2));

        // UP-CASTING: da sottoclasse a superclasse
        PcFisso pc1;
        PcPortatile pc2;
        pc1 = desktop;
        pc2 = notebook;

        System.out.println("\nUp-casting:");
        System.out.println("PC1 (desktop): " + pc1);
        System.out.println("PC2 (notebook): " + pc2);

        // DOWN-CASTING: da superclasse a sottoclasse (con cast esplicito)
        desktop = (Desktop) pc1;
        notebook = (Notebook) pc2;

        System.out.println("\nScheda video del desktop: " + desktop.getTipoSchedaVideo());
        System.out.println("Dimensioni video del notebook: " + notebook.getDimensioniVideo() + " pollici");

    }
}