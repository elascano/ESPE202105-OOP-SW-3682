/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groceryStore.view;

/**
 *
 * @author pc
 */
public class GroceryStore extends javax.swing.JFrame {
    public void showProducts(){
        FrmProductData frmProductData = new FrmProductData();
        frmProductData.setVisible(true);
    }

    /**
     * Creates new form GroceryStore
     */
    public GroceryStore() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuExit = new javax.swing.JMenu();
        MnuUsers = new javax.swing.JMenu();
        ItmCreate = new javax.swing.JMenuItem();
        ItmChangePassword = new javax.swing.JMenuItem();
        MnuProduct = new javax.swing.JMenu();
        ItmBuy = new javax.swing.JMenuItem();
        ItmAdd = new javax.swing.JMenuItem();
        ItmDelete = new javax.swing.JMenuItem();
        ItmShowProducts = new javax.swing.JMenuItem();
        MnuBill = new javax.swing.JMenu();
        ItmGenerate = new javax.swing.JMenuItem();
        ItmReview = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setText("GROCERY STORE");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("WELLCOME!!");

        MnuExit.setText("Exit");
        MnuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MnuExit);

        MnuUsers.setText("Users");
        MnuUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuUsersActionPerformed(evt);
            }
        });

        ItmCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmCreate.setText("Create");
        ItmCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmCreateActionPerformed(evt);
            }
        });
        MnuUsers.add(ItmCreate);

        ItmChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmChangePassword.setText("Change Password");
        ItmChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmChangePasswordActionPerformed(evt);
            }
        });
        MnuUsers.add(ItmChangePassword);

        jMenuBar1.add(MnuUsers);

        MnuProduct.setText("Product");

        ItmBuy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmBuy.setText("Buy Product");
        ItmBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmBuyActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmBuy);

        ItmAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmAdd.setText("Add Product");
        ItmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAddActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmAdd);

        ItmDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmDelete.setText("Delete Product");
        ItmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmDeleteActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmDelete);

        ItmShowProducts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmShowProducts.setText("show Product");
        ItmShowProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmShowProductsActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmShowProducts);

        jMenuBar1.add(MnuProduct);

        MnuBill.setText("Bill");
        MnuBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuBillActionPerformed(evt);
            }
        });

        ItmGenerate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmGenerate.setText("Generate Bill");
        ItmGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmGenerateActionPerformed(evt);
            }
        });
        MnuBill.add(ItmGenerate);

        ItmReview.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmReview.setText("review Bill");
        ItmReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmReviewActionPerformed(evt);
            }
        });
        MnuBill.add(ItmReview);

        jMenuBar1.add(MnuBill);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MnuExitMouseClicked

    private void ItmCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmCreateActionPerformed
      FrmCreateUser frmCreateUser = new FrmCreateUser();
      frmCreateUser.setVisible(true);
    }//GEN-LAST:event_ItmCreateActionPerformed

    private void MnuUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnuUsersActionPerformed

    private void ItmChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmChangePasswordActionPerformed
        FrmChangePassword frmChangePassword = new FrmChangePassword();
        frmChangePassword.setVisible(true);
    }//GEN-LAST:event_ItmChangePasswordActionPerformed

    private void ItmBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmBuyActionPerformed
       FrmBuy frmBuy = new FrmBuy();
       frmBuy.setVisible(true);
    }//GEN-LAST:event_ItmBuyActionPerformed

    private void ItmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmDeleteActionPerformed
        FrmDelete frmDelete = new FrmDelete();
        frmDelete.setVisible(true);
    }//GEN-LAST:event_ItmDeleteActionPerformed

    private void ItmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAddActionPerformed
       FrmAdd frmAdd = new FrmAdd();
       frmAdd.setVisible(true);
    }//GEN-LAST:event_ItmAddActionPerformed

    private void ItmReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmReviewActionPerformed
       FrmReview frmReview = new FrmReview();
       frmReview.setVisible(true);
    }//GEN-LAST:event_ItmReviewActionPerformed

    private void MnuBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnuBillActionPerformed

    private void ItmGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmGenerateActionPerformed
        FrmGenerate frmGenerate = new FrmGenerate();
        frmGenerate.setVisible(true);
    }//GEN-LAST:event_ItmGenerateActionPerformed

    private void ItmShowProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmShowProductsActionPerformed
        FrmProductData frmProductData = new FrmProductData();
        frmProductData.setVisible(true);
    }//GEN-LAST:event_ItmShowProductsActionPerformed

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
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroceryStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmAdd;
    private javax.swing.JMenuItem ItmBuy;
    private javax.swing.JMenuItem ItmChangePassword;
    private javax.swing.JMenuItem ItmCreate;
    private javax.swing.JMenuItem ItmDelete;
    private javax.swing.JMenuItem ItmGenerate;
    private javax.swing.JMenuItem ItmReview;
    private javax.swing.JMenuItem ItmShowProducts;
    private javax.swing.JMenu MnuBill;
    private javax.swing.JMenu MnuExit;
    private javax.swing.JMenu MnuProduct;
    private javax.swing.JMenu MnuUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
