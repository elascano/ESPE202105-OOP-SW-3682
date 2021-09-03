/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Karlita
 */
public class Speaker {
    private String id;
    private String price;
    private String power;
    private String model;
    private String brand;
    private String bluethooth;

    public Speaker(String id, String price, String power, String model, String brand, String bluethooth) {
        this.id = id;
        this.price = price;
        this.power = power;
        this.model = model;
        this.brand = brand;
        this.bluethooth = bluethooth;
    }
     public Speaker(BasicDBObject object){
        id= object.getString("id");
        price = object.getString("price");
        power = object.getString("power");
        model = object.getString("model");
        brand = object.getString("brand");
        bluethooth = object.getString("bluethooth");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String isBluetooth() {
        return bluethooth;
    }

    public void setBluetooth(String bluethooth) {
        this.bluethooth = bluethooth;
    }

    
   
    
}
