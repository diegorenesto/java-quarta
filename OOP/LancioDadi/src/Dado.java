import java.util.Random;

public class Dado implements Comparable<Dado> {
    private int nFaccie;
    private int numUscito;
    Random genera = new Random();

    public Dado(int nFaccie) {
        this.nFaccie = nFaccie;
    }

    public int lanciaDado() {
        numUscito = genera.nextInt(1, nFaccie + 1);
        return numUscito;
    }

    @Override
    public int compareTo(Dado o) {
        return Integer.compare(this.nFaccie, o.nFaccie);
    }

    @Override
    public String toString() {
        return String.format("Numero faccie: %d", nFaccie);
    }
}