/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speakers.model;

import com.mongodb.BasicDBObject;
import java.util.ArrayList;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Speaker {
    private String id;
    private String power;
    private String price;
    private String manofacturer;
    private String model;
    private String bluetooth;
    

    public Speaker(String power, String price, String manofacturer, String model, String bluetooth,String id) {
        this.power = power;
        this.id = id;
        this.price = price;
        this.manofacturer = manofacturer;
        this.model = model;
        this.bluetooth = bluetooth;
    }
    
    public Speaker(BasicDBObject object){
        id= object.getString("id");
        price = object.getString("price");
        power = object.getString("power");
        model = object.getString("model");
        manofacturer = object.getString("brand");
        bluetooth = object.getString("bluethooth");
    }

    @Override
    public String toString() {
        return "Speaker{" + "id=" + getId() + ", power=" + getPower() + ", price=" + getPrice() + ", manofacturer=" + getManofacturer() + ", model=" + getModel() + ", bluetooth=" + getBluetooth() + '}';
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the power
     */
    public String getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the manofacturer
     */
    public String getManofacturer() {
        return manofacturer;
    }

    /**
     * @param manofacturer the manofacturer to set
     */
    public void setManofacturer(String manofacturer) {
        this.manofacturer = manofacturer;
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
     * @return the bluetooth
     */
    public String getBluetooth() {
        return bluetooth;
    }

    /**
     * @param bluetooth the bluetooth to set
     */
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }
    
}
    
    
