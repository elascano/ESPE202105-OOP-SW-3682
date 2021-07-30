/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.controller;

import ec.edu.espe.store.model.Iron;
import ec.edu.espe.store.model.Product;
import ec.edu.espe.store.view.FrmProduct;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class IronController {
    private Product product;
    private FrmProduct frmProduct;
    private ArrayList<Iron> irons;
    
    public void addProduct(Product product){
        //TODO read products (list) from database
        //TODO add products to database
        //using the utils class
    }
    
    public ArrayList<Product> readProducts(){
        ArrayList<Product> products = new ArrayList<>();
        //TODO read products from database
        //TODO use utils class
        Product product = new Product("Plancha","30.00","Muy buena","1111","Plancha económica","Hamilton",Date.valueOf(LocalDate.MAX), 0);
        products.add(product);
        product = new Product("Plancha","40.00","Muy buena","2222","Plancha económica","Samsung",Date.valueOf(LocalDate.MAX), 0);
        products.add(product);
        return products;
    }
    
    ArrayList<Product> findProduct(String productName){
        ArrayList<Product> products = new ArrayList<>();
        
        //TODO find in data base
        Product product = new Product("Plancha","30.00","Muy buena","1111","Plancha económica","Hamilton",Date.valueOf(LocalDate.MAX), 0);
        products.add(product);
        return products;
    }
   
    // Product findProduct(String id);
    boolean removeProduct(String fullProduct){
        //TODO FindProduct(fullProduct)
        //TODO verify what product to remove
        return true;
    }
    
    
    void updateProduct(String fullProduct, Product product){
        //TODO update the contact in the database
    }
    
    public IronController(Product product, FrmProduct frmProduct, ArrayList<Iron> irons) {
        this.product = product;
        this.frmProduct = frmProduct;
        this.irons = irons;
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
     * @return the frmProduct
     */
    public FrmProduct getFrmProduct() {
        return frmProduct;
    }

    /**
     * @param frmProduct the frmProduct to set
     */
    public void setFrmProduct(FrmProduct frmProduct) {
        this.frmProduct = frmProduct;
    }

    /**
     * @return the irons
     */
    public ArrayList<Iron> getIrons() {
        return irons;
    }

    /**
     * @param irons the irons to set
     */
    public void setIrons(ArrayList<Iron> irons) {
        this.irons = irons;
    }
    
    
}
