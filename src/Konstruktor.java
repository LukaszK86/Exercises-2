import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Kuki on 26.05.2017.
 */
public class Konstruktor {

    private double promien;
    private int id;
    private static int nextId;

    public Konstruktor() {
        this(10.0);
    }

    public Konstruktor(double r) {
        promien = r;
    }

    public void setPromien(double r) {
        promien = r;
    }

    public double getPromien() {
        return promien;
    }

    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    public double obliczPole() {
        double pole;
        pole = Math.PI * promien * promien;
        return pole;
    }

    public static void main(String[] args) {
        Konstruktor[] tablicaKolek = new Konstruktor[2];
        tablicaKolek[0] = new Konstruktor();
        tablicaKolek[1] = new Konstruktor(4);

        for (Konstruktor a : tablicaKolek) {
            System.out.println("PROMIEN: " + a.getPromien());
            System.out.println("OBWOD " + a.obliczObwod());
        }

        Konstruktor kolo = new Konstruktor();
        Konstruktor kolo2 = new Konstruktor(3.5);
        System.out.println("Promien wynosi " + kolo.getPromien());
        //kolo2.setPromien(3);
        System.out.println("Promien wynosi " + kolo2.getPromien());
        System.out.println("Obwod wynosi " + kolo2.obliczObwod());
        System.out.println("Pole kola wynosi" + kolo2.obliczPole());

    }

    static {
        nextId = 1;
    }
}
