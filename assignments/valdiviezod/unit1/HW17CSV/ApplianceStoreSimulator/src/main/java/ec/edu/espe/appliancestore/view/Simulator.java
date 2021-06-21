/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import java.util.ArrayList;
import java.util.Scanner;

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
        
       int selection;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the system Appliance Store \n");
        System.out.println("");
        System.out.println("1-> Enter data to csv");
        System.out.println("2-> read data from CSV"); 
        selection=sc.nextInt();
        
        if (selection==1){
        System.out.println("Enter data to csv");
              
                            
        System.out.println("Ingrese el numero de serie :");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio :");
        price=sc.nextFloat();
        System.out.println("Ingrese las velocidades :");
        velocity=sc.nextInt();
        System.out.println("Ingrese las capacidad :");
        ability=sc.nextInt();
        
        Iron iron = new Iron();
        System.out.println("Iron object -> " + iron);
        
        iron = new Iron(serialnumber,price,velocity,ability);
        System.out.println("Iron object -> " + iron);
                   
        irons.add(iron);
               
        System.out.println("Irons -> " + irons + "\n");
        
        ironsArray[0] = iron;
        CsvWriter csvWriter = new CsvWriter("Iron.csv");
        for (Iron ironArray : irons){
            String [] date = iron.getArray();
            csvWriter.writeRecord(date);
        }
        csvWriter.close();
        }else{
        if (selection==2){
        System.out.println("read data from CSV"); 
        CsvReader csvReader = new CsvReader("Iron.csv");
        csvReader.readHeaders();
        while(csvReader.readRecord()) {
                String date = csvReader.get(0);
                       
                }
        csvReader.close();
        for(Iron ironArray : irons) {
                System.out.println(ironArray.getSerialnumber() + " , "
                    + ironArray.getPrice() +" , "
                    +ironArray.getVelocity() + "," +ironArray.getAbility());
            }
        }  
        }      
        
        
    }

    private static class Iron {

        public Iron() {
        }

        private Iron(int serialnumber, float price, int velocity, int ability) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String[] getArray() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getVelocity() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getPrice() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getSerialnumber() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getAbility() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
}