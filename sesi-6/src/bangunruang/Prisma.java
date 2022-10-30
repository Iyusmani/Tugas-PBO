package bangunruang;
public abstract class Prisma implements BangunRuang{
    private double volume;
    private double luasPermukaan;
    public Prisma(){
    }
    @Override
    public void calcVolume() {
        this.volume = this.calcVolumePrisma();
    }
    @Override
    public void calcLuasPermukaan() {
        this.luasPermukaan = this.calcLuasPermukaanPrisma();
    }
    public double getVolume() {
        return this.volume;
    }
    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }
    public abstract double calcVolumePrisma();
    public abstract double calcLuasPermukaanPrisma();
}
