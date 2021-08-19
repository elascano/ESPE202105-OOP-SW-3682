/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamedgui.controller;

import ec.edu.espe.sanamedgui.model.*;
import ec.edu.espe.sanamedgui.view.FrmMedicalProduct;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class ControllerSanamed {
    private Product product;
    private FrmMedicalProduct frmContact;
    private ArrayList<Modification> modifications;

    public ControllerSanamed(Product product, FrmMedicalProduct frmContact, ArrayList<Modification> modifications) {
        this.product = product;
        this.frmContact = frmContact;
        this.modifications = modifications;
    }
    public void addProduct(Product product){
    
    }
    
    public ArrayList<Product> readProduct(){
    ArrayList<Product> products = new ArrayList<>();
    return products;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the frmContact
     */
    public FrmMedicalProduct getFrmContact() {
        return frmContact;
    }

    /**
     * @param frmContact the frmContact to set
     */
    public void setFrmContact(FrmMedicalProduct frmContact) {
        this.frmContact = frmContact;
    }

    /**
     * @return the modifications
     */
    public ArrayList<Modification> getModifications() {
        return modifications;
    }

    /**
     * @param modifications the modifications to set
     */
    public void setModifications(ArrayList<Modification> modifications) {
        this.modifications = modifications;
    }
    
}
