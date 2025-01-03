/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kachabazaarmanagement;

/**
 *
 * @author Lenovo
 */
public class billop {
    
    private String uname;
    private int bill;
    private String date;
   
    

    public billop( String uname, int bill, String date) {
        
        this.uname = uname;
        this.bill = bill;
        this.date = date;
        
    }
    
 

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
