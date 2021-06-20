/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.view;

import ec.edu.espe.bookstore.model.Book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author steve
 */
public class Archive extends javax.swing.JFrame {

    LinkedList<Book> books = new LinkedList<>();
    /**
     * Creates new form Bookstore
     */
    public Archive() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MaterialTextField = new javax.swing.JTextField();
        EditorialTextField = new javax.swing.JTextField();
        TitleTextField = new javax.swing.JTextField();
        AutorTextField = new javax.swing.JTextField();
        ColorTextField = new javax.swing.JTextField();
        NumberPagesTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Material:");

        jLabel2.setText("Editorial:");

        jLabel3.setText("Title:");

        jLabel4.setText("Autor:");

        jLabel5.setText("Color:");

        jLabel6.setText("Number of Pages:");

        MaterialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialTextFieldActionPerformed(evt);
            }
        });

        EditorialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialTextFieldActionPerformed(evt);
            }
        });

        AutorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Charge");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumberPagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditorialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AutorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(35, 35, 35)
                                .addComponent(jButton3)
                                .addGap(212, 212, 212)
                                .addComponent(jButton1)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MaterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EditorialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AutorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NumberPagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton2)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaterialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaterialTextFieldActionPerformed

    private void EditorialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditorialTextFieldActionPerformed

    private void AutorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Book book = new Book();
        
        book.setMaterial(MaterialTextField.getText());
        book.setEditorial(EditorialTextField.getText());
        book.setTitle(TitleTextField.getText());
        book.setAutor(AutorTextField.getText());
        book.setColor(ColorTextField.getText());
        book.setNumberOfPages(books.size());
        
        books.add(book);
        
        MaterialTextField.setText("");
        EditorialTextField.setText("");
        TitleTextField.setText("");
        AutorTextField.setText("");
        ColorTextField.setText("");
        NumberPagesTextField.setText("");
        
        fillTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser selectionArchive = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archive csv", "csv");
        
        selectionArchive.setFileFilter(filter);
        
        int selection = selectionArchive.showOpenDialog(this);
        
        if(selection == JFileChooser.APPROVE_OPTION){
            File archive = selectionArchive.getSelectedFile();
            saveArchive(archive);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser selectionArchive = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archive csv", "csv");
        
        selectionArchive.setFileFilter(filter);
        
        int selection = selectionArchive.showOpenDialog(this);
        
        if(selection == JFileChooser.APPROVE_OPTION){
            File archive = selectionArchive.getSelectedFile();
            chargeArchive(archive);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void chargeArchive(File archive){
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        
        try {
            fileReader = new FileReader(archive);
            bufferReader = new BufferedReader(fileReader);
            
            String line;
            
            while((line=bufferReader.readLine())!=null){
                
                
                String array [] = line.split(", ");
                if(array.length==6){
                    Book book = new Book(); 
                    book.setMaterial(array[0]);
                    book.setEditorial(array[1]);
                    book.setTitle(array[2]);
                    book.setAutor(array[3]);
                    book.setColor(array[4]);
                    book.setNumberOfPages(Integer.parseInt(array[5]));
                    books.add(book);
                    
                }
            }
            
            fillTable();
            
        }catch(Exception except){
            except.printStackTrace();
        }
        finally{
            try{
                if(fileReader != null){
                    fileReader.close();
                }
            }
            catch(Exception except){
                except.printStackTrace();
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AutorTextField;
    private javax.swing.JTextField ColorTextField;
    private javax.swing.JTextField EditorialTextField;
    private javax.swing.JTextField MaterialTextField;
    private javax.swing.JTextField NumberPagesTextField;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        DefaultTableModel models = new DefaultTableModel (new String[]{"Material","Editorial","Title","Autor","Color","Number of pages"},books.size());
        
        jTable1.setModel(models);
        
        TableModel table = jTable1.getModel();
        
        for(int i = 0; i<books.size();i++){
            Book book = books.get(i);
            table.setValueAt(book.getMaterial(), i, 0);
            table.setValueAt(book.getEditorial(), i, 1);
            table.setValueAt(book.getTitle(), i, 2);
            table.setValueAt(book.getAutor(), i, 3);
            table.setValueAt(book.getColor(), i, 4);
            table.setValueAt(book.getNumberOfPages(), i, 5);
        }
        
    }
    
    private void saveArchive(File archive){
        FileWriter sorter = null;
        PrintWriter printWriter = null;
        
        try{
            sorter = new FileWriter(archive);
            printWriter = new PrintWriter(sorter);
            
            for(Book book: books){
                String line = book.getMaterial()+", "+book.getEditorial()+", "+book.getTitle()+", "+book.getAutor()+", "+book.getColor()+", "+book.getNumberOfPages();
                printWriter.println(line);
            }
        }catch(Exception except){
            except.printStackTrace();
        }
        finally{
            try{
                if(sorter != null){
                    sorter.close();
                }
            }catch(Exception except){
                except.printStackTrace();
            }
        }
    }
}
