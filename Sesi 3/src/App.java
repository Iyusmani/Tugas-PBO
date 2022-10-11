import java.util.Scanner;

public class App {

  public static char Grade(int a) {
    if (a >= 0 && a < 50) {
      System.out.println("Grade : E");
      return 'E';
    } else if (a >= 50 && a < 60) {
      System.out.println("Grade : D");
      return 'D';
    } else if (a >= 60 && a < 70) {
      System.out.println("Grade : C");
      return 'C';
    } else if (a >= 70 && a < 80) {
      System.out.println("Grade : B");
      return 'B';
    } else {
      System.out.println("Grade : A");
      return 'A';
    }
  }

  public static String Status(char a) {
    if (a == 'D' || a == 'E') {
      return "Tidak Lulus";
    } else {
      return "Lulus";
    }
  }

  public static void Equal() {
    for (int i = 0; i < 50; i++) {
      System.out.print("=");
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Mahasiswa mhs = new Mahasiswa();
    int n = 4;
    String[] nama = new String[n];
    String[] status = new String[n];
    char[] grade = new char[n];
    String[] nim = new String[n];
    int[] nilai = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("NIM   : ");
      nim[i] = input.nextLine();
      System.out.print("Nama  : ");
      nama[i] = input.nextLine();
      System.out.print("Nilai : ");
      nilai[i] = input.nextInt();
      while (nilai[i] < 0 || nilai[i] > 100) {
        System.out.println("Inputan anda salah!");
        System.out.print("Nilai : ");
        nilai[i] = input.nextInt();
      }
      grade[i] = Grade(nilai[i]);
      status[i] = Status(grade[i]);
      input.nextLine();
      Equal();
    }
    mhs.setDataMhs(nama, nim, nilai, grade, status);
    System.out.println("Jumlah Mahasiswa : " + n);
    mhs.jmlMhs("Lulus");
    mhs.jmlMhs("Tidak Lulus");
    mhs.jmlMhs('A');
    mhs.jmlMhs('B');
    mhs.jmlMhs('C');
    mhs.jmlMhs('D');
    mhs.jmlMhs('E');
    mhs.rataMhs();
    input.close();
  }
}
