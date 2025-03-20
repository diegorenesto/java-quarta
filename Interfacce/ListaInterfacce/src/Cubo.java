public class Cubo extends Solido implements Validatore {
    private double lato;

    public Cubo(double superficie, double lato) {
        super(superficie);
        this.lato = lato;
    }

    @Override
    public double volume() {
        return Math.pow(lato, 3);
    }

    @Override
    public double superficie() {
        return (double) 6 * Math.pow(lato, 2);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" e sono un cubo: Superficie: %.2f , Volume: %.2f", superficie(), volume());
    }
}