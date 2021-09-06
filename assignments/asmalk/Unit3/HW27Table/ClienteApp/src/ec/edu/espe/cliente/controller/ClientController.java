/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cliente.controller;

import com.mongodb.DBCursor;
import ec.edu.espe.cliente.model.Client;
import ec.edu.espe.cliente.model.ClientDAO;
import ec.edu.espe.cliente.model.Conexion;
import ec.edu.espe.cliente.view.ClientFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asmal Kevin
 */
public class ClientController implements ActionListener {

    ClientDAO objetoDAO = new ClientDAO();
    Client objetoClient = new Client();
    ClientFrm vista = new ClientFrm();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ClientController(ClientFrm v){
        this.vista=v;
        this.vista.btnAdd.addActionListener(this);
        this.vista.btnList.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnAdd){
            addClient();
        }
        if (e.getSource()==vista.btnList){
            //listar(vista.TableClient);
            ArrayList lista = new ArrayList();
            lista = objetoDAO.mostrarColeccion(vista);
            listar(vista.TableClient, lista);
            //objetoDAO.mostrarColeccion(vista);
        }
    }
    
    public void addClient(){
        objetoClient.setId(vista.txtId.getText());
        objetoClient.setName(vista.txtName.getText());
        //objetoClient.setAge(Integer.parseInt(vista.txtAge.getText()));
        objetoClient.setAge(vista.txtAge.getText());
        objetoDAO.insertClient(objetoClient);
        
    }
    
    public void listar(JTable tabla, ArrayList<Client> listaDatos){
        modelo =(DefaultTableModel) tabla.getModel();
        List<Client> lista = new ArrayList<>();
        //lista = objetoDAO.getClient(objetoClient);
        lista.add(new Client("123", "Esteban", "20"));
        lista.add(new Client("613", "Marco", "12"));
        //lista.add(new Client(objetoClient.getId(), objetoClient.getName(), objetoClient.getAge()));
        
        
        Object [] objeto = new Object[3];
        for(int i=0; i<lista.size(); i++)
        {
            objeto[0] = listaDatos.get(i).getId();
            objeto[1] = listaDatos.get(i).getName();
            objeto[2] = listaDatos.get(i).getAge();
            modelo.addRow(objeto);
        }
    }
    
}
