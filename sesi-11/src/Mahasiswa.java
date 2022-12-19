public class Mahasiswa {
    private String nama, nim, jurusan, ttl;

    public Mahasiswa(String nama, String nim, String jurusan, String ttl) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ttl = ttl;
    }

    public String getNama(){
        return this.nama;
    }
}
