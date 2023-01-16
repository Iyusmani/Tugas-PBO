import java.sql.*;
import java.io.*;

public class DBLibrary {
    static final String JBDC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public DBLibrary() throws Exception {
        Class.forName(JBDC_DRIVER);
        this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
        this.stmt = conn.createStatement();
    }

    public int showBuku() throws Exception {
        String sql = "SELECT * FROM buku";
        System.out.print("Data buku : ");
        this.rs = this.stmt.executeQuery(sql);
        int a = 0;
        while (this.rs.next()) {
            int id = this.rs.getInt("id");
            String penulis = this.rs.getString("penulis");
            String judul = this.rs.getString("judul");
            System.out.print(String.format("\n%d. %s ==> (%s)", id, judul, penulis));
            a++;
        }
        if (a == 0) {
            System.out.println("Database Kosong!");
            return a;
        } else {
            return a;
        }
    }

    public void insertBuku() throws Exception {
        System.out.print("Judul : ");
        String judul = input.readLine().trim();
        System.out.print("Nama Penulis : ");
        String penulis = input.readLine().trim();
        String sql = "INSERT INTO buku (judul, penulis) value('%s', '%s')";
        sql = String.format(sql, judul, penulis);
        this.stmt.execute(sql);
    }

    public void deleteBuku() throws Exception {
        if (showBuku() != 0) {
            System.out.println("\nInput judul buku yang akan dihapus!");
            System.out.print("Judul : ");
            String judul = input.readLine().trim();
            String sql = "DELETE FROM buku\nWHERE judul = '%s'";
            sql = String.format(sql, judul);
            this.stmt.execute(sql);
        }
    }

    public void updateBuku() throws Exception {
        if (showBuku() != 0) {
            System.out.println("\nInput id buku yang akan diubah!");
            System.out.print("Id : ");
            String id = input.readLine().trim();
            System.out.print("Judul Baru : ");
            String judul = input.readLine().trim();
            System.out.print("Nama Penulis : ");
            String penulis = input.readLine().trim();
            String sql = "UPDATE buku\nSET judul = '%s', penulis = '%s'\n WHERE id = %s";
            sql = String.format(sql, judul, penulis, id);
            this.stmt.execute(sql);
        }
    }
}
