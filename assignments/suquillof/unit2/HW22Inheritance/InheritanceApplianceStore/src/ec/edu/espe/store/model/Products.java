/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public abstract class Products {
    
    private int id;
    private float price;
    private String model;
    private float size;
    private float weight;
    private String material;

    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", price=" + price + ", model=" + model + ", size=" + size + ", weight=" + weight + ", material=" + material + '}';
    }

    public Products(int id, float price, String model, float size, float weight, String material) {
        this.id = id;
        this.price = price;
        this.model = model;
        this.size = size;
        this.weight = weight;
        this.material = material;
    }
    
    public Products(){
        
        id = 0;
        price = 0;
        model = "";
        size = 0.0F;
        weight = 0.0F;
        material = "";
        
    }
    
    public abstract void buy(int amount);
    public abstract void sell(int amount);
    public abstract void toStock();
    public abstract Gain generateprofit();

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
    
}
