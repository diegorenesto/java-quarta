import java.util.ArrayList;

public class ListaDispositivi {
    private ArrayList<Machine> dispositivi = new ArrayList<>();

    public ListaDispositivi() {
        this.dispositivi = new ArrayList<>();
    }

    public void addMachine(ProgrammableDevice dispositivo) throws RuntimeException {
        dispositivi.add(dispositivo);
    }


    public void addLavatrice(Lavatrice lavatrice) throws RuntimeException {
        dispositivi.add(lavatrice);
    }

    public ArrayList<Machine> ritornaLista() {
        ArrayList<Machine> temp = new ArrayList<>(); // ArrayList temporanea per rispettare l'incapsulamento
        for (Machine m : dispositivi) {
            temp.add(m);
        }
        return temp;
    }

    public void accendiDispositivi() {
        for (Machine m : dispositivi) {
            m.accendi();
        }
    }

    public void checkStatus() {
        for (Machine m : dispositivi) {
            System.out.println(m.isOn());
        }
    }
}