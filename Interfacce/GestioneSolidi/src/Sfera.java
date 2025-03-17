public class Sfera implements CorpoSolido {
    private double raggio;

    public Sfera(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double volume() {
        return (double) 4 / 3 * Math.PI * Math.pow(raggio, 3);
    }

    @Override
    public double superficie() {
        return (double) 4 * Math.PI * Math.pow(raggio, 2);
    }

    @Override
    public String toString() {
        return String.format("Sono un sfera, Superficie: %.2f, Volume: %.2f", superficie(), volume());
    }
}