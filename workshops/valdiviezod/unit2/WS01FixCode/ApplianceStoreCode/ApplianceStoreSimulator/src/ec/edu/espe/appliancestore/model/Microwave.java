/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Microwave {
    private float size;
    private float weight;
    private String material;
    private float price;
    private String model;
    private int serialnumber;

    @Override
    public String toString() {
        return "Microwave(" + "serialnumber -> " + serialnumber + " model ->" + 
                model + " price->" + price + " material->" + material + " size->" + size + " weight->" + weight + "kg" + ")";
                }
    
    public String [] getArray(){
        String[] date = {"serialnumber -> " + String.valueOf(serialnumber)+ " model ->" + model + " price ->" +String.valueOf(price) + " material-> " + material + " size->" + String.valueOf(size) + " weight->" + String.valueOf(weight)};
     return date;
    }

    public Microwave(float size, float weight, String material, float price, String model, int serialnumber) {
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.price = price;
        this.model = model;
        this.serialnumber = serialnumber;
    }
        
    public Microwave(){
        
        size = 0.0F;
        weight = 0.0F;
        material = "";
        price = 0.0F;
        model = "";
        serialnumber = 0;
        
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

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the serialnumber
     */
    public int getSerialnumber() {
        return serialnumber;
    }

    /**
     * @param serialnumber the serialnumber to set
     */
    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }
}
