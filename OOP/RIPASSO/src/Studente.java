public class Studente {

    private String nome;
    private String cognome;
    private int eta;
    private double media;
    private boolean isStudying = false;

    Studente(String nome, String cognome, int eta, double media){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s, Cognome: %s, Eta': %d, Media: %f", nome, cognome, eta, media);
    }

    public boolean isStudying() {
        return isStudying;
    }

    public void studia(){
        isStudying = true;
        System.out.println(this.nome + " sta studiando");
    }

    public void stop(){
        isStudying = false;
        System.out.println(this.nome + " non sta studiando");
    }
}