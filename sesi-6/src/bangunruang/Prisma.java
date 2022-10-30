package bangunruang;
public abstract class Prisma implements BangunRuang{
    protected double volume;
    protected double luasPermukaan;
    public Prisma(){
    }
    @Override
    public double getVolume() {
        return this.volume;
    }
    @Override
    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
    public abstract void calcVolume();
    public abstract void calcLuasPermukaan();
}
