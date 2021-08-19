/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cliente.controller;

import ec.edu.espe.cliente.model.Client;
import ec.edu.espe.cliente.model.ClientDAO;
import ec.edu.espe.cliente.view.ClientFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lizbeth Cajas
 */
public class ClientController implements ActionListener {

    ClientDAO objetoDAO = new ClientDAO();
    Client objetoClient = new Client();
    ClientFrm vista = new ClientFrm();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ClientController(ClientFrm v){
        this.vista=v;
        this.vista.btnAdd.addActionListener(this);
        //this.vista.btnList.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnAdd){
            addClient();
        }
    }
    
    public void addClient(){
        objetoClient.setId(vista.txtId.getText());
        objetoClient.setName(vista.txtName.getText());
        objetoClient.setAge(Integer.parseInt(vista.txtAge.getText()));
        objetoDAO.insertClient(objetoClient);
        
    }
    
}
