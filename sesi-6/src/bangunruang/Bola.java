package bangunruang;

public class Bola implements BangunRuang {
    double jari;
    double volume, luasPermukaan;

    public Bola(double jari) {
        this.jari = jari;
    }

    @Override
    public void calcVolume() {
        volume = (4 * Math.PI * Math.pow(jari, 3)) / 3;
    }

    @Override
    public void calcLuasPermukaan() {
        luasPermukaan = 4 * Math.PI * Math.pow(jari, 2);
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
