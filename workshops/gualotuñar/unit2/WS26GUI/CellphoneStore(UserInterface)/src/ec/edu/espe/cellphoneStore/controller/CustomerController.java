/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphoneStore.controller;

import ec.edu.espe.cellphoneStore.model.CellphoneSaleNote;
import ec.edu.espe.cellphoneStore.model.Customer;
import ec.edu.espe.cellphoneStore.view.FrmCustomer;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class CustomerController {
    private Customer customer;
    private FrmCustomer frmCustomer = new FrmCustomer();
    private ArrayList<CellphoneSaleNote> cellphoneSaleNote;
//    private DBManager dbManager = new BDManager();
    
    
    
    public void addCustomer(Customer customer){
       //TODO read costumer (list) from data base
       //TODO add customer to database
       //using the utils class
    
    }

    public ArrayList<Customer> readCustomers(){
        ArrayList<Customer> customers = new ArrayList<>();
        //TODO read customers from database
        //TODO usea the utils class
      //  Customer customer = new Customer("Richard", "1725262370", "richardga588@gmail.com", "0994311439", "male", "Sangolqui", LocalDateTime purchaseDate, 0);
      //  customers.add(customer);
        return customers;

    }
    
    
    
    
    public CustomerController(Customer customer, FrmCustomer frmCustomer, ArrayList<CellphoneSaleNote> cellphoneSaleNote) {
        this.customer = customer;
        this.cellphoneSaleNote = cellphoneSaleNote;
        this.frmCustomer = frmCustomer;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the frmCustomer
     */
    public FrmCustomer getFrmCustomer() {
        return frmCustomer;
    }

    /**
     * @param frmCustomer the frmCustomer to set
     */
    public void setFrmCustomer(FrmCustomer frmCustomer) {
        this.frmCustomer = frmCustomer;
    }

    /**
     * @return the cellphoneSaleNote
     */
    public ArrayList<CellphoneSaleNote> getCellphoneSaleNote() {
        return cellphoneSaleNote;
    }

    /**
     * @param cellphoneSaleNote the cellphoneSaleNote to set
     */
    public void setCellphoneSaleNote(ArrayList<CellphoneSaleNote> cellphoneSaleNote) {
        this.cellphoneSaleNote = cellphoneSaleNote;
    }

  
}
