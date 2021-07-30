/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.controller;

import ec.edu.espe.bookstore.model.Book;
import ec.edu.espe.bookstore.model.Invoice;
import ec.edu.espe.bookstore.view.FrmInvoice;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class InvoiceController {
    private Invoice invoice;
    private FrmInvoice frmInvoice;
    private ArrayList<Book> books;
    private Persistence dataManager = new DBManager();

    public void addData(Invoice invoice){
        //TODO read contacts from datebase
        //TODO add contact to datebase
        //using the utils class
        
        //TODO  invoice object to JSON
        //TODO contact sent to datebasa
        String invoiceJson = "{}";
        dataManager.create(invoiceJson, "invoices");
    }
    
    public ArrayList<Invoice> readInvoices(){
        ArrayList<Invoice> invoices = new ArrayList<>();
        //TODO read DataInvoice from datebase
        //TODO use the utils class
        Invoice invoice = new Invoice("Steven", "Achig", "12345", "0998476747", "sjachig1@espe.edu.ec", "Hspt Enrique Garces", "new", "RUC", getBooks(), LocalDateTime.MIN, 0);
        
        invoices.add(invoice);
        invoice = new Invoice("Steven", "Achig", "12345", "0998476747", "sjachig1@espe.edu.ec", "Hspt Enrique Garces", "new", "RUC", getBooks(), LocalDateTime.MIN, 0);
        invoices.add(invoice);
        
        return invoices;
    }
    
    ArrayList<Invoice> findInvoice(String LastName){
        ArrayList<Invoice> invoices = new ArrayList<>();
        
        //TODO find in database
        //TODO call our utils class to find the invoice in the database
        Invoice invoice = new Invoice("Steven", "Achig", "12345", "0998476747", "sjachig1@espe.edu.ec", "Hspt Enrique Garces", "new", "RUC", getBooks(), LocalDateTime.MIN, 0);
        invoices.add(invoice);
        return invoices;
    }
    //DataInvoice findDataInvoice(String id);
    
    boolean removeInvoice(String fullName){
        //TODO findContact(fullName)
        //TODO verify what invoice to remove
        return true;
    }
    
    void updateInvoice(String fullName, Invoice dataInvoice){
        //TODO update the contact in the database
    }

    public InvoiceController(Invoice invoice, FrmInvoice frmInvoice, ArrayList<Book> books) {
        this.invoice = invoice;
        this.frmInvoice = frmInvoice;
        this.books = books;
    }
    
    /**
     * @return the invoice
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /**
     * @return the frmInvoice
     */
    public FrmInvoice getFrmInvoice() {
        return frmInvoice;
    }

    /**
     * @param frmInvoice the frmInvoice to set
     */
    public void setFrmInvoice(FrmInvoice frmInvoice) {
        this.frmInvoice = frmInvoice;
    }

    /**
     * @return the books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
