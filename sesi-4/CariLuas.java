class BangunDatar {
    private double alas, tinggi;

    protected BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double getAlas() {
        return this.alas;
    }

    protected double getTinggi() {
        return this.tinggi;
    }

    protected double findLuas() {
        return 0.0;
    }
}

class Segitiga extends BangunDatar {
    protected Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    protected double findLuas() {
        System.out.print("Luas segitiga : ");
        return 0.5 * super.getAlas() * super.getTinggi();
    }
}

class JajarGenjang extends BangunDatar {
    protected JajarGenjang(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    protected double findLuas() {
        System.out.print("Luas jajargenjang : ");
        return super.getAlas() * super.getTinggi();
    }
}

public class CariLuas {

    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga(2, 3);
        System.out.println(segitiga1.findLuas() + " cm");
        JajarGenjang jajargenjang1 = new JajarGenjang(4, 5);
        System.out.println(jajargenjang1.findLuas() + " cm");
    }
}