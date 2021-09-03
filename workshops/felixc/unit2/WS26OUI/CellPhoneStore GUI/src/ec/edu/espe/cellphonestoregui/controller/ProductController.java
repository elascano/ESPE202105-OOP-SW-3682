/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestoregui.controller;

import ec.edu.espe.cellphonestoregui.model.Category;
import ec.edu.espe.cellphonestoregui.model.Product;
import ec.edu.espe.cellphonestoregui.view.FrmProduct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author 59399
 */
public class ProductController {
    private Product product;
    private ArrayList<Category> category;
    private FrmProduct frmProduct;
    private Persistence dataManager = new DBManager();

    public void addProduct(Product product){
        //TODO read contacts from database
        //TODO add contact to database
        //using the utils class 
        String productJson="{}";
        dataManager.crete(productJson, "products");
    }
    
    public ArrayList <Product> readProducts(){
        ArrayList <Product> products = new ArrayList<>();
        //TODO read products from database
        //TODO use the utils class
        Product product = new Product("Xiaomi", "Redmi Note 8 ", "X123", "330.45", "Too much batery and velocity", "Blue","123", LocalDateTime.MIN, 0);
        products.add(product);
        product = new Product("Samsung", "Galaxy S10", "S126", "250.50", "Elegant Model", "Black","126", LocalDateTime.MIN, 0);
        products.add(product);
        return products;
    }
    
    ArrayList<Product>findProduct(String id){
        ArrayList<Product> products = new ArrayList<>();
        //TODO find
        //TODO call our utils class to find the product in the database}
        Product product = new Product ("Xiaomi", "Redmi Note 8 ", "X123", "330.45", "Too much batery and velocity", "Blue","123", LocalDateTime.MIN, 0);
        products.add(product);
        return products;
    }
    
    boolean removeProduct(String id){
    return true;
    }
    
   void updateProduct(String id,Product product){
        
    }
    
   
    
    public ProductController(Product product, ArrayList<Category> category, FrmProduct frmProduct) {
        this.product = product;
        this.category = category;
        this.frmProduct = frmProduct;
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
     * @return the category
     */
    public ArrayList<Category> getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(ArrayList<Category> category) {
        this.category = category;
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



}
