package bangunruang;

public class Balok implements BangunRuang {
    double panjang, lebar, tinggi;
    double volume, luasPermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public void calcVolume() {
        volume = panjang * lebar * tinggi;
    }

    @Override
    public void calcLuasPermukaan() {
        luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}
