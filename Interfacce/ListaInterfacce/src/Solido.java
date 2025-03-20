abstract public class Solido implements Cloneable, CorpoSolido {
    private double pesoSpecifico;

    protected Solido(double pesoSpecifico) { // PROTECTED perche' deve essere utilizzabile per le sottoclassi
        this.pesoSpecifico = pesoSpecifico;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public void setPesoSpecifico(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    abstract public double volume();

    abstract public double superficie();

    @Override
    public String toString() {
        return "Sono un solido";
    }

    @Override
    protected Solido clone() throws CloneNotSupportedException {
        return (Solido) super.clone();
    }

    @Override
    public double peso() {
        return pesoSpecifico * volume();
    }

    @Override
    public String colore() {
        return "Porpora";
    }
}