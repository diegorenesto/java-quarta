import java.util.ArrayList;

public class GalleriaDeiSolidi {
    private ArrayList<Solido> galleria;

    public GalleriaDeiSolidi() {
        galleria = new ArrayList<>();
    }

    public void addSolido(Solido solido) throws CloneNotSupportedException {
        if (solido != null && !(galleria.contains(solido))) {
            galleria.add(solido.clone());
        } else throw new CloneNotSupportedException("ERRORE! SOLIDO NON INSERITO NELLA LISTA!");
    }

    // VIOLA L'INCAPSULAMENTO
//    public void visualizzaLista() throws RuntimeException {
//        if (!(galleria.isEmpty())) {
//            for (Solido s : galleria) {
//                System.out.println(s.toString());
//            }
//        } else
//            throw new RuntimeException("LISTA VUOTA");
//    }

    // RISPETTA L'INCAPSULAMENTO
    public ArrayList<Solido> visualizzaGalleria() throws CloneNotSupportedException {
        ArrayList<Solido> temp = new ArrayList<>();
        for (Solido s : galleria) {
            temp.add(s.clone());
        }
        return temp;
    }
}