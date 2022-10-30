package bangunruang;


public class PrismaSegiEmpat extends Prisma {
    double panjang, lebar, tinggiPrisma;
    double volume, luasPermukaan;

    public PrismaSegiEmpat(double panjang, double lebar, double tinggiPrisma) {
        super(tinggiPrisma);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void calcVolume() {
        volume = panjang * lebar * tinggiPrisma;
    }

    @Override
    public void calcLuasPermukaan() {
        luasPermukaan = 2 * (panjang * lebar + panjang * tinggiPrisma + lebar * tinggiPrisma);
    }
}
