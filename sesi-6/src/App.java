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
                System.out.println("5. Kerucut");
                System.out.println("6. Exit");
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
                                System.out.print("Masukkan tinggi alas : ");
                                double tinggiAlas = input.nextDouble();
                                System.out.print("Masukkan tinggi : ");
                                double tinggi1 = input.nextDouble();
                                PrismaSegitiga prismaSegitiga = new PrismaSegitiga(alas, tinggiAlas, tinggi1);
                                prismaSegitiga.calcVolume();
                                prismaSegitiga.calcLuasPermukaan();
                                System.out.println("Volume : " + prismaSegitiga.getVolume());
                                System.out.println("Luas Permukaan : " + prismaSegitiga.getLuasPermukaan());
                                break;
                            case 2:
                                System.out.print("Masukkan panjang : ");
                                double panjangPrisma = input.nextDouble();
                                System.out.print("Masukkan lebar : ");
                                double lebarPrisma = input.nextDouble();
                                System.out.print("Masukkan tinggi : ");
                                double tinggiPrisma = input.nextDouble();
                                PrismaSegiEmpat prismaSegiEmpat = new PrismaSegiEmpat(panjangPrisma, lebarPrisma, tinggiPrisma);
                                prismaSegiEmpat.calcVolume();
                                prismaSegiEmpat.calcLuasPermukaan();
                                System.out.println("Volume : " + prismaSegiEmpat.getVolume());
                                System.out.println("Luas Permukaan : " + prismaSegiEmpat.getLuasPermukaan());
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Menu : ");
                        System.out.println("1. Cari volume");
                        System.out.println("2. Cari luas permukaan dan volume");
                        System.out.print("Pilih : ");
                        int pilihKerucut = input.nextInt();
                        switch(pilihKerucut){
                            case 1:
                                System.out.print("Masukkan jari-jari : ");
                                double jariKerucut = input.nextDouble();
                                System.out.print("Masukkan tinggi : ");
                                double tinggiKerucut = input.nextDouble();
                                Kerucut kerucut = new Kerucut(jariKerucut, tinggiKerucut);
                                kerucut.calcVolume();
                                System.out.println("Volume : " + kerucut.getVolume());
                                break;
                            case 2:
                                System.out.print("Masukkan jari-jari : ");
                                double jariKerucut1 = input.nextDouble();
                                System.out.print("Masukkan tinggi : ");
                                double tinggiKerucut1 = input.nextDouble();
                                System.out.print("Masukan sisi miring : ");
                                double sisiMiring = input.nextDouble();
                                Kerucut kerucut1 = new Kerucut(jariKerucut1, tinggiKerucut1, sisiMiring);
                                kerucut1.calcVolume();
                                kerucut1.calcLuasPermukaan();
                                System.out.println("Volume : " + kerucut1.getVolume());
                                System.out.println("Luas Permukaan : " + kerucut1.getLuasPermukaan());
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Program selesai");
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