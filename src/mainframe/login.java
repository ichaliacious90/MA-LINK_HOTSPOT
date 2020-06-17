/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class login extends javax.swing.JFrame {

    int x,y;
    
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        kiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        tfusername = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        pfpass = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kiri.setBackground(new java.awt.Color(204, 204, 255));
        kiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Charlemagne Std", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("MA-LINK");
        kiri.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, 22));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/MAP1.png"))); // NOI18N
        kiri.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 90, 100));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Let's Explore Your Router");
        kiri.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 174, 22));

        jSeparator1.setForeground(new java.awt.Color(0, 51, 153));
        kiri.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 160, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Copyright @ 2020, Noviyarti");
        kiri.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, -1));
        kiri.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 210, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/signal_26px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        kiri.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jPanel2.add(kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 460));

        jPanel1.setBackground(new java.awt.Color(22, 74, 18));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 162, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("LOG IN AS ADMIN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 162, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("USERNAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 162, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 10));

        tfusername.setBackground(new java.awt.Color(22, 74, 18));
        tfusername.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        tfusername.setForeground(new java.awt.Color(204, 204, 204));
        tfusername.setText("Enter Your Username");
        tfusername.setBorder(null);
        tfusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfusernameMouseClicked(evt);
            }
        });
        tfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusernameActionPerformed(evt);
            }
        });
        jPanel1.add(tfusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 20));

        jTextField2.setBackground(new java.awt.Color(0, 51, 153));
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("ENTER YOUR USERNAME");
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 20));

        pfpass.setBackground(new java.awt.Color(22, 74, 18));
        pfpass.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        pfpass.setForeground(new java.awt.Color(204, 204, 204));
        pfpass.setText("jPasswordField1");
        pfpass.setBorder(null);
        pfpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pfpassMouseClicked(evt);
            }
        });
        jPanel1.add(pfpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, -1));

        jButtonLogin.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(22, 74, 18));
        jButtonLogin.setText("LOG IN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 380, 90, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton/img/close_window_32px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 340, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 461));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusernameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tfusernameActionPerformed

    private void tfusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfusernameMouseClicked
        // TODO add your handling code here:
        tfusername.setText("");
    }//GEN-LAST:event_tfusernameMouseClicked

    private void pfpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfpassMouseClicked
        // TODO add your handling code here:
        pfpass.setText("");
    }//GEN-LAST:event_pfpassMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //int xx  = evt
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
       x = evt.getX();
       y = evt.getY();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String Username = "admin";
        String Password = "admin";
        if (Username.equalsIgnoreCase(tfusername.getText()) && Password.equalsIgnoreCase(pfpass.getText())) {
         this.setVisible(false);
         new home().setVisible(true);
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(null, "Kombinasi Username dan Password anda Salah");
            tfusername.setText("");
            pfpass.setText("");
            tfusername.requestFocus();
        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        MenuPage mn = new MenuPage();
        mn.setVisible(true);
        mn.pack();
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel kiri;
    private javax.swing.JPasswordField pfpass;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
