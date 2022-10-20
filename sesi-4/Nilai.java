class Mahasiswa {

    private String[] nama, status;
    private char[] grade;

    public Mahasiswa(
            String[] nama,
            char[] grade,
            String[] status) {
        this.nama = nama;
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
}

public class Nilai {
    public static void main(String[] args) {
        String nama[] = { "Ahmad", "Rizal", "Sora", "Kimi" };
        char grade[] = { 'B', 'A', 'A', 'B' };
        String status[] = { "Lulus", "Lulus", "Lulus", "Lulus" };
        Mahasiswa mhs1 = new Mahasiswa(nama, grade, status);
        mhs1.jmlMhs("Lulus");
        mhs1.jmlMhs("Tidak Lulus");
        mhs1.jmlMhs('A');
        mhs1.jmlMhs('B');
        mhs1.jmlMhs('C');
        mhs1.jmlMhs('D');
        mhs1.jmlMhs('E');
    }
}
