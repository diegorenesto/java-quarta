import java.util.ArrayList;
import java.util.Date;

public class Persona {
    public int idBiglietto;
    public ArrayList<Giostre> giostreProvate;
    public ArrayList<Date> orariGiostre;

    public Persona(int idBiglietto) {
        this.idBiglietto = idBiglietto;
        this.giostreProvate = new ArrayList<>();
        this.orariGiostre = new ArrayList<>();
    }
}