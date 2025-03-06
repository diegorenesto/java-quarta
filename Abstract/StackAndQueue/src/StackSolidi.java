import java.util.ArrayList;

public class StackSolidi {
    // lo stack(pila) è una struttura dati che adotta una politica di tipo LIFO(Last in-First out),
    // ovvero l'ultimo elemento inserito è sempre il primo ad essere estratto
    private ArrayList<Solido> stack;

    public StackSolidi() {
        stack = new ArrayList<>();
    }

    public void push(Solido s) throws CloneNotSupportedException {
        stack.add(s.clone());
    }

    public Solido pop() {
        return stack.removeLast();
    }
}