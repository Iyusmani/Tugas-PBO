package bangunruang;

public class Kubus {
    double sisi;
    double volume;
    double luasPermukaan;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public void calcVolume() {
        this.volume = Math.pow(this.sisi, 3);
    }

    public void calcLuasPermukaan() {
        this.luasPermukaan = 6 * Math.pow(this.sisi, 2);
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
