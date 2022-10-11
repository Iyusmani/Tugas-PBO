public class Mahasiswa {

  private String[] nama, nim, status;
  private char[] grade;
  private int[] nilai;

  public void setDataMhs(
    String[] nama,
    String[] nim,
    int[] nilai,
    char[] grade,
    String[] status
  ) {
    this.nama = nama;
    this.nim = nim;
    this.nilai = nilai;
    this.grade = grade;
    this.status = status;
  }

  public void jmlMhs(String a) {
    int b = 0, c = 0;
    for (int i = 0; i < status.length; i++) {
      if (status[i] == a) {
        b++;
      }
    }
    if (b != 0) {
      System.out.printf("Jumlah Mahasiswa yang %s : %d yaitu ", a, b);
      for (int i = 0; i < status.length; i++) {
        if (status[i] == a) {
          c++;
          if (c >= 2) {
            System.out.print(", ");
          }
          System.out.print(nama[i]);
        }
      }
      System.out.print("\n");
    }
  }

  public void jmlMhs(char a) {
    int b = 0, c = 0;
    for (int i = 0; i < grade.length; i++) {
      if (grade[i] == a) {
        b++;
      }
    }
    if (b != 0) {
      System.out.printf("Jumlah Mahasiswa dengan nilai %c : %d yaitu ", a, b);
      for (int i = 0; i < grade.length; i++) {
        if (grade[i] == a) {
          c++;
          if (c >= 2) {
            System.out.print(", ");
          }
          System.out.print(nama[i]);
        }
      }
      System.out.print("\n");
    }
  }

  public void rataMhs() {
    System.out.print("Rata-rata nilai mahasiswa adalah : ");
    int b = nilai.length;
    int a = 0;
    for (int i = 0; i < nilai.length; i++) {
      System.out.print(nilai[i]);
      a += nilai[i];
      if (i != b - 1) {
        System.out.print("+");
      }
    }
    System.out.printf(" / %d = %.2f", b, (float) a / b);
  }
}
