/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Toaster {
    private int serialnumber;
    private float price;
    private int power;
    private float size;
    private float weight;
    private String material;
    private String model;

    public Toaster(int serialnumber, float price, int power, float size, float weight, String material, String model) {
        this.serialnumber = serialnumber;
        this.price = price;
        this.power = power;
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.model = model;
    }

    public Toaster() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public String toString() {
        return "Toaster{" + "serialnumber=" + serialnumber + ", price=" + price + ", power=" + power + ", size=" + size + ", weight=" + weight + ", material=" + material + ", model=" + model + '}';
    }

    
    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
   
        
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Gain generateprofit(){
    return new Gain();
    
    }
    
}
