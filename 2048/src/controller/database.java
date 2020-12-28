package controller;
import java.sql.*;
import javax.swing.JOptionPane;

public class database {
    Connection con;
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/game2048", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Failed Connection");
        }
        return con;
    }
}