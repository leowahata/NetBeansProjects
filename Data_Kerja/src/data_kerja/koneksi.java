/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_kerja;
import com.mysql.jdbc.Driver; 
import java.sql.DriverManager; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author IqbalAdiN
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{       
    if (koneksi==null){  
        Driver driver = new Driver();
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/database_gkr","root","");
       }      
        return koneksi;   
    }    

    static PreparedStatement prepareStatement(String select__from_database_gkrtable_pegawai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
