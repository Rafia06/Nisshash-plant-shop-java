/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachabazaarmanagement;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Void
 */
public class ProductList {
    private String id;
    private String name;
    private String listing;
    private int price;
    private int quantity;
    private String mimage;

    public ProductList(String id, String name,String listing, int quantity,int price, String image) {
        this.id= id;
        this.name = name;
        this.listing=listing;
        
        this.quantity = quantity;
        this.price = price;
        this.mimage = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getListing() {
        return listing;
    }

    public void setListing(String listing) {
        this.listing = listing;
    }
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getMimage() {
        //return new ImageIcon(new ImageIcon(mimage).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage;
    }
    
    
    
}

