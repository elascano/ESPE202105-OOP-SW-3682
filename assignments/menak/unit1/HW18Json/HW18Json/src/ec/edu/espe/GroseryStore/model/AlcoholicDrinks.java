/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroseryStore.model;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class AlcoholicDrinks {
    
    
    private String type;
    private String brand;
    private int amountproducts;
    private float price;
    
    
    public AlcoholicDrinks(String id, float parseFloat, float parseFloat0, String color, float parseFloat1, String model) {
       //To change body of generated methods, choose Tools | Templates.
    }

    public AlcoholicDrinks( AlcoholicDrinks type, AlcoholicDrinks brand, AlcoholicDrinks amountofproducts, AlcoholicDrinks price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public String toString() {
        return "AlcoholicDrinks{" + "type=" + getType() + ", brand=" + getBrand() + ", amountproducts=" + getAmountproducts() + ", price=" + getPrice() + '}';
    }

    
    public AlcoholicDrinks(String type, String brand, int amountproducts ,float price ) {
        this.type = type;
        this.brand = brand;
        this.amountproducts = amountproducts;
        this.price = price;
    }
    
    public AlcoholicDrinks() {
        this.type = "no type";
        this.brand = "no brand"; 
        this.amountproducts=0;
        this.price=0;
    }
    
    public String []getArray(){
        
       String[] date ={"Type -> " + String.valueOf(type)+ " Brand ->" +String.valueOf(brand)+ " Amountproducts -> "+String.valueOf(amountproducts)+" Price -> "+String.valueOf(price)};
       return date;
    }
    
    
    
    
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the amountproducts
     */
    public int getAmountproducts() {
        return amountproducts;
    }

    /**
     * @param amountproducts the amountproducts to set
     */
    public void setAmountproducts(int amountproducts) {
        this.amountproducts = amountproducts;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
 
    public void buy()
    {}

    public void add(AlcoholicDrinks alcoholicDrinks2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
