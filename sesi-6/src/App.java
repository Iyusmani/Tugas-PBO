import bangunruang.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Program Menghitung Volume dan Luas Permukaan Bangun Ruang");
                System.out.println("1. Balok");
                System.out.println("2. Kubus");
                System.out.println("3. Prisma");
                System.out.println("4. Limas");
                System.out.println("5. Exit");
                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.println("Masukkan panjang balok: ");
                        double panjang = input.nextDouble();
                        System.out.println("Masukkan lebar balok: ");
                        double lebar = input.nextDouble();
                        System.out.println("Masukkan tinggi balok: ");
                        double tinggi = input.nextDouble();
                        Balok balok = new Balok(panjang, lebar, tinggi);
                        balok.calcVolume();
                        balok.calcLuasPermukaan();
                        System.out.println("Volume balok: " + balok.getVolume());
                        System.out.println("Luas permukaan balok: " + balok.getLuasPermukaan());
                        break;
                    case 2:
                        System.out.println("Masukkan sisi kubus: ");
                        double sisi = input.nextDouble();
                        Kubus kubus = new Kubus(sisi);
                        kubus.calcVolume();
                        kubus.calcLuasPermukaan();
                        System.out.println("Volume kubus: " + kubus.getVolume());
                        System.out.println("Luas permukaan kubus: " + kubus.getLuasPermukaan());
                        break;
                    case 3:
                        System.out.println("Masukkan panjang alas prisma: ");
                        double panjangAlas = input.nextDouble();
                        System.out.println("Masukkan lebar alas prisma: ");
                        double lebarAlas = input.nextDouble();
                        System.out.println("Masukkan tinggi prisma: ");
                        double tinggiPrisma = input.nextDouble();
                        Prisma prisma = new Prisma(panjangAlas, lebarAlas, tinggiPrisma);
                        prisma.calcVolume();
                        prisma.calcLuasPermukaan();
                        System.out.println("Volume prisma: " + prisma.getVolume());
                        System.out.println("Luas permukaan prisma: " + prisma.getLuasPermukaan());
                        break;
                    case 4:
                        System.out.println("Masukkan panjang alas limas: ");
                        double panjangAlasLimas = input.nextDouble();
                        System.out.println("Masukkan lebar alas limas: ");
                        double lebarAlasLimas = input.nextDouble();
                        System.out.println("Masukkan tinggi limas: ");
                        double tinggiLimas = input.nextDouble();
                        Limas limas = new Limas(panjangAlasLimas, lebarAlasLimas, tinggiLimas);
                        limas.calcVolume();
                        limas.calcLuasPermukaan();
                        System.out.println("Volume limas: " + limas.getVolume());
                        System.out.println("Luas permukaan limas: " + limas.getLuasPermukaan());
                        break;
                    case 5:
                        System.out.println("Program selesai");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                        break;
                }
            }
        }
    }
}
