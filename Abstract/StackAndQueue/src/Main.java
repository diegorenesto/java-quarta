public class Main {
    public static void main(String[] args) {
        // objects
        Sfera s = new Sfera(1.7, 4);
        Cubo c = new Cubo(12.5, 6);
        StackSolidi stack = new StackSolidi();

        System.out.println("STACK");
        try {
            stack.push(s);
            stack.push(c);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(stack.pop()); // rimuove il cubo, l'ultimo inserito

        System.out.println("-----------------");
        System.out.println("QUEUE");
        QueueSolidi queue = new QueueSolidi();
        try {
            queue.push(s);
            queue.push(c);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(queue.enqueue()); // rimuove la sfera, il primo inserito

    }
}