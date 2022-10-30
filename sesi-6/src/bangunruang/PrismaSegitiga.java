package bangunruang;

public class PrismaSegitiga extends Prisma {
    double alas, tinggi, tinggiPrisma;
    double volume, luasPermukaan;

    public PrismaSegitiga(double alas, double tinggi, double tinggiPrisma) {
        super(tinggiPrisma);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void calcVolume() {
        volume = (alas * tinggi * tinggiPrisma) / 2;
    }

    @Override
    public void calcLuasPermukaan() {
        luasPermukaan = (alas * tinggi) + (alas * tinggiPrisma) + (tinggi * tinggiPrisma);
    }
}
