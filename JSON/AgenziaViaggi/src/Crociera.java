public class Crociera extends Viaggio {
    private String nomeNave;
    private String portoPartenza;
    private TipoCabina tipoCabina;
    private boolean pastiInclusi;

    public Crociera(String destinazione, int costo, int giorni, String nomeNave, String portoPartenza, TipoCabina tipoCabina, boolean pastiInclusi) {
        super(destinazione, costo, giorni);
        this.nomeNave = nomeNave;
        this.portoPartenza = portoPartenza;
        this.tipoCabina = tipoCabina;
        this.pastiInclusi = pastiInclusi;
    }

    public String getNomeNave() {
        return nomeNave;
    }

    public String getPortoPartenza() {
        return portoPartenza;
    }

    public TipoCabina getTipoCabina() {
        return tipoCabina;
    }

    public boolean isPastiInclusi() {
        return pastiInclusi;
    }

    public void setPastiInclusi(boolean pastiInclusi) {
        this.pastiInclusi = pastiInclusi;
    }

    @Override
    public String toString() {
        return super.toString() + " , Nome nave: " + nomeNave + " , Partenza: " + portoPartenza + " , Tipo cabina: " + tipoCabina + " , Pasti inclusi: " + pastiInclusi;
    }
}
