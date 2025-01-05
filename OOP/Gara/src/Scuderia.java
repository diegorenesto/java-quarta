public class Scuderia {

    private String scuderia;
    private int cilindrata;
    private Pilota pilota;


    public Scuderia(String scuderia, int cilindrata, Pilota pilota) {
        this.scuderia = scuderia;
        this.cilindrata = cilindrata;
        this.pilota = pilota;
    }

    public Pilota getPilota() {
        return pilota;
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getScuderia() {
        return scuderia;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setPilota(Pilota _pilota) {
        this.pilota = _pilota;
    }


    @Override
    public String toString() {
        return String.format("Scuderia: %s, Cilindrata: %d", scuderia, cilindrata);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}