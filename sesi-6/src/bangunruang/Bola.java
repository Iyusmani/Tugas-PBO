package bangunruang;

public class Bola implements BangunRuang {
    double jariJari;
    double volume, luasPermukaan;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void calcVolume() {
        volume = 4 * Math.PI * Math.pow(jariJari, 3) / 3;
    }

    @Override
    public void calcLuasPermukaan() {
        luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
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
