/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.menu.view;

/**
 *
 * @author Darwin
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
        MnExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MnCreate = new javax.swing.JMenuItem();
        MnChangePassword = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MnuExit.setText("Exit");
        MnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuExitActionPerformed(evt);
            }
        });

        MnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        MnExit.setText("Exit");
        MnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnExitActionPerformed(evt);
            }
        });
        MnuExit.add(MnExit);

        jMenuBar1.add(MnuExit);

        jMenu1.setText("Users");

        MnCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MnCreate.setText("Create");
        MnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCreateActionPerformed(evt);
            }
        });
        jMenu1.add(MnCreate);

        MnChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        MnChangePassword.setText("Change Password");
        MnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnChangePasswordActionPerformed(evt);
            }
        });
        jMenu1.add(MnChangePassword);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Product");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Buy");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Add");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Delete");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Bill");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Generate");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Review");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCreateActionPerformed
    FrmCreateUser add = new FrmCreateUser();
        add.setVisible(true);
        dispose();
    }//GEN-LAST:event_MnCreateActionPerformed

    private void MnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuExitActionPerformed
    
    }//GEN-LAST:event_MnuExitActionPerformed

    private void MnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnExitActionPerformed
    dispose();
    }//GEN-LAST:event_MnExitActionPerformed

    private void MnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnChangePasswordActionPerformed
    FrmChangePw add = new FrmChangePw();
       add.setVisible(true);
       dispose();
    }//GEN-LAST:event_MnChangePasswordActionPerformed

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
    private javax.swing.JMenuItem MnChangePassword;
    private javax.swing.JMenuItem MnCreate;
    private javax.swing.JMenuItem MnExit;
    private javax.swing.JMenu MnuExit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
