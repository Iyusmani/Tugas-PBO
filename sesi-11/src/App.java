import java.io.File;
import java.io.FileNotFoundException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class App {

    // Method to create a Mahasiswa.json and add data
    public static void Write(ArrayList<Mahasiswa> mahasiswa, Gson gson, Scanner input) throws Exception {
        String nama, nim, jurusan, ttl;
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();
        System.out.print("NIM : ");
        nim = input.nextLine();
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        System.out.print("Tempat, Tanggal Lahir(tempat, d-m-Y): ");
        ttl = input.nextLine();
        mahasiswa.add(new Mahasiswa(nama, nim, jurusan, ttl));
        String mhs = gson.toJson(mahasiswa);
        FileWriter file = new FileWriter("Mahasiswa.json");
        file.write(mhs);
        file.close();
    }

    // Displaying existing data on Mahasiswa.json
    public static void Read(File tampil, Scanner output) throws Exception {
        while (output.hasNextLine()) {
            String data = output.nextLine();
            System.out.println(data);
        }
        output.close();
    }

    // Delete data in Mahasiswa.json but not doesn't delete the file
    public static void DeleteData() throws Exception {
        FileWriter file = new FileWriter("Mahasiswa.json");
        file.write("");
        file.close();
    }

    // Delete all text in console
    public static void clearConsole(Scanner input) {
        System.out.print("Klik Enter!");
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        /*
         * - Menginstansiasi object GsonBuilder dan memanggil Method setPrettyPrinting,
         * dan method Create
         * 
         * - method setPrettyPrinting => Mengonfigurasi Gson untuk mengubah atau
         * memparsing Json seperti telah di formatter text
         * 
         * - method create() => Membuat instance Gson berdasarkan konfigurasi saat
         * ini. Metode ini bebas dari efek samping pada instance GsonBuilder dan dapat
         * dipanggil berkali-kali
         */

        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Buat file dan Tambah data");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Delete Data");
            System.out.println("4. Exit");
            System.out.print("Inputkan menu : ");
            int menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:
                    Write(mahasiswa, gson, input);
                    System.out.println("\nSukses Menambahkan data!");
                    clearConsole(input);
                    break;
                case 2:
                    try {
                        File tampil = new File("Mahasiswa.json");
                        Scanner output = new Scanner(tampil);
                        Read(tampil, output);
                        clearConsole(input);
                        break;
                    } catch (FileNotFoundException e) {
                        System.out.println("File tidak ada");
                        continue;
                    }
                case 3:
                    try {
                        File file = new File("Mahasiswa.json");
                        Scanner out = new Scanner(file);
                        DeleteData();
                        System.out.println("\nSukses menghapus data!");
                        clearConsole(input);
                        out.close();
                        break;
                    } catch (FileNotFoundException e) {
                        System.out.println("File tidak ada");
                        continue;
                    }
                case 4:
                    System.out.println("Program Berhenti!");
                    input.close();
                    System.exit(0);
                    break;
            }
        }
    }
}