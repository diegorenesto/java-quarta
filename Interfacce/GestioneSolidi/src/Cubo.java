public class Cubo implements CorpoSolido {
    private double lato;

    public Cubo(double lato) {
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
        return String.format("Sono un cubo, Volume: %.2f, Superficie: %.2f", volume(), superficie());
    }
}