package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn;
    
    public static Connection getKoneksi() throws SQLException {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Berhasil Koneksi");
            } catch (ClassNotFoundException ex) {
                System.out.println("Gagal Koneksi" + ex);
            }
            
            String url = "jdbc:mysql://localhost:3306/gudang_barang";
            conn = DriverManager.getConnection(url, "root", "");
        }
        return conn;
    }
}