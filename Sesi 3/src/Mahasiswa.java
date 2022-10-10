public class Mahasiswa {
    private String[] nama, nim;
    private char[] grade;
    private boolean[] status;
    private int[] nilai;
    public void setDataMhs(String[] nama, String[] nim, int[] nilai, char[] grade, boolean[] status){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.grade = grade;
        this.status = status;
        nama = nim = null;
        grade = null;
        nilai = null;
        status = null;
    }
    public String[] getNama(){
        return nama;
    }
    public String[] getNim(){
        return nim;
    }
    public int[] getNilai(){
        return nilai;
    }
    public char[] getGrade(){
        return grade;
    }
    public boolean[] getStatus(){
        return status;
    }
    public void jmlLulus(boolean[] status, boolean a){
        int b = 0;
        String c = "";
        if(a){
            c = "Lulus";
        }else{
            c = "Tidak Lulus";
        }
        for(int i = 0; i < status.length; i++){
            if(status[i] == a){
                b++;
            }
        }
        if(b != 0){
            System.out.printf("Jumlah mahasiswa yang %s : %d", c, b);
            mhsLulus(getStatus(), getNama(), a);
        }
    }
    public void mhsLulus(boolean[] status, String[] nama, boolean a){
        System.out.print(" yaitu ");
        int b = 0;
        for(int i = 0; i < status.length; i++){
            if(status[i] == a){
                b++;
                if(b >= 2){
                    System.out.print(", ");
                }
                System.out.print(nama[i]);
            }
        }
        System.out.print("\n");
    }
    public void jmlnilai(char[] grade, String[] nama, char a){
        int b = 0;
        for(int i = 0; i < grade.length; i++){
            if(grade[i] == a){
                b++;
            }
        }
        if(b != 0){
            System.out.printf("Jumlah mahasiswa dengan nilai %c : %d", a, b);
            mhsNilai(getGrade(), getNama(), a);
        }
    }
    public void mhsNilai(char[] grade, String[] nama, char a){
        System.out.print(" yaitu ");
        int b = 0;
        for(int i = 0; i < grade.length; i++){
            if(grade[i] == a){
                b++;
                if(b >= 2){
                    System.out.print(", ");
                }
                System.out.print(nama[i]);
            }
        }
        System.out.print("\n");
    }
    public void rataMhs(int[] nilai){
        System.out.print("Rata-rata nilai mahasiswa adalah : ");
        int b = nilai.length;
        int a = 0;
        for(int i = 0; i < nilai.length; i++){
            System.out.print(nilai[i]);
            a += nilai[i];
            if(i != b - 1){
                System.out.print("+");
            }
        }
        System.out.printf(" / %d = %.2f", b, (float) a / b);
    }
}
