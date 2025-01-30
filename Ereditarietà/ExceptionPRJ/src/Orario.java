public class Orario {
    private int h;
    private int m;
    private int s;

    public Orario(int h, int m, int s) {
        try {
            checkOrario(h, m, s);
        } catch (OrarioException4F o) {
            System.out.println(o.getMessage());
            System.out.println(o.getH());
            System.out.println(o.getM());
            System.out.println(o.getS());
        }
        this.h = h;
        this.m = m;
        this.s = s;

    }

    private void checkOrario(int h, int m, int s) throws OrarioException4F {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            throw new OrarioException4F(h, m, s);
        }
    }
}