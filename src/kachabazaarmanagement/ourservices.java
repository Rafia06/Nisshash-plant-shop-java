/*
 *Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kachabazaarmanagement;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class ourservices extends javax.swing.JFrame {

    /**
     * Creates new form ourservices
     */
    static Object[] data = new Object[4];   
    static int total = 0;
    static String tot = "";
    static boolean signInStatus = false;
    static int wrongPass = 0;
    
    public ourservices() {
        initComponents();
        ArrayList<ProductList> list;
        list = plantsmain.homePageContent();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/plantsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = seedsmain.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/seedsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = potsmain.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/potsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = fertilizersmain.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/fertilizerimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
    }
    public void doPanelHideShow()
    {
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        newarrival = new javax.swing.JButton();
        plant = new javax.swing.JButton();
        seed = new javax.swing.JButton();
        pot = new javax.swing.JButton();
        ferti = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cardParentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        plants = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        plantsTable = new javax.swing.JTable();
        cartPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartItemTable = new javax.swing.JTable();
        billLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        seeds = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seedsTable = new javax.swing.JTable();
        pots = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        potsTable = new javax.swing.JTable();
        fertilizer = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        fertilizerTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 51));
        jButton2.setText("Login");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 90, 50));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Pictures\\shopping-app.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 50, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Account");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 120, 50, 20));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seeds & Bulbs");

        newarrival.setBackground(new java.awt.Color(0, 102, 51));
        newarrival.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        newarrival.setForeground(new java.awt.Color(255, 255, 255));
        newarrival.setText("New Arrival");
        newarrival.setToolTipText("Show all things");
        newarrival.setBorderPainted(false);
        newarrival.setContentAreaFilled(false);
        newarrival.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newarrival.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newarrivalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newarrivalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newarrivalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newarrivalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newarrivalMouseReleased(evt);
            }
        });
        newarrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newarrivalActionPerformed(evt);
            }
        });

        plant.setBackground(new java.awt.Color(0, 102, 51));
        plant.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        plant.setForeground(new java.awt.Color(255, 255, 255));
        plant.setText("Plants");
        plant.setBorderPainted(false);
        plant.setContentAreaFilled(false);
        plant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plantMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plantMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plantMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plantMouseReleased(evt);
            }
        });
        plant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantActionPerformed(evt);
            }
        });

        seed.setBackground(new java.awt.Color(0, 102, 51));
        seed.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        seed.setForeground(new java.awt.Color(255, 255, 255));
        seed.setText("Seeds & Bulbs");
        seed.setBorderPainted(false);
        seed.setContentAreaFilled(false);
        seed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seedMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seedMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seedMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                seedMouseReleased(evt);
            }
        });
        seed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seedActionPerformed(evt);
            }
        });

        pot.setBackground(new java.awt.Color(0, 102, 51));
        pot.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        pot.setForeground(new java.awt.Color(255, 255, 255));
        pot.setText("Pots & Planters");
        pot.setBorderPainted(false);
        pot.setContentAreaFilled(false);
        pot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                potMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                potMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                potMouseReleased(evt);
            }
        });
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potActionPerformed(evt);
            }
        });

        ferti.setBackground(new java.awt.Color(0, 102, 51));
        ferti.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        ferti.setForeground(new java.awt.Color(255, 255, 255));
        ferti.setText("Fertilizers");
        ferti.setBorderPainted(false);
        ferti.setContentAreaFilled(false);
        ferti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ferti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fertiMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fertiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fertiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fertiMouseReleased(evt);
            }
        });
        ferti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fertiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(newarrival)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(plant)
                        .addGap(124, 124, 124)
                        .addComponent(seed)
                        .addGap(118, 118, 118)
                        .addComponent(pot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(ferti)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newarrival, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plant, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pot, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ferti, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seed, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1290, 50));

        jLabel2.setBackground(new java.awt.Color(0, 102, 51));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("About us");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 101, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Pictures\\logo.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 257, 129));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("FeedBack");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 70, -1, 30));

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("-");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Pictures\\3669238_phone_settings_ic_icon.png")); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("+8801773667599, +8801311768602");

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Pictures\\3244562_chat_email_envelope_internet_letter_icon.png")); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("shahrin1907034@stud.kuet.ac.bd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 692, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1289, 50));

        jLabel15.setBackground(new java.awt.Color(0, 102, 51));
        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("Home");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 59, 31));

        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 240, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Pictures\\se.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 50, 40));

        cardParentPanel.setLayout(new java.awt.CardLayout());

        homeTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "listing", "amount", "price", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        homeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        homeTable.getTableHeader().setReorderingAllowed(false);
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(homeTable);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(homePanel, "card5");

        searchTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "listing", "amount", "price", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        searchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(searchTable);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(searchPanel, "card9");

        plantsTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        plantsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "listing", "amount", "price", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class,javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        plantsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plantsTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        plantsTable.getTableHeader().setReorderingAllowed(false);
        plantsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plantsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(plantsTable);

        javax.swing.GroupLayout plantsLayout = new javax.swing.GroupLayout(plants);
        plants.setLayout(plantsLayout);
        plantsLayout.setHorizontalGroup(
            plantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        plantsLayout.setVerticalGroup(
            plantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(plants, "card4");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        cartItemTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cartItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id", "Qyantity", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartItemTable.setEnabled(false);
        cartItemTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(cartItemTable);

        billLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        billLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("Taka Only");

        buyButton.setBackground(new java.awt.Color(0, 77, 64));
        buyButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setText("Buy");
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setText("Total Bill:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(billLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addComponent(jLabel12)
                    .addContainerGap(746, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(435, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)))
        );

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cartPanelLayout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );

        cardParentPanel.add(cartPanel, "card8");

        seedsTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        seedsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "listing", "amount", "price", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class , javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        seedsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seedsTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        seedsTable.getTableHeader().setReorderingAllowed(false);
        seedsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seedsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(seedsTable);

        javax.swing.GroupLayout seedsLayout = new javax.swing.GroupLayout(seeds);
        seeds.setLayout(seedsLayout);
        seedsLayout.setHorizontalGroup(
            seedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        seedsLayout.setVerticalGroup(
            seedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(seeds, "card3");

        potsTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        potsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "listing", "amount", "price", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class , javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        potsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        potsTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        potsTable.getTableHeader().setReorderingAllowed(false);
        potsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potsTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(potsTable);

        javax.swing.GroupLayout potsLayout = new javax.swing.GroupLayout(pots);
        pots.setLayout(potsLayout);
        potsLayout.setHorizontalGroup(
            potsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        potsLayout.setVerticalGroup(
            potsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(pots, "card2");

        fertilizerTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fertilizerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "listing", "amount", "price", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        fertilizerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fertilizerTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        fertilizerTable.getTableHeader().setReorderingAllowed(false);
        fertilizerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fertilizerTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(fertilizerTable);

        javax.swing.GroupLayout fertilizerLayout = new javax.swing.GroupLayout(fertilizer);
        fertilizer.setLayout(fertilizerLayout);
        fertilizerLayout.setHorizontalGroup(
            fertilizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        fertilizerLayout.setVerticalGroup(
            fertilizerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(fertilizer, "card2");

        jPanel1.add(cardParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1290, 590));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Pictures\\user1.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 60, 40));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 50, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("ORDERS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 120, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        aboutus a=new aboutus();
        a.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Search.plants=0;
        Search.seeds=0;
        Search.pots=0;
        Search.fers=0;
        
        ArrayList<ProductList> list = Search.plantsSearch(searchBar.getText());
        Object rowData[] = new Object[6];
        int i, j, k,m;
        
        
        if(searchBar.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Search field empty!");
        else if(Search.plants==0 && Search.seeds==0 && Search.pots==0&& Search.fers==0)
            JOptionPane.showMessageDialog(null, "Sorry! Product does not exist!");
        else{
            cardParentPanel.removeAll();
            cardParentPanel.add(searchPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
                    
            DefaultTableModel model =  (DefaultTableModel) searchTable.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            searchTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );


            model.setRowCount(0);
            for(i=0 ; i<Search.plants; i++){
                rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/plantsimg/"+temp));
            Image resizedImage = ii.getImage();
                
                
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            for(k=i; k<Search.plants+Search.seeds; k++){
                rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/seedsimg/"+temp));
            Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            System.out.println();
            for(j=k; j<Search.plants+Search.seeds+Search.pots; j++){
                rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/potsimg/"+temp));
            Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            System.out.println();
            for(m=j; m<Search.plants+Search.seeds+Search.pots+Search.fers; m++){
                rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/fertilizerimg/"+temp));
            Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newarrivalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMouseReleased
         newarrival.setBackground(new Color(0, 102, 51));
    }//GEN-LAST:event_newarrivalMouseReleased

    private void newarrivalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMousePressed
       newarrival.setBackground(new Color(11,83,69));
        
    }//GEN-LAST:event_newarrivalMousePressed

    private void newarrivalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMouseExited
        newarrival.setBackground(new Color(0, 102, 51));
        
    }//GEN-LAST:event_newarrivalMouseExited

    private void plantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantMouseExited
        // TODO add your handling code here:
   
    }//GEN-LAST:event_plantMouseExited

    private void plantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_plantMousePressed

    private void plantMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_plantMouseReleased

    private void seedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seedMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_seedMouseExited

    private void seedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seedMousePressed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_seedMousePressed

    private void seedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seedMouseReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_seedMouseReleased

    private void potMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_potMouseExited

    private void potMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_potMousePressed

    private void potMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_potMouseReleased

    private void fertiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fertiMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_fertiMouseExited

    private void fertiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fertiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fertiMousePressed

    private void fertiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fertiMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fertiMouseReleased

    private void seedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seedActionPerformed
        Information.categoryChooser = "seeds&bulbs";
        ArrayList<ProductList> list = seedsmain.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel)seedsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        seedsTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        seedsTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        seedsTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        seedsTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        seedsTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/seedsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            seedsTable.setRowHeight(150);
            seedsTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
                           
    }//GEN-LAST:event_seedActionPerformed

    private void plantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantActionPerformed
        Information.categoryChooser = "plants";
        ArrayList<ProductList> list = plantsmain.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel)plantsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        plantsTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        plantsTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        plantsTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        plantsTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        plantsTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/plantsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            plantsTable.setRowHeight(150);
            plantsTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_plantActionPerformed

    private void newarrivalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMouseClicked
           
    }//GEN-LAST:event_newarrivalMouseClicked
Information pi = new Information();
    private void newarrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newarrivalActionPerformed
       cardParentPanel.removeAll();
        cardParentPanel.add(homePanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        //Adding last three entries from every categories in home
        
        ArrayList<ProductList> list = plantsmain.homePageContent();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/plantsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = seedsmain.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/seedsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = potsmain.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/potsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = fertilizersmain.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/fertilizerimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        
    }//GEN-LAST:event_newarrivalActionPerformed

    private void plantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantMouseClicked
        cardParentPanel.removeAll();
        cardParentPanel.add(plants);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_plantMouseClicked
static String logger;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(signInStatus==false){
            dispose();
            newlogin si = new newlogin();
            si.setVisible(true);
        }
        else{
            signout si = new signout();
            si.setVisible(true);
            si.loggerName.setText(logger);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardParentPanel.removeAll();
        cardParentPanel.add(cartPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
         DefaultTableModel model =  (DefaultTableModel) cartItemTable.getModel();
         model.setRowCount(0);
         total = 0;
         tot = "";
        
        for(int i=0; i<Information.cartItem.size(); i++){
            data[0] = Information.cartItem.get(i).getName();
            data[1] = Information.cartItem.get(i).getId();
            data[2] = Information.cartItem.get(i).getQuantity();
            data[3] = Information.cartItem.get(i).getPrice();
            
            model.addRow(data);
            cartItemTable.setRowHeight(20);
            total+=Integer.parseInt(cartItemTable.getValueAt(i, 3)+"");
            
        }
        
        billLabel.setText(String.valueOf(total));
                 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void seedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seedMouseClicked
       cardParentPanel.removeAll();
        cardParentPanel.add(seeds);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_seedMouseClicked

    private void potMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(pots);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_potMouseClicked

    private void potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potActionPerformed
        // TODO add your handling code here:
        Information.categoryChooser = "pots&planters";
        ArrayList<ProductList> list = potsmain.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel)potsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        potsTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        potsTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        potsTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        potsTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        potsTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/potsimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            potsTable.setRowHeight(150);
            potsTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
                           
    }//GEN-LAST:event_potActionPerformed

    private void fertiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fertiMouseClicked
        cardParentPanel.removeAll();
        cardParentPanel.add(fertilizer);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_fertiMouseClicked

    private void fertiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fertiActionPerformed
        // TODO add your handling code here:
        Information.categoryChooser = "fertilizers";
        ArrayList<ProductList> list = fertilizersmain.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel)fertilizerTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        fertilizerTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        fertilizerTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        fertilizerTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        fertilizerTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        fertilizerTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getName();
            rowData[2] = list.get(i).getListing();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getPrice();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/fertilizerimg/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            fertilizerTable.setRowHeight(150);
            fertilizerTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_fertiActionPerformed

    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = homeTable.getSelectedRow();

        if(rowIndex<2)
        Information.categoryChooser = "plants";
        else if(rowIndex>=2 && rowIndex<4)
        Information.categoryChooser = "seeds&bulbs";
        else if(rowIndex>=4 && rowIndex<6)
        Information.categoryChooser = "pots&planters";
        else
        Information.categoryChooser = "fertilizers";

        pi.setVisible(true);
        pi.pack();

        int selectedRow = homeTable.getSelectedRow();
        TableModel tm = homeTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String name = tm.getValueAt(selectedRow, 1).toString();
        String listing = tm.getValueAt(selectedRow, 2).toString();
        String amount = tm.getValueAt(selectedRow, 3).toString();
        String price = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.Name.setText(name);
        pi.id.setText(id);
        pi.amount.setText(amount);
        pi.cost.setText(price);
        pi.productPhoto.setIcon(img);
        

    }//GEN-LAST:event_homeTableMouseClicked

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
// TODO add your handling code here:
        int rowIndex = searchTable.getSelectedRow();

        if(Search.plants!=0 && rowIndex<Search.plants)
        Information.categoryChooser = "plants";
        else if(Search.seeds!=0 && rowIndex>=Search.plants && rowIndex<Search.plants+Search.seeds)
        Information.categoryChooser = "seeds&bubls";
        else if(Search.pots!=0 && rowIndex>=Search.seeds && rowIndex<Search.plants+Search.seeds+Search.pots)
        Information.categoryChooser = "seeds&bubls";
        else
        Information.categoryChooser = "fertilizers";

        pi.setVisible(true);
        pi.pack();

        int selectedRow = searchTable.getSelectedRow();
        TableModel tm = searchTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String name = tm.getValueAt(selectedRow, 1).toString();
        String listing = tm.getValueAt(selectedRow, 2).toString();
        String amount = tm.getValueAt(selectedRow, 3).toString();
        String price = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.Name.setText(name);
        pi.id.setText(id);
        pi.amount.setText(amount);
        pi.cost.setText(price);
        pi.productPhoto.setIcon(img);
        

    }//GEN-LAST:event_searchTableMouseClicked

    private void plantsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantsTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();

        int selectedRow = plantsTable.getSelectedRow();
        TableModel tm = plantsTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String name = tm.getValueAt(selectedRow, 1).toString();
        String listing = tm.getValueAt(selectedRow, 2).toString();
        String amount = tm.getValueAt(selectedRow, 3).toString();
        String price = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.Name.setText(name);
        pi.id.setText(id);
        pi.amount.setText(amount);
        pi.cost.setText(price);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_plantsTableMouseClicked

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
        
            
            Date date = new Date();
            
            JFrame da = new location(logger, Integer.parseInt(billLabel.getText()), date.toString());
            da.setVisible(true);
        
    }//GEN-LAST:event_buyButtonActionPerformed

    private void seedsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seedsTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();

        int selectedRow = seedsTable.getSelectedRow();
        TableModel tm = seedsTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String name = tm.getValueAt(selectedRow, 1).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String price= tm.getValueAt(selectedRow, 4).toString();
        
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.Name.setText(name);
        pi.id.setText(id);
        pi.amount.setText(quantity);
        pi.cost.setText(price);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_seedsTableMouseClicked

    private void potsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potsTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();

        int selectedRow = potsTable.getSelectedRow();
        TableModel tm = potsTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String name = tm.getValueAt(selectedRow, 1).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String price= tm.getValueAt(selectedRow, 4).toString();
        
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.Name.setText(name);
        pi.id.setText(id);
        pi.amount.setText(quantity);
        pi.cost.setText(price);
        pi.productPhoto.setIcon(img);
       
    }//GEN-LAST:event_potsTableMouseClicked

    private void fertilizerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fertilizerTableMouseClicked
        pi.setVisible(true);
        pi.pack();

        int selectedRow = fertilizerTable.getSelectedRow();
        TableModel tm = fertilizerTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String name = tm.getValueAt(selectedRow, 1).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String price= tm.getValueAt(selectedRow, 4).toString();
        
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.Name.setText(name);
        pi.id.setText(id);
        pi.amount.setText(quantity);
        pi.cost.setText(price);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_fertilizerTableMouseClicked

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseClicked
        // TODO add your handling code here:
        searchBar.setText("");
    }//GEN-LAST:event_searchBarMouseClicked

    private void newarrivalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMouseEntered
       newarrival.setBackground(new Color(40,180,99));
    }//GEN-LAST:event_newarrivalMouseEntered

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
      dispose();
        begin b=new begin();
        b.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       
        if(signInStatus==false){
            
            JOptionPane.showMessageDialog(this, "Please login first","Login first",JOptionPane.ERROR_MESSAGE);
        }
        else{
            signout si = new signout();
            si.setVisible(true);
            si.loggerName.setText(logger);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        dispose();
         feedback si = new feedback();
            si.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ourservices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ourservices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ourservices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ourservices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame newMain = new ourservices();
        newMain.setTitle("NISSHASH");
        newMain.setVisible(true);
        newMain.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel billLabel;
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel cardParentPanel;
    public static javax.swing.JTable cartItemTable;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JButton ferti;
    private javax.swing.JPanel fertilizer;
    private javax.swing.JTable fertilizerTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTable homeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton newarrival;
    private javax.swing.JButton plant;
    private javax.swing.JPanel plants;
    private javax.swing.JTable plantsTable;
    private javax.swing.JButton pot;
    private javax.swing.JPanel pots;
    private javax.swing.JTable potsTable;
    private javax.swing.JTextField searchBar;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JButton seed;
    private javax.swing.JPanel seeds;
    private javax.swing.JTable seedsTable;
    // End of variables declaration//GEN-END:variables
}
