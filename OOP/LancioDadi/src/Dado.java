import java.util.Random;

public class Dado {
    private int nFaccie;
    private int numUscito;
    Random genera = new Random();

    public Dado(int nFaccie) {
        this.nFaccie = genera.nextInt(1, nFaccie + 1);
    }

    public int lanciaDado() {
        numUscito = genera.nextInt(1, nFaccie + 1);
        return numUscito;
    }

    @Override
    public String toString() {
        return String.format("Numero faccie: %d", nFaccie);
    }
}