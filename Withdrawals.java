/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author triad
 */
public class Withdrawals extends javax.swing.JFrame {

    /**
     * Creates new form Withdrawals
     */
     String passww = "";
    public Withdrawals() {
        initComponents();
        comboBoxData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitle1 = new javax.swing.JLabel();
        jComboBoxAccDeposit = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxAcc = new javax.swing.JComboBox<>();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabelTitle1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabelTitle1.setText("CASH DEPOSITS");

        jComboBoxAccDeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxAccDepositMouseClicked(evt);
            }
        });

        jLabel2.setText("Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jComboBoxAccDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAccDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deposits", jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setText("Account:");

        jComboBoxAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxAccMouseClicked(evt);
            }
        });
        jComboBoxAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAccActionPerformed(evt);
            }
        });
        jComboBoxAcc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxAccPropertyChange(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabelTitle.setText("CASH WITHDRAWALS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Withdrawals", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAccActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxAccActionPerformed

    private void jComboBoxAccPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxAccPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAccPropertyChange

    private void jComboBoxAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxAccMouseClicked
        // TODO add your handling code here:
        comboAction();
    }//GEN-LAST:event_jComboBoxAccMouseClicked

    private void jComboBoxAccDepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxAccDepositMouseClicked
        // TODO add your handling code here:
        comboActionDeposit();
    }//GEN-LAST:event_jComboBoxAccDepositMouseClicked

    
    private void comboActionDeposit(){
         try {
             JPasswordField pwd = new JPasswordField(20);
             Database db = new Database();
             char []  D = jComboBoxAcc.getSelectedItem().toString().toCharArray();
             int is = 0, t2 = 0,l=0;
             String passes = "";
             String passtest = "";
             while(t2<D.length){
                 if(D[t2] == '-'){
                     l = t2;
                 }
                 t2++;
             }
             while(is<l-2){
                 passes = passes + "" + D[is];
                 is++;
             }
             ResultSet rsac = db.getData("accountdetails");
             while(rsac.next()){
                 if(rsac.getString(1).equals(passes)){
                     passtest = rsac.getString(6);
                 }
             }
             String inputamount = JOptionPane.showInputDialog(null, "Deposit Amount: ", "Deposits", JOptionPane.WARNING_MESSAGE);
             int action = JOptionPane.showConfirmDialog(null, pwd,"Enter Password:",JOptionPane.OK_CANCEL_OPTION);
             char [] t = pwd.getPassword();
             int i = 0;
             String pass = "";
             while(i<t.length){
                 pass = pass + ""+t[i];
                 i++;
             }
             if(pass.equals(passtest)){
                 deposit(passes,inputamount);
                 
             }
             else  JOptionPane.showMessageDialog(null, "Wrong PIN", "Wrong Password", JOptionPane.WARNING_MESSAGE);
             //System.exit(0);
         } catch (SQLException ex) {
             Logger.getLogger(Withdrawals.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    private void comboAction(){
         try {
             JPasswordField pwd = new JPasswordField(20);
             Database db = new Database();
             char []  D = jComboBoxAcc.getSelectedItem().toString().toCharArray();
             int is = 0, t2 = 0,l=0;
             String passes = "";
             String passtest = "";
             while(t2<D.length){
                 if(D[t2] == '-'){
                     l = t2;
                 }
                 t2++;
             }        while(is<l-2){
                 passes = passes + "" + D[is];
                 is++;
             }
             ResultSet rsac = db.getData("accountdetails");
             while(rsac.next()){
                 if(rsac.getString(1).equals(passes)){
                     passtest = rsac.getString(6);
                 }
             }        
             String inputamount = JOptionPane.showInputDialog(null, "Withdrawal Amount: ", "Withdrawals", JOptionPane.WARNING_MESSAGE);
             if((Integer.parseInt(inputamount)%500) != 0){
                 JOptionPane.showMessageDialog(null, "Input Denominations of 500 & 1000", "ERROR", JOptionPane.WARNING_MESSAGE);
             }
             else{
             int action = JOptionPane.showConfirmDialog(null, pwd,"Enter Password:",JOptionPane.OK_CANCEL_OPTION);
             char [] t = pwd.getPassword();
             int i = 0;
             String pass = "";
             while(i<t.length){
                 pass = pass + ""+t[i];
                 i++;
             }
             
             if(pass.equals(passtest)){
                 withdraw(passes,inputamount);
             }
             else  JOptionPane.showMessageDialog(null, "Wrong PIN", "Wrong Password", JOptionPane.WARNING_MESSAGE);
             //System.exit(0);
             }
         } catch (SQLException ex) {
             Logger.getLogger(Withdrawals.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    private void withdraw(String accid, String Amount){
         try {
             Database db = new Database();
             String am = "";
             ResultSet rs = db.getData("accountdetails");
             while(rs.next()){
                 if(rs.getString(1).equals(accid)){
                     am = rs.getString(4);
                 }
             }
             double  newamount = Double.parseDouble(am) - Double.parseDouble(Amount);
             
             if(newamount<0){
                 JOptionPane.showMessageDialog(null, "Can't Withdraw more than the Account Amount", "Withdrawal Error", JOptionPane.WARNING_MESSAGE);
             }
             else{
                 String sql = "UPDATE accountdetails SET CurrentAmount='" + newamount + "' WHERE idaccountdetails='" + accid +"'";
                 PreparedStatement pt = db.getConnection().prepareStatement(sql);
                 pt.executeUpdate();
                 String sql2 = "INSERT INTO logdetails(accountid,type,amount) VALUES('" + accid + "','" + "WITHDRAWAL" + "','" + Amount + "')";
                 PreparedStatement pt2 = db.getConnection().prepareStatement(sql2);
                 pt2.executeUpdate();
                 JOptionPane.showMessageDialog(null,"Successful Transaction!: ");
             }} catch (SQLException ex) {
             Logger.getLogger(Withdrawals.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    private void deposit(String accid, String Amount){
         try {
             Database db = new Database();
             String ams = "";
             ResultSet rs = db.getData("accountdetails");
             while(rs.next()){
                 if(rs.getString(1).equals(accid)){
                     ams = rs.getString(4);
                 }
             }
             if(Double.parseDouble(Amount) > 0){
             double  newamount = Double.parseDouble(ams) + Double.parseDouble(Amount);
             String sql = "UPDATE accountdetails SET CurrentAmount='" + newamount + "' WHERE idaccountdetails='" + accid +"'";
             PreparedStatement pt = db.getConnection().prepareStatement(sql);
             pt.executeUpdate();
             
             String sql2 = "INSERT INTO logdetails(accountid,type,amount) VALUES('" + accid + "','" + "DEPOSIT" + "','" + Amount + "')";
             PreparedStatement pt2 = db.getConnection().prepareStatement(sql2);
             pt2.executeUpdate();
             JOptionPane.showMessageDialog(null,"Successful Transaction!: ");
             }
             else JOptionPane.showMessageDialog(null, "Error less than 0", "Error", JOptionPane.WARNING_MESSAGE);
         } catch (SQLException ex) {
             Logger.getLogger(Withdrawals.class.getName()).log(Level.SEVERE, null, ex);
         }
             
    }
    private void comboBoxData(){
        try {
            Database db = new Database();
            ResultSet rs = db.getData("accountdetails");
            ResultSet rs1 = db.getData("customerdetails");
            String id = "",name = "", s="";
            while(rs.next()){
                id = rs.getString(1);
                passww = rs.getString(6);
                while(rs1.next()){
                    if(rs.getString(2).equals(rs1.getString(1)))
                    {
                        name = rs1.getString(2) + "  " + rs1.getString(3);
                    }
                }
                s = id + "---" + name;
                jComboBoxAcc.addItem(s);
                jComboBoxAccDeposit.addItem(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Withdrawals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(Withdrawals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdrawals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdrawals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdrawals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdrawals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAcc;
    private javax.swing.JComboBox<String> jComboBoxAccDeposit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
