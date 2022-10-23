public class Nunggak{
    private String nama, jurusan;
    private int bulan;
    public Nunggak(String nama, String jurusan, int bulan){
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
    public static void main(String[] args) {
        Regular mhs1 = new Regular("Indra", "Teknik Informatika", 2);
        Karyawan mhs2 = new Karyawan("Ucup", "Teknik Sipil", 5);
        System.out.println("Cek tagihan indra Rp. : " + mhs1.cekTagihan());       
        System.out.println("Cek tagihan indra Rp. : " + mhs2.cekTagihan());       
    }
}
class Regular extends Nunggak{
    public Regular(String nama, String jurusan, int bulan){
        super(nama, jurusan, bulan);
    }
    public long cekTagihan(){
        return super.getBulan() * 2800000;
    }
}
class Karyawan extends Nunggak{
    public Karyawan(String nama, String jurusan, int bulan){
        super(nama, jurusan, bulan);
    }
    public long cekTagihan(){
        return super.getBulan() * 2800000;
    }
}
