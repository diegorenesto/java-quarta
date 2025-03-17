public class Quadrato implements CorpoSolido {
    public double lato;

    protected Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double superficie() {
        return Math.pow(lato, 2);
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Sono un quadrato, Superficie: %.2f, Volume: %.2f", superficie(), volume());
    }
}