import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class App {
    static final String JBDC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void showBuku() {
        String sql = "SELECT * FROM buku";
        try {
            System.out.println("Data buku : ");
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String penulis = rs.getString("penulis");
                String judul = rs.getString("judul");
                System.out.println(String.format("%d. %s ==> (%s)", id, judul, penulis));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertBuku() {
        try {
            System.out.print("Judul : ");
            String judul = input.readLine().trim();
            System.out.print("Nama Penulis : ");
            String penulis = input.readLine().trim();
            String sql = "INSERT INTO buku (judul, penulis) value('%s', '%s')";
            sql = String.format(sql, judul, penulis);
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteBuku() {
        try {
            System.out.print("Judul : ");
            String judul = input.readLine().trim();
            String sql = "DELETE FROM buku\nWHERE judul = '%s'";
            sql = String.format(sql, judul);
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateBuku() {
        try {
            System.out.print("Id : ");
            String id = input.readLine().trim();
            System.out.print("Judul Baru : ");
            String judul = input.readLine().trim();
            System.out.print("Nama Penulis : ");
            String penulis = input.readLine().trim();
            String sql = "UPDATE buku\nSET judul = '%s', penulis = '%s'\n WHERE id = %s";
            sql = String.format(sql, judul, penulis, id);
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Class.forName(JBDC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            while (true) {
                System.out.println("Menu : ");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Show");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Pilih Menu : ");
                int menu = input.nextInt();
                input.nextLine();
                switch (menu) {
                    case 1:
                        insertBuku();
                        break;
                    case 2:
                        updateBuku();
                        break;
                    case 3:
                        showBuku();
                        break;
                    case 4:
                        deleteBuku();
                        break;
                    default:
                        stmt.close();
                        conn.close();
                        System.exit(0);
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}