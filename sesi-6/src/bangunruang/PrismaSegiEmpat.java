package bangunruang;

public class PrismaSegiEmpat extends Prisma{
    private double panjang;
    private double lebar;
    private double tinggi;
    public PrismaSegiEmpat(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    @Override
    public double calcVolumePrisma() {
        return this.panjang * this.lebar * this.tinggi;
    }
    @Override
    public double calcLuasPermukaanPrisma() {
        return (2 * this.panjang * this.lebar) + (2 * this.panjang * this.tinggi) + (2 * this.lebar * this.tinggi);
    }
}
