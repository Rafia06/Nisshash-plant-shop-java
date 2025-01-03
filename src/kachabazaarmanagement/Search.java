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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lenovo
 */
public class Search {
    static int plants = 0;
    static int seeds = 0;
    static int pots= 0;
    static int fers=0;
    public static ArrayList<ProductList> plantsSearch(String model){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plants", "root", "0106");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM plants WHERE name=? ");
            ps.setString(1, model);
           
            ResultSet rs = ps.executeQuery();
            
            ProductList pl, gl, kl,m1 =null;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("id"),rs.getString("name"),rs.getString("listing"),
                        rs.getInt("quantity"),rs.getInt("cost"),
                        rs.getString("image"));
                plants++;
                
                list.add(pl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seeds", "root", "0106");
            ps = con.prepareStatement("SELECT * FROM seeds WHERE name=? ");
            ps.setString(1, model);
            
            rs = ps.executeQuery();

            
            while(rs.next()){
                gl = new ProductList(rs.getString("id"),rs.getString("name"),rs.getString("listing"),
                        rs.getInt("quantity"),rs.getInt("cost"),
                        rs.getString("image"));
                seeds++;
                list.add(gl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pots", "root", "0106");
            ps = con.prepareStatement("SELECT * FROM pots WHERE name=? ");
            ps.setString(1, model);
            
            rs = ps.executeQuery();

            
            while(rs.next()){
                kl = new ProductList(rs.getString("id"),rs.getString("name"),rs.getString("listing"),
                        rs.getInt("quantity"),rs.getInt("cost"),
                        rs.getString("image"));
                pots++;
                list.add(kl);

            }
            con.close();

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fer", "root", "0106");
            ps = con.prepareStatement("SELECT * FROM fer WHERE name=? ");
            ps.setString(1, model);
            
            rs = ps.executeQuery();

            
            while(rs.next()){
                m1 = new ProductList(rs.getString("id"),rs.getString("name"),rs.getString("listing"),
                        rs.getInt("quantity"),rs.getInt("cost"),
                        rs.getString("image"));
                fers++;
                list.add(m1);

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(plantsmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
}
