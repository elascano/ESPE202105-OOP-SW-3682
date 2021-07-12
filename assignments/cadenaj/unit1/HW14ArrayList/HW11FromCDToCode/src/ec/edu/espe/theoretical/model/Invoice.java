/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author jejoc
 */
public class Invoice {
    private float ruc;
    private String data;
    private String address;
    private String name;
    private float ID;
    private float date;
    
    public int m(Product product){
        return 1;
    }
    
    public float valueWithoutTaxes(){
        return 0;
    }
    public float calculateTaxes(){
        return 0;
    }
    public float totalValue(){
        return 0;
    }
  
}
