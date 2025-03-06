abstract public class Solido implements Cloneable {
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

    public double peso() {
        return pesoSpecifico * volume();
    }

    @Override
    public String toString() {
        return "Sono un solido";
    }

    @Override
    protected Solido clone() throws CloneNotSupportedException {
        return (Solido) super.clone();
    }
}