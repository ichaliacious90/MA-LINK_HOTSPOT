/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ADMIN
 */
public class About extends javax.swing.JInternalFrame {

    

    
    public About() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
       
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 140, 140));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(71, 118, 71));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(164, 138, 85));
        jLabel1.setText("ABOUT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 210, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/wireless-router (3).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, 140));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(227, 140, 140));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("MA-LINK ROUTER adalah sebuah aplikasi router yang dirancang untuk\nmempermudah pekerjaan seorang administrator dalam mengelola hotspot.\ndi dalam aplikasi ini seorang administrator dapat membuat, meng-update,\nmenghapus username dan password, bandwith setting, memberikan waktu \nberlakuknya username dan password. \nterdapat menu print, send serta proxy setting.\n\n\nDESKTOP PROGRAMMING VERSION\nLanguage    : Java\nIDE Editor   : NetBeans IDE 8.2\nHardware    : Intel core i3 gen 2nd\n\tAcer Aspire E1-471\nTested On    : Windows 10 Pro\n\n \n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 490, 350));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 59, 59));
        jLabel3.setText("MA-LINK ROUTER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 170, 30));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 59, 59));
        jLabel4.setText("VERSION 3.1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
