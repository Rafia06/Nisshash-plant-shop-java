/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kachabazaarmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class billingmain {
    public static void insertIntoBilling(String username, int price, String date){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root", "0106");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO billall(name, bill, date) VALUES(?,?,?)");
            
            ps.setString(1, username);
            ps.setInt(2, price);
            ps.setString(3, date);
           
            
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(billingmain.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static ArrayList<billop> billlings(){
        ArrayList<billop> customers = new ArrayList<>();
      
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root", "0106");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT name, bill, date FROM billall");
            
            billop pl;
            
            while(rs.next()){
                pl = new billop(rs.getString("name"),
                        rs.getInt("bill"),rs.getString("date"));
                customers.add(pl);

            }
        } catch (SQLException ex) {
            Logger.getLogger(billingmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
    
    //Deleting billing log
    public static void deleteBillings(){
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root", "0106");
            PreparedStatement ps = con.prepareStatement("DELETE FROM billall");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "All entries have been deleted!");
            
        } catch (SQLException ex) {
            Logger.getLogger(billingmain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
