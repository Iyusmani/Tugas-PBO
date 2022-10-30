import bangunruang.*;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while(true){
                System.out.println("Menu : ");
                System.out.println("1. Balok");
                System.out.println("2. Bola");
                System.out.println("3. Kubus");
                System.out.println("4. Prisma");
                System.out.println("5. Exit");
                System.out.print("Pilih : ");
                int pilih = input.nextInt();
                switch(pilih){
                    case 1:
                        System.out.print("Masukkan panjang : ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar : ");
                        double lebar = input.nextDouble();
                        System.out.print("Masukkan tinggi : ");
                        double tinggi = input.nextDouble();
                        Balok balok = new Balok(panjang, lebar, tinggi);
                        balok.calcVolume();
                        balok.calcLuasPermukaan();
                        System.out.println("Volume : " + balok.getVolume());
                        System.out.println("Luas Permukaan : " + balok.getLuasPermukaan());
                        break;
                    case 2:
                        System.out.print("Masukkan jari-jari : ");
                        double jari = input.nextDouble();
                        Bola bola = new Bola(jari);
                        bola.calcVolume();
                        bola.calcLuasPermukaan();
                        System.out.println("Volume : " + bola.getVolume());
                        System.out.println("Luas Permukaan : " + bola.getLuasPermukaan());
                        break;
                    case 3:
                        System.out.print("Masukkan sisi : ");
                        double sisi = input.nextDouble();
                        Kubus kubus = new Kubus(sisi);
                        kubus.calcVolume();
                        kubus.calcLuasPermukaan();
                        System.out.println("Volume : " + kubus.getVolume());
                        System.out.println("Luas Permukaan : " + kubus.getLuasPermukaan());
                        break;
                    case 4:
                        System.out.println("Menu : ");
                        System.out.println("1. Prisma Segitiga");
                        System.out.println("2. Prisma Segi Empat");
                        System.out.print("Pilih : ");
                        int pilihPrisma = input.nextInt();
                        switch(pilihPrisma){
                            case 1:
                                System.out.print("Masukkan alas : ");
                                double alas = input.nextDouble();
                                System.out.print("Masukkan tinggi : ");
                                double tinggi1 = input.nextDouble();
                                System.out.print("Masukkan tinggi prisma : ");
                                double tinggiPrisma = input.nextDouble();
                                PrismaSegitiga prismaSegitiga = new PrismaSegitiga(alas, tinggi1, tinggiPrisma);
                                prismaSegitiga.calcVolume();
                                prismaSegitiga.calcLuasPermukaan();
                                System.out.println("Volume : " + prismaSegitiga.getVolume());
                                System.out.println("Luas Permukaan : " + prismaSegitiga.getLuasPermukaan());
                                break;
                            case 2:
                                System.out.print("Masukkan panjang : ");
                                double panjang1 = input.nextDouble();
                                System.out.print("Masukkan lebar : ");
                                double lebar1 = input.nextDouble();
                                System.out.print("Masukkan tinggi prisma : ");
                                double tinggiPrisma1 = input.nextDouble();
                                PrismaSegiEmpat prismaSegiEmpat = new PrismaSegiEmpat(panjang1, lebar1, tinggiPrisma1);
                                prismaSegiEmpat.calcVolume();
                                prismaSegiEmpat.calcLuasPermukaan();
                                System.out.println("Volume : " + prismaSegiEmpat.getVolume());
                                System.out.println("Luas Permukaan : " + prismaSegiEmpat.getLuasPermukaan());
                                break;
                        }
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak ada");
                        break;
                }
            }
        }
    }
}