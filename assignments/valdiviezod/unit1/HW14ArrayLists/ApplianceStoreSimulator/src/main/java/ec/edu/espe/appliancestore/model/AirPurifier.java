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
public class AirPurifier {
    private float size;
    private int price;
    private int power;
    private int serialnumber;
    
public AirPurifier(){
    this.serialnumber = 0;
    this.price = (int) 0.0F;
    this.size = 0;
    this.power = 0;
    
}

@Override
    public String toString() {
        return "Iron(" + "serialnumber -> " + serialnumber + " price ->" + 
                price + " power -> " + power + " revolutions" + " size -> " + size + "compact" ;
                }

public AirPurifier(int serialnumber,float size,int price,int power){
    this.serialnumber = serialnumber;
    this.price = price;
    this.size = size;
    this.power = power;
}
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void instock(){
        
    }
    public Gain generateprofit(){
        return new Gain();
    }
   
}
