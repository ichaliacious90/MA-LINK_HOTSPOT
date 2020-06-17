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
public class proxy extends javax.swing.JInternalFrame {

    ArrayList<proxyAdd> ProxyList;
    String Header [] = new String [] {"IP Address", "Chain", "Protocol", "In. Interface","Dst. Host","Action"};
    DefaultTableModel drm;
    int row, col;
    public proxy() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        ProxyList = new ArrayList<>();
        drm = new DefaultTableModel(Header, 0);
        jTableData.setModel(drm);
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
        jTableData = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jComboBoxChain = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextProtocol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTextIP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAction = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDstHost = new javax.swing.JTextField();
        jComboBoxInInt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jToggleButtonADD = new javax.swing.JToggleButton();
        jToggleButtonUPDATE = new javax.swing.JToggleButton();
        jToggleButtonDELETE = new javax.swing.JToggleButton();
        jToggleButtonClear = new javax.swing.JToggleButton();

        jToggleButton2.setText("jToggleButton2");

        setPreferredSize(new java.awt.Dimension(900, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(760, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(933, 612));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(92, 103, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 34, 34));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/security_configuration_64px.png"))); // NOI18N
        jLabel1.setText("WEB PROXY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 61));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP Address", "Chain", "Protocol", "In. Interface", "Dst. Host", "Action"
            }
        ));
        jTableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableData);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 560, 300));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxChain.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxChain.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxChain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "dstnat", "srcnat", " " }));
        jPanel5.add(jComboBoxChain, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 30));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setText("Chain : ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 30));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setText("Protocol : ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 30));

        JTextProtocol.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jPanel5.add(JTextProtocol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 30));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setText("IP Address : ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 30));

        JTextIP.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jPanel5.add(JTextIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, 30));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel6.setText("In. Interface : ");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 110, 30));

        jComboBoxAction.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Allow", "Deny" }));
        jPanel5.add(jComboBoxAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 150, 30));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setText("Action : ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 80, 30));
        jPanel5.add(jTextFieldDstHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 30));

        jComboBoxInInt.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxInInt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "ether1", "ether2", "ether3" }));
        jPanel5.add(jComboBoxInInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 30));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel7.setText("Dst. Host : ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 90, 30));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel8.setText("New WEB PROXY");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 420));

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
        jPanel1.add(jToggleButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 110, 40));

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
        jPanel1.add(jToggleButtonUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, 40));

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
        jPanel1.add(jToggleButtonDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 110, 40));

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
        jPanel1.add(jToggleButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonADDActionPerformed
        String IPAdd = JTextIP.getText();
        String Chain = jComboBoxChain.getSelectedItem().toString();
        String Protocol = JTextProtocol.getText();
        String InInterface = jComboBoxInInt.getSelectedItem().toString();
        String DstHost = jTextFieldDstHost.getText();
        String Action= jComboBoxAction.getSelectedItem().toString();
        ProxyList.add(new proxyAdd (IPAdd,Chain,Protocol,InInterface,DstHost,Action));
        drm.setRowCount(0);
        for (int i = 0; i < ProxyList.size(); i++) {
            Object [] objs = {ProxyList.get(i).IPAdd,ProxyList.get(i).Chain,ProxyList.get(i).Protocol,
                              ProxyList.get(i).InInterface,ProxyList.get(i).DstHost,ProxyList.get(i).Action};
            drm.addRow(objs);
            
        }
    }//GEN-LAST:event_jToggleButtonADDActionPerformed

    private void jToggleButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonClearActionPerformed
        JTextIP.setText("");
        jComboBoxChain.setSelectedIndex(0);
        JTextProtocol.setText("");
        jComboBoxInInt.setSelectedIndex(0);
        jTextFieldDstHost.setText("");
        jComboBoxAction.setSelectedIndex(0);
        
    }//GEN-LAST:event_jToggleButtonClearActionPerformed

    private void jToggleButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDELETEActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do You Want To Delete This Data ?", "Delete", dialogButton);
        if (dialogResult == 0) {
            drm.removeRow(row);
            ProxyList.remove(row);
            drm.setRowCount(0);
            for (int i = 0; i < ProxyList.size(); i++) {
                Object [] objs = {ProxyList.get(i).IPAdd,ProxyList.get(i).Chain,ProxyList.get(i).Protocol
                        ,ProxyList.get(i).InInterface,ProxyList.get(i).DstHost,ProxyList.get(i).Action};
                drm.addRow(objs);  
            }
        } else {
            
        }
    }//GEN-LAST:event_jToggleButtonDELETEActionPerformed

    private void jToggleButtonUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonUPDATEActionPerformed
        String UpdateIPAdd = JTextIP.getText();
        String UpdateChain = jComboBoxChain.getSelectedItem().toString();
        String UpdateProtocol = JTextProtocol.getText();
        String UpdateInInterface = jComboBoxInInt.getSelectedItem().toString();
        String UpdateDstHost = jTextFieldDstHost.getText();
        String UpdateAction = jComboBoxAction.getSelectedItem().toString();
        ProxyList.get(row).IPAdd = UpdateIPAdd;
        ProxyList.get(row).Chain = UpdateChain;
        ProxyList.get(row).Protocol = UpdateProtocol;
        ProxyList.get(row).InInterface = UpdateInInterface;
        ProxyList.get(row).DstHost = UpdateDstHost;
        ProxyList.get(row).Action = UpdateAction;
        
        drm.setRowCount(0);
        for (int i = 0; i < ProxyList.size(); i++) {
                Object [] objs = {ProxyList.get(i).IPAdd,ProxyList.get(i).Chain,ProxyList.get(i).Protocol,
                    ProxyList.get(i).InInterface,ProxyList.get(i).DstHost,ProxyList.get(i).Action};
                drm.addRow(objs);
        }
    }//GEN-LAST:event_jToggleButtonUPDATEActionPerformed

    private void jTableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDataMouseClicked
        row = jTableData.getSelectedRow();
        col = jTableData.getColumnCount();
        System.out.println(row+","+col);
        JTextIP.setText(drm.getValueAt(row, 0).toString());
        String chains = drm.getValueAt(row, 1).toString();
        for (int i = 0; i < (jComboBoxChain.getItemCount()); i++) {
            if (jComboBoxChain.getItemAt(i).equalsIgnoreCase(chains)) {
                jComboBoxChain.setSelectedIndex(i); 
            }
            
        }
        JTextProtocol.setText(drm.getValueAt(row, 2).toString());
        String InInt = drm.getValueAt(row, 3).toString();
        for (int i = 0; i <(jComboBoxInInt.getItemCount()) ; i++) {
            if (jComboBoxInInt.getItemAt(i).equalsIgnoreCase(InInt)) {
                jComboBoxInInt.setSelectedIndex(i); 
            }  
        }
        jTextFieldDstHost.setText(drm.getValueAt(row, 4).toString());
        String Actions = drm.getValueAt(row, 5).toString();
        for (int i = 0; i <(jComboBoxAction.getItemCount()) ; i++) {
            if (jComboBoxAction.getItemAt(i).equalsIgnoreCase(Actions)) {
                jComboBoxAction.setSelectedIndex(i); 
            }  
        }
        
        
        
        
    }//GEN-LAST:event_jTableDataMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextIP;
    private javax.swing.JTextField JTextProtocol;
    private javax.swing.JComboBox<String> jComboBoxAction;
    private javax.swing.JComboBox<String> jComboBoxChain;
    private javax.swing.JComboBox<String> jComboBoxInInt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableData;
    private javax.swing.JTextField jTextFieldDstHost;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButtonADD;
    private javax.swing.JToggleButton jToggleButtonClear;
    private javax.swing.JToggleButton jToggleButtonDELETE;
    private javax.swing.JToggleButton jToggleButtonUPDATE;
    // End of variables declaration//GEN-END:variables
}

