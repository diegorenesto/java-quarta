import java.util.ArrayList;

public class QueueSolidi {
    // la queue(coda) è una struttura dati che adotta una politica di tipo FIFO(First in-First out)
    // ossia il primo elemento ad essere inserito è sempre il primo ad essere estratto
    private ArrayList<Solido> queue;

    public QueueSolidi() {
        queue = new ArrayList<>();
    }

    public void push(Solido s) throws CloneNotSupportedException {
        queue.add(s.clone());
    }

    public Solido enqueue() {
        return queue.removeFirst();
    }
}