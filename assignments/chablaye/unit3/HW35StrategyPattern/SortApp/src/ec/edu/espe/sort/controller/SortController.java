/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sort.controller;

import ec.edu.espe.sort.model.SortDAO;
import ec.edu.espe.sort.view.SortApp;
import ec.edu.espe.sort.view.SortFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class SortController implements ActionListener{
    
    SortDAO objectDAO = new SortDAO();
    SortFrm vista = new SortFrm();
    int data[];

    public SortController(SortFrm v) {
        this.vista=v;
        this.vista.btnAdd.addActionListener(this);
        this.vista.btnOrder.addActionListener(this);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnAdd){
            
            int numero=0;
            numero = Integer.parseInt(vista.txtNumber.getText());
            System.out.println("numero->" +numero);
            objectDAO.addNumber(data, numero);
        }
        if(e.getSource()==vista.btnOrder){
            objectDAO.orderNumbers(data);
        }
    }
    
}
