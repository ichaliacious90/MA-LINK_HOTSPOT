/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import com.sun.swing.internal.plaf.basic.resources.basic;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ADMIN
 */
public class user extends javax.swing.JInternalFrame {

    ArrayList<userAdd> UserList;
    String Header [] = new String [] {"Username", "Password", "Bandwith", "Time","Telp"};
    DefaultTableModel dtm;
    int row, col;
    String username,password;
    public user() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        UserList = new ArrayList<>();
        dtm = new DefaultTableModel(Header, 0);
        jTable2.setModel(dtm);
//        this.setLocation(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        JTextPassword = new javax.swing.JTextField();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jComboBoxBand = new javax.swing.JComboBox<>();
        JTextUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButtonClear = new javax.swing.JToggleButton();
        jToggleButtonADD = new javax.swing.JToggleButton();
        jToggleButtonUPDATE = new javax.swing.JToggleButton();
        jToggleButtonDELETE = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTELP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButtonsend = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPassPrint = new javax.swing.JTextField();
        jTextFieldUserPrint = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jToggleButton2.setText("jToggleButton2");

        setPreferredSize(new java.awt.Dimension(900, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(760, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(933, 612));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 34, 34));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/add_database_64px.png"))); // NOI18N
        jLabel1.setText("USER MANAGEMENT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 350, 61));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "PASSWORD", "BANDWITH", "TIME", "TELP"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 560, 140));

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTextPassword.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        JTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextPasswordActionPerformed(evt);
            }
        });
        jPanel5.add(JTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, 30));

        jComboBoxTime.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 Hours", "24 Hours" }));
        jComboBoxTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTimeActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBoxTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 30));

        jComboBoxBand.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxBand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxBand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 mbps", "5 mbps", "10 mbps" }));
        jComboBoxBand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBandActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBoxBand, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, 30));

        JTextUsername.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jPanel5.add(JTextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 130, 30));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel6.setText("TIME");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 30));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setText("BANDWITH");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jToggleButtonClear.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButtonClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButtonClear.setForeground(new java.awt.Color(131, 90, 86));
        jToggleButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/broom_30px.png"))); // NOI18N
        jToggleButtonClear.setText("CLEAR");
        jToggleButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonClearActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 110, 40));

        jToggleButtonADD.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButtonADD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButtonADD.setForeground(new java.awt.Color(131, 90, 86));
        jToggleButtonADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/add_30px.png"))); // NOI18N
        jToggleButtonADD.setText("ADD");
        jToggleButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonADDActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, 40));

        jToggleButtonUPDATE.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButtonUPDATE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButtonUPDATE.setForeground(new java.awt.Color(131, 90, 86));
        jToggleButtonUPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/update_tag_30px.png"))); // NOI18N
        jToggleButtonUPDATE.setText("UPDATE");
        jToggleButtonUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonUPDATEActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButtonUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, 40));

        jToggleButtonDELETE.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButtonDELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButtonDELETE.setForeground(new java.awt.Color(131, 90, 86));
        jToggleButtonDELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/remove_30px.png"))); // NOI18N
        jToggleButtonDELETE.setText("DELETE");
        jToggleButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonDELETEActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButtonDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 40));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setText("TELP ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 20));
        jPanel5.add(jTextFieldTELP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, 30));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setText("Username");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 420));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(131, 90, 86));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/print_24px.png"))); // NOI18N
        jToggleButton1.setText("PRINT ");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButtonsend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButtonsend.setForeground(new java.awt.Color(131, 90, 86));
        jToggleButtonsend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/paper_plane_30px.png"))); // NOI18N
        jToggleButtonsend.setText("SEND");
        jToggleButtonsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonsendActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(26, 59, 59));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("USERNAME ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel8.setText("PASSWORD");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 54, -1, 20));

        jTextFieldPassPrint.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jTextFieldPassPrint.setForeground(new java.awt.Color(26, 59, 59));
        jPanel4.add(jTextFieldPassPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 30));

        jTextFieldUserPrint.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jTextFieldUserPrint.setForeground(new java.awt.Color(26, 59, 59));
        jPanel4.add(jTextFieldUserPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 46, 310, 100));

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("MA-LINK VOUCHER");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\image\\mapin.png")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonsend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jToggleButtonsend, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 560, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonADDActionPerformed
        String User = JTextUsername.getText();
        String Pass = JTextPassword.getText();
        String band = jComboBoxBand.getSelectedItem().toString();
        String time = jComboBoxTime.getSelectedItem().toString();
        String telp = jTextFieldTELP.getText();
        UserList.add(new userAdd (User,Pass,band,time,telp));
        dtm.setRowCount(0);
        for (int i = 0; i < UserList.size(); i++) {
            Object [] objs = {UserList.get(i).User,UserList.get(i).Pass,UserList.get(i).band,UserList.get(i).time,UserList.get(i).telp};
            dtm.addRow(objs);
            
        }
    }//GEN-LAST:event_jToggleButtonADDActionPerformed

    private void jToggleButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonClearActionPerformed
        JTextUsername.setText("");
        JTextPassword.setText("");
        jTextFieldTELP.setText("");
        jComboBoxBand.setSelectedIndex(0);
        jComboBoxTime.setSelectedIndex(0);
        
    }//GEN-LAST:event_jToggleButtonClearActionPerformed

    private void jToggleButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDELETEActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do You Want To Delete This Data ?", "Delete", dialogButton);
        if (dialogResult == 0) {
            dtm.removeRow(row);
            UserList.remove(row);
            dtm.setRowCount(0);
            for (int i = 0; i < UserList.size(); i++) {
                Object [] objs = {UserList.get(i).User,UserList.get(i).Pass,UserList.get(i).band,UserList.get(i).time,UserList.get(i).telp};
                dtm.addRow(objs);  
            }
        } else {
            
        }
    }//GEN-LAST:event_jToggleButtonDELETEActionPerformed

    private void jToggleButtonUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonUPDATEActionPerformed
        String UpdateUsername = JTextUsername.getText();
        String UpdatePassword = JTextPassword.getText();
        String UpdateTelp = jTextFieldTELP.getText();
        String UpdateBandwith = jComboBoxBand.getSelectedItem().toString();
        String UpdateTime = jComboBoxTime.getSelectedItem().toString();
        UserList.get(row).User = UpdateUsername;
        UserList.get(row).Pass = UpdatePassword;
        UserList.get(row).band = UpdateBandwith;
        UserList.get(row).time = UpdateTime;
        UserList.get(row).telp = UpdateTelp;
        dtm.setRowCount(0);
        for (int i = 0; i < UserList.size(); i++) {
                Object [] objs = {UserList.get(i).User,UserList.get(i).Pass,UserList.get(i).band,UserList.get(i).time,UserList.get(i).telp};
                dtm.addRow(objs);
        }
    }//GEN-LAST:event_jToggleButtonUPDATEActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        row = jTable2.getSelectedRow();
        col = jTable2.getColumnCount();
        System.out.println(row+","+col);
        JTextUsername.setText(dtm.getValueAt(row, 0).toString());
        JTextPassword.setText(dtm.getValueAt(row, 1).toString());
        String bandwith = dtm.getValueAt(row, 2).toString();
        for (int i = 0; i < (jComboBoxBand.getItemCount()); i++) {
            if (jComboBoxBand.getItemAt(i).equalsIgnoreCase(bandwith)) {
                jComboBoxBand.setSelectedIndex(i); 
            }
            
        }
        String Waktu = dtm.getValueAt(row, 3).toString();
        for (int i = 0; i <(jComboBoxTime.getItemCount()) ; i++) {
            if (jComboBoxTime.getItemAt(i).equalsIgnoreCase(Waktu)) {
                jComboBoxTime.setSelectedIndex(i); 
            }  
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String PrintUsername = JTextUsername.getText();
        String PrintPassword = JTextPassword.getText();
        
        
        jTextFieldUserPrint.setText(PrintUsername);
        jTextFieldPassPrint.setText(PrintPassword);
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButtonsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonsendActionPerformed
        username = JTextUsername.getText();
        password = JTextPassword.getText();
        SMS ss = new SMS(username,password);
        ss.setVisible(true);
       
        //
    }//GEN-LAST:event_jToggleButtonsendActionPerformed

    private void JTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextPasswordActionPerformed

    private void jComboBoxBandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBandActionPerformed

    private void jComboBoxTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTimeActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextPassword;
    private javax.swing.JTextField JTextUsername;
    private javax.swing.JComboBox<String> jComboBoxBand;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldPassPrint;
    private javax.swing.JTextField jTextFieldTELP;
    private javax.swing.JTextField jTextFieldUserPrint;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButtonADD;
    private javax.swing.JToggleButton jToggleButtonClear;
    private javax.swing.JToggleButton jToggleButtonDELETE;
    private javax.swing.JToggleButton jToggleButtonUPDATE;
    private javax.swing.JToggleButton jToggleButtonsend;
    // End of variables declaration//GEN-END:variables
}

