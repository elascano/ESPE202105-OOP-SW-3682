/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
class Iron {
    private float size;
    private int price;
    private String model;
    private String material;
    private int power;
    private int serialnumber;
    
    public Iron(){
        this.serialnumber = 0;
        this.price = (int) 0.0F;
        this.size = 0;
        this.power = 0;
        }
    
    public Iron(int serialnumber,int price,float size , int power ){
        this.serialnumber = serialnumber;
        this.price = price;
        this.size = size;
        this.power = power;
        
    }
    
    @Override
    public String toString() {
        return "Blender(" + "serialnumber -> " + serialnumber + " price ->" + 
                price + " size -> " + size + " compact" + " power->" + power + " revolution" ;
                }
    public String [] getArray(){
        String[] date = {"serialnumber -> " + String.valueOf(serialnumber)+ " price ->" +String.valueOf(price)+ " power -> "+String.valueOf(power)+" revolutions "+" size-> "+String.valueOf(size)+ " compact"};
     return date;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
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