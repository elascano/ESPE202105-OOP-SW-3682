/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.controller;

import ec.edu.espe.exam.model.Client;
import ec.edu.espe.exam.model.ClientDAO;
import ec.edu.espe.exam.view.PrincipalFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class ClientController {
    ClientDAO objetoDAO = new ClientDAO();
    Client objetoClient = new Client();
    PrincipalFrm vista = new PrincipalFrm();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ClientController(PrincipalFrm v){
        this.vista=v;
        this.vista.btnStart.addActionListener((ActionListener) this);
        //this.vista.btnList.addActionListener(this);
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnStart){
            addClient();
        }
    }
    
    public void addClient(){
        objetoClient.setPassword(vista.pswPassword.getText());
        objetoClient.setName(vista.txtName.getText());
        objetoDAO.insertClient(objetoClient);
        
    }
}
