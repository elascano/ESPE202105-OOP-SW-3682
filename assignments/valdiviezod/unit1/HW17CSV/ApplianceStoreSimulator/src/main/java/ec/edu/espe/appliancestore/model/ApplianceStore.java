/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;
import java.util.ArrayList;
/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class ApplianceStore {
    private int serialnumber;
    ArrayList < AirPurifier> airpurifier = new ArrayList <> ();
    ArrayList < ElectricLawnMower> electriclawnmower = new ArrayList <> ();
    ArrayList < Iron> iron = new ArrayList <> ();
    ArrayList < ToastedSandwichMaker> toastedsandwichmaker = new ArrayList <> ();

public AirPurifier add(AirPurifier airpurifier){
    return new AirPurifier();
}
public ElectricLawnMower add(ElectricLawnMower electriclawnmower){
    return new ElectricLawnMower();
}
public Iron add(Iron iron){
    return new Iron();
}
public ToastedSandwichMaker add(ToastedSandwichMaker toastedsandwichmaker){
    return new ToastedSandwichMaker();
}
public int remove(int serialnumber){
    return 0;          
}   
}
