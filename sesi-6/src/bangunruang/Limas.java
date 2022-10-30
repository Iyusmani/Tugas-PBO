package bangunruang;

public class Limas implements BangunRuang {
    double panjang;
    double lebar;
    double tinggi;
    double volume;
    double luasPermukaan;

    public Limas(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public void calcVolume() {
        this.volume = (this.panjang * this.lebar * this.tinggi) / 3;
    }

    @Override
    public void calcLuasPermukaan() {
        this.luasPermukaan = (this.panjang * this.lebar) + (this.panjang * Math.sqrt(Math.pow(this.lebar / 2, 2) + Math.pow(this.tinggi, 2))) + (this.lebar * Math.sqrt(Math.pow(this.panjang / 2, 2) + Math.pow(this.tinggi, 2)));
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
