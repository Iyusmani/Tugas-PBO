package bangunruang;

public class Balok implements BangunRuang {
    double panjang;
    double lebar;
    double tinggi;
    double volume;
    double luasPermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public void calcVolume() {
        this.volume = this.panjang * this.lebar * this.tinggi;
    }

    @Override
    public void calcLuasPermukaan() {
        this.luasPermukaan = 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
}
