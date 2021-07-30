/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Sanamed.controller;

import ec.edu.espe.Sanamed.view.FrmClientData;
import ec.edu.espe.SanamedAccountSystem.model.Bill;
import ec.edu.espe.SanamedAccountSystem.model.Client;
import ec.edu.espe.SanamedAccountSystem.model.ShoppingList;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class BillController {
    private Bill bill;
    private FrmClientData FrmBill;
    private Client client;
    private ShoppingList list;

    //TODO read contacts form database
    //TODO add contact to database
    //TODO the utils class
    
    //TODO find in database
    //TODO 
    
    public BillController() {
    }

    public BillController(Bill bill, FrmClientData FrmBill, Client client, ShoppingList list) {
        this.bill = bill;
        this.FrmBill = FrmBill;
        this.client = client;
        this.list = list;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public FrmClientData getFrmBill() {
        return FrmBill;
    }

    public void setFrmBill(FrmClientData FrmBill) {
        this.FrmBill = FrmBill;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ShoppingList getList() {
        return list;
    }

    public void setList(ShoppingList list) {
        this.list = list;
    }
    
    
}
