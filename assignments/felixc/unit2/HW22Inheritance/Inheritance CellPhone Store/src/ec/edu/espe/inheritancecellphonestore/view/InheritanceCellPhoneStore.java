/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritancecellphonestore.view;

import ec.edu.espe.inheritancecellphonestore.model.CellPhone;
import ec.edu.espe.inheritancecellphonestore.model.Charger;
import ec.edu.espe.inheritancecellphonestore.model.HeadPhone;
import ec.edu.espe.inheritancecellphonestore.model.PhoneCase;
import ec.edu.espe.inheritancecellphonestore.model.ScreenProtector;
import ec.edu.espe.inheritancecellphonestore.model.Warehouse;

/**
 *
 * @author 59399
 */
public class InheritanceCellPhoneStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Warehouse warehouse = new CellPhone("null", "null", "null", 0, 0.0F);
    warehouse = new CellPhone("Red", "Sony", "Premium", 1725, 320.25F);
    System.out.println("CellPhone ->" + warehouse);
    warehouse = new Charger("White", "C type", "Samsung", 2341, 15.5F);
    System.out.println("Charger ->" + warehouse);
    warehouse = new HeadPhone("Blue", "Beats", 1978, 150.30F);
    System.out.println("HeadPhone ->" + warehouse);
    warehouse = new PhoneCase("Pink", "Redmi note 8", "Xiaomi", "Plastic", 2563, 9.99F);
    System.out.println("PhoneCase ->" + warehouse);
    warehouse = new ScreenProtector("Tempered Glass", "Redmi note 8", 1973, 4.99F);
    System.out.println("ScreenProtectos ->" + warehouse);    
    }
    
}
