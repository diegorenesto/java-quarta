public class Lavatrice implements Machine {
    private int velocitaCentrifuga;
    private ProgrammaLavaggio programmaLavaggio;
    private String classeEfficienza;

    public Lavatrice(int velocitaCentrifuga, ProgrammaLavaggio programmaLavaggio, String classeEfficienza) {
        this.velocitaCentrifuga = velocitaCentrifuga;
        this.programmaLavaggio = programmaLavaggio;
        this.classeEfficienza = classeEfficienza;
    }

    @Override
    public String toString() {
        return String.format("Velocita' centrifuga: %d, Programma lavaggio: %s, Classe Efficienza: %s", velocitaCentrifuga, programmaLavaggio, classeEfficienza);
    }
}