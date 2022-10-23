class Mahasiswa{
    private String nama, jurusan;
    private int bulan;
    public Mahasiswa(String nama, String jurusan, int bulan){
        this.nama = nama;
        this.jurusan = jurusan;
        this.bulan = bulan;
    }
    public int getBulan(){
        return this.bulan;
    }
    public long cekTagihan(){
        return 0;
    }
}
class Regular extends Mahasiswa{
    public Regular(String nama, String jurusan, int bulan){
        super(nama, jurusan, bulan);
    }
    public long cekTagihan(){
        return super.getBulan() * 2800000;
    }
}
class Karyawan extends Mahasiswa{
    public Karyawan(String nama, String jurusan, int bulan){
        super(nama, jurusan, bulan);
    }
    public long cekTagihan(){
        return super.getBulan() * 2800000;
    }
}
public class Nunggak{
    public static void main(String[] args) {
        Regular mhs1 = new Regular("Indra", "Teknik Informatika", 2);
        Karyawan mhs2 = new Karyawan("Ucup", "Teknik Sipil", 5);
        System.out.println("Cek tagihan indra Rp. : " + mhs1.cekTagihan());       
        System.out.println("Cek tagihan indra Rp. : " + mhs2.cekTagihan());       
    }
}
