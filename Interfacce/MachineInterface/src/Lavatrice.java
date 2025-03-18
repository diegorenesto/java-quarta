public class Lavatrice implements Machine {
    private int velocitaCentrifuga;
    private ProgrammaLavaggio programmaLavaggio;
    private String classeEfficienza;
    private boolean acceso;

    public Lavatrice(int velocitaCentrifuga, ProgrammaLavaggio programmaLavaggio, String classeEfficienza) {
        this.velocitaCentrifuga = velocitaCentrifuga;
        this.programmaLavaggio = programmaLavaggio;
        this.classeEfficienza = classeEfficienza;
    }

    @Override
    public String toString() {
        return String.format("Velocita' centrifuga: %d, Programma lavaggio: %s, Classe Efficienza: %s", velocitaCentrifuga, programmaLavaggio, classeEfficienza);
    }

    @Override
    public void accendi() {
        acceso = true;
        System.out.println("Dispositivo acceso");
    }

    @Override
    public void spegni() {
        if (acceso == false) {
            System.out.println("Dispositivo gia' spento");
        } else {
            acceso = false;
            System.out.println("Dispositivo spento");
        }
    }

    @Override
    public boolean isOn() {
        return acceso;
    }
}