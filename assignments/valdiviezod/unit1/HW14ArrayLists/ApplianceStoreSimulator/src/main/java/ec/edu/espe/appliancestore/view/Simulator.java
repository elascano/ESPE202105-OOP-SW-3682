/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import java.util.ArrayList;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Iron>irons=new ArrayList<>();
        Iron ironsArray[] = new Iron[3];
        
        serialnumber = 123456;
        price = 25.5F;
        velocity = 5;
        ability = 3;
        
        Iron iron = new Iron();
        System.out.println("Blender object -> " + iron);
        
        iron = new Iron(serialnumber,price,velocity,ability);
        System.out.println("Blender object -> " + iron);
    
        Iron iron2 = new Iron(135790,23.4F,4,2);
        Iron iron3 = new Iron(172921,27.9F,7,5);
        
        irons.add(iron);
        irons.add(iron2);
        irons.add(iron3);
        
        System.out.println("Blenders -> " + irons + "\n");
        
        ironsArray[0] = iron;
        
        for (Iron ironsArray1 : ironsArray) {
            System.out.print("IronsArray -> " + ironsArray1 + "\n");
        }
						
		    
        
    }  

    private static class Iron {

        public Iron() {
        }

        private Iron(int serialnumber, float price, int velocity, int ability) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    }