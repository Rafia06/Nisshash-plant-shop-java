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
public class plantsmain {
    public static boolean flag = false;
    public static void insertIntoplants(String id, String name,String listing, int qty, int price,String imagePath){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plants", "root", "0106");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO plants(id, name, listing,quantity,cost ,image) VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, listing);
            ps.setInt(4, qty);
            ps.setInt(5, price);
            ps.setString(6, imagePath);
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Entry successful!");
            
        } catch (SQLException ex) {
            Logger.getLogger(plantsmain.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static void updateplants(String name, int qty){
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plants", "root", "0106");
            
            PreparedStatement ps = con.prepareStatement("UPDATE plants SET quantity=? WHERE name=?");
            
            ps.setInt(1, qty);
            ps.setString(2, name);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else if(ps.executeUpdate()==1 && flag){
                JOptionPane.showMessageDialog(null, "Stock updated successfully!");
                flag = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(plantsmain.class.getName()).log(Level.SEVERE, null, ex);

    }
    }
    
    public static ArrayList<ProductList> TableGenerator(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plants", "root", "0106");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT *  FROM plants");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("id"),rs.getString("name"),rs.getString("listing"),
                        rs.getInt("quantity"),rs.getInt("cost"),
                        rs.getString("image"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(plantsmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    
   public static ArrayList<ProductList> homePageContent(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plants", "root", "0106");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM plants ");
            
            ProductList pl;
            
            while(rs.next()){
                
                pl = new ProductList(rs.getString("id"),rs.getString("name"),rs.getString("listing"),
                        rs.getInt("quantity"),rs.getInt("cost"),
                        rs.getString("image"));
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(plantsmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
   public static ArrayList<ProductList> checkStock(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plants", "root", "0106");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT id, name, listing,quantity,cost  FROM plants");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("id"),rs.getString("name"),rs.getString("listing"),
                        rs.getInt("quantity"),rs.getInt("cost"), null);
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(plantsmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
   public static void delete(String name){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plants", "root", "0106");
            PreparedStatement ps = con.prepareStatement("DELETE FROM plants WHERE name=?");
            ps.setString(1,name );
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else
                JOptionPane.showMessageDialog(null, "Entry deleted successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(plantsmain.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
    
}


