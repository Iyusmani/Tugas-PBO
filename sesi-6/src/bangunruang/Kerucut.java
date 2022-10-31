package bangunruang;

public class Kerucut implements BangunRuang {
    double jari, tinggi, sisiMiring;
    double volume, luasPermukaan;

    public Kerucut(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public Kerucut(double jari, double tinggi, double sisiMiring) {
        this.jari = jari;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public void calcVolume() {
        volume = (Math.PI * Math.pow(jari, 2) * tinggi) / 3;
    }

    @Override
    public void calcLuasPermukaan() {
        luasPermukaan = Math.PI * jari * (jari + sisiMiring);
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