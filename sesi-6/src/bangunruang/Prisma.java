package bangunruang;

public abstract class Prisma implements BangunRuang {
    double tinggiPrisma, volume, luasPermukaan;

    public Prisma(double tinggiPrisma){
        this.tinggiPrisma = tinggiPrisma;
    }

    public abstract void calcVolume();
    public abstract void calcLuasPermukaan();
    public double getVolume(){
        return volume;
    }
    public double getLuasPermukaan(){
        return luasPermukaan;
    }
}
