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
    public void calcVolume() {
        super.volume = this.panjang * this.lebar * this.tinggi;
    }
    @Override
    public void calcLuasPermukaan() {
        super.luasPermukaan = (2 * this.panjang * this.lebar) + (2 * this.panjang * this.tinggi) + (2 * this.lebar * this.tinggi);
    }
}
