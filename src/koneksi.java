
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private static final String URL = "jdbc:mysql://localhost:3306/db_absensi1"; // Ganti sesuai database Anda
    private static final String USER = "root"; // Ganti sesuai dengan username MySQL Anda
    private static final String PASSWORD = ""; // Ganti sesuai dengan password MySQL Anda
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; // Driver MySQL

    public static Connection getKoneksi() {
        Connection conn = null;
        try {
            // Memuat driver JDBC
            Class.forName(DRIVER);
            // Membuka koneksi
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}
