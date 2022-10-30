package bangunruang;
public class PrismaSegitiga extends Prisma{
    private double alas;
    private double tinggiAlas;
    private double tinggi;
    public PrismaSegitiga(double alas, double tinggiAlas, double tinggi){
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggi = tinggi;
    }
    @Override
    public double calcVolumePrisma() {
        return (this.alas * this.tinggiAlas * this.tinggi) / 2;
    }
    @Override
    public double calcLuasPermukaanPrisma() {
        return (this.alas * this.tinggiAlas) + (this.alas * this.tinggi) + (this.tinggiAlas * this.tinggi);
    }
}
