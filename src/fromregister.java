/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ypab
 */
public class fromregister extends javax.swing.JPanel {

    /**
     * Creates new form fromregister
     */
    public fromregister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Register");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 20, -1, -1));

        jLabel2.setText("Masukkan Nama Anda");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField1.setText("Nama");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 142, -1));

        jLabel3.setText("Masukkan Password Anda");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jTextField2.setText("Password");
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, 142, -1));

        jLabel4.setText("Masukkan Password Kembali");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, -1, -1));

        jTextField3.setText("Password");
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 142, -1));

        jLabel5.setText("user");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "customer", "pembayaran", "" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        jButton1.setText("Submit");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 300, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/level.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -70, -1, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> user;
    // End of variables declaration//GEN-END:variables
}
