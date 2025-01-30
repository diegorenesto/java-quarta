public class OrarioException4F extends Exception {
    private String message = "Problema con l'orario";
    private int h;
    private int m;
    private int s;

    public OrarioException4F(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}