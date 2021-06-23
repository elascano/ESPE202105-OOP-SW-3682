/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.view;

import com.csvreader.CsvWriter;
import ec.edu.espe.sanamed.model.Product;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
public class Sanamed {
    public static void main(String[] args) {
        
        ArrayList<Product>products = new ArrayList<Product>();
      
        
        //tipe="shampoo";
        //brand="Pantene";
        //amount=1;
        //price=6.99F;
        //inStock=true;
        
        
                
       
        //Product product = new Product();
       
        
        //product = new Product(tipe, brand, amount, price, inStock);
        
        
        //Product product2 = new Product("vitamin c", "MK", 5, 3.45F, true);
        
        //Product product3 = new Product("body cream", "Nivea", 1, 3.99F, true);
        
        products.add(new Product("shampoo","pantene"));
        //products.add(product2);
        //products.add(product3);
        ExportCSV(products);
        //System.out.println("products ->  " +  products);
        
        
                
        /*productsArray[0] = product;
        productsArray[1] = product2;
        productsArray[2] = product3;
        for(int i=0;i<3;i++){
           // System.out.println("productsArray -> " +  productsArray[i]);
            //System.out.println("\n");*/
        }
       public static void ExportCSV(List<Product>products){
        String createFile = "Products.cvs";
        boolean existsFile = new File(createFile).exists();
        if(existsFile){
            File fileProducts = new File(createFile);
            fileProducts.delete();
            
        }
        
        try{
            CsvWriter fileCSV = new CsvWriter(new FileWriter(createFile,true),',');
            
           fileCSV.write("tipe");
           fileCSV.write("brand");
           
           fileCSV.endRecord();
           
           for(Product product:products){
               fileCSV.write(product.getTipe());
               fileCSV.write(product.getBrand());
               //fileCSV.write(product.getAmount());
               //fileCSV.write(product.getPrice());
               //fileCSV.write(product.isInStock());
               
               fileCSV.endRecord();
           }
           
        }catch(IOException e){
            e.printStackTrace();
        }
    }     
        
 }
    
    

