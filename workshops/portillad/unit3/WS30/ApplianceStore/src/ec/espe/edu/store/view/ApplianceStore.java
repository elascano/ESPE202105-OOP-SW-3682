/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.store.view;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class ApplianceStore extends javax.swing.JFrame {

    /**
     * Creates new form ApplianceStore
     */
    public ApplianceStore() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        MnuExit = new javax.swing.JMenu();
        MnuUsers = new javax.swing.JMenu();
        ItmCreateUser = new javax.swing.JMenuItem();
        ItmChangePaswoord = new javax.swing.JMenuItem();
        MnuProduct = new javax.swing.JMenu();
        ItmBuyProduct = new javax.swing.JMenuItem();
        ItmAddProduct = new javax.swing.JMenuItem();
        ItmDeleteProduct = new javax.swing.JMenuItem();
        MnuBill = new javax.swing.JMenu();
        ItmGenerateBill = new javax.swing.JMenuItem();
        ItmReviewBill = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MnuExit.setText("Exit");
        MnuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MnuExit);

        MnuUsers.setText("Users");

        ItmCreateUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        ItmCreateUser.setText("Create");
        ItmCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmCreateUserActionPerformed(evt);
            }
        });
        MnuUsers.add(ItmCreateUser);

        ItmChangePaswoord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        ItmChangePaswoord.setText("Change Paswoord");
        ItmChangePaswoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmChangePaswoordActionPerformed(evt);
            }
        });
        MnuUsers.add(ItmChangePaswoord);

        jMenuBar1.add(MnuUsers);

        MnuProduct.setText("Product");

        ItmBuyProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        ItmBuyProduct.setText("Buy Product");
        ItmBuyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmBuyProductActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmBuyProduct);

        ItmAddProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        ItmAddProduct.setText("Add Product");
        ItmAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAddProductActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmAddProduct);

        ItmDeleteProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        ItmDeleteProduct.setText("Delete Product");
        ItmDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmDeleteProductActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmDeleteProduct);

        jMenuBar1.add(MnuProduct);

        MnuBill.setText("Bill");

        ItmGenerateBill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        ItmGenerateBill.setText("Generate Bill");
        ItmGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmGenerateBillActionPerformed(evt);
            }
        });
        MnuBill.add(ItmGenerateBill);

        ItmReviewBill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        ItmReviewBill.setText("Review Bill");
        ItmReviewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmReviewBillActionPerformed(evt);
            }
        });
        MnuBill.add(ItmReviewBill);

        jMenuBar1.add(MnuBill);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuExitMouseClicked
     System.exit(0);
    }//GEN-LAST:event_MnuExitMouseClicked

    private void ItmCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmCreateUserActionPerformed
        FrmCreateUser frmCreateUser = new FrmCreateUser();
        frmCreateUser.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_ItmCreateUserActionPerformed

    private void ItmAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAddProductActionPerformed
        FrmAddProduct frmAddProduct = new FrmAddProduct();
        frmAddProduct.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItmAddProductActionPerformed

    private void ItmBuyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmBuyProductActionPerformed
        FrmBuyProduct frmBuyProduct = new FrmBuyProduct();
        frmBuyProduct.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItmBuyProductActionPerformed

    private void ItmChangePaswoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmChangePaswoordActionPerformed
       FrmChangePaswoord frmChangePaswoord = new FrmChangePaswoord();
       frmChangePaswoord.setVisible(true);
       dispose();
    }//GEN-LAST:event_ItmChangePaswoordActionPerformed

    private void ItmDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmDeleteProductActionPerformed
        FrmDeleteProduct frmDeleteProduct = new FrmDeleteProduct();
        frmDeleteProduct.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItmDeleteProductActionPerformed

    private void ItmGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmGenerateBillActionPerformed
        FrmGenerateBill frmGenerateBill = new FrmGenerateBill();
        frmGenerateBill.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItmGenerateBillActionPerformed

    private void ItmReviewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmReviewBillActionPerformed
        FrmReviewBill frmReviewBill = new FrmReviewBill();
        frmReviewBill.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItmReviewBillActionPerformed

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
            java.util.logging.Logger.getLogger(ApplianceStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplianceStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplianceStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplianceStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplianceStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmAddProduct;
    private javax.swing.JMenuItem ItmBuyProduct;
    private javax.swing.JMenuItem ItmChangePaswoord;
    private javax.swing.JMenuItem ItmCreateUser;
    private javax.swing.JMenuItem ItmDeleteProduct;
    private javax.swing.JMenuItem ItmGenerateBill;
    private javax.swing.JMenuItem ItmReviewBill;
    private javax.swing.JMenu MnuBill;
    private javax.swing.JMenu MnuExit;
    private javax.swing.JMenu MnuProduct;
    private javax.swing.JMenu MnuUsers;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
