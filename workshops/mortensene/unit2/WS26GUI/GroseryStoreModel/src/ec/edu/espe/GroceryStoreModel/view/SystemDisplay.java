/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreModel.view;

 



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import ec.edu.espe.groseryStoreModel.model.*;

import static ec.edu.espe.untils.Functions.Export;
import static ec.edu.espe.untils.Functions.UseInventory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

import java.util.Scanner;
import java.util.Set;
import utils.Functions;

/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class SystemDisplay {

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        float price;
        float seasonDiscount;
        int opcion; //Guardaremos la opcion del usuario
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
         System.out.println("Prueba conexión MongoDB");
        MongoClient mongo = null;
        try {
            mongo = new MongoClient("localhost", 27017);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
 
        if (mongo != null) {
 
            //Si no existe la base de datos la crea
            DB db = mongo.getDB("Costumers");
 
            //Crea una tabla si no existe y agrega datos
            DBCollection table = db.getCollection("Costumers");
 
            //Crea los objectos básicos
            BasicDBObject document1 = new BasicDBObject();
            document1.put("Name", "Jose");
            document1.put("Last Name", "Lopez Perez");
            document1.put("Age", 45);
            document1.put("Date", new Date());
 
            BasicDBObject document2 = new BasicDBObject();
            document2.put("Name", "Maria");
            document2.put("Last Name", "Martinez Aguilar");
            document2.put("Age", 35);
            document2.put("date", new Date());
 
            BasicDBObject document3 = new BasicDBObject();
            document3.put("Name", "Juan");
            document3.put("Last Name", "Navarro Robles");
            document3.put("Age", 25);
            document3.put("Date", new Date());
 
            
            //Insertar tablas
            table.insert(document1);
            table.insert(document2);
            table.insert(document3);
              
            //Delete all they have name Maria"
            table.remove(new BasicDBObject().append("Name", "Maria"));
 
            //to List Costumer Table
            System.out.println("List Costumer Table: ");
            DBCursor cur = table.find();
            while (cur.hasNext()) {
                System.out.println(" - " + cur.next().get("Name") + " " + cur.curr().get("Last Name") + " -- " + cur.curr().get("Age") + " Years (" + cur.curr().get("Date") + ")");
            }
            System.out.println();
 
            //Data base List 
            System.out.println(" List Data base: ");
            List DataBase = mongo.getDatabaseNames();
            for (Object DataBaseName : DataBase) {
                System.out.println(" - " + DataBaseName);
            }
            System.out.println();
            
                       
            //Borrar base de datos
          
 
        } else {
            System.out.println("Error: Conexión no establecida");
        }
            
        while (!exit) {
            
            System.out.println("PRESS 1:VIEW INVENTORY");
            System.out.println("PRESS 2:VIEW IVA");
            System.out.println("PRESS 3: VIEW TOTAL PRICE");
            System.out.println("PRESS 4: VIEW SEASON DISCOUNTS");
            System.out.println("PRESS 5: VIEW TOTAL PRICE WITH SEASON DISCOUNTS");
            System.out.println("PRESS 6: VIEW TOTAL PRICE WITH STUFF DISCOUNTS");
            System.out.println("PRESS 11: EXIT"); 
            
            try {
                
            System.out.println("Choose one option");
            opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        checkInventory();
                        break;
                    case 2:
                        System.out.println("Enter the price");
                        price = sn.nextFloat();       
                        float total;
                        total= Functions.computeIva(price);
                        System.out.println("total "+total);
                        break;
                    case 3:
                        System.out.println("Enter the price");
                        price = sn.nextFloat();       
                        total= Functions.computeTotalprice(price);
                        System.out.println("total "+total);
                        break;
                    case 4:
                        System.out.println("Enter the price");
                        price = sn.nextFloat();
                        System.out.println("Enter the discount");
                        seasonDiscount=sn.nextFloat();
                        total= Functions.computeSeasonDiscount(price,seasonDiscount);                          
                        System.out.println("total "+total);                         
                        break;
                    case 5:
                        System.out.println("Enter the price");
                        price = sn.nextFloat();
                        System.out.println("Enter the discount");
                        seasonDiscount=sn.nextFloat();
                        total= Functions.computeTotalPriceWithSeasonDiscount(price, seasonDiscount);
                        System.out.println("total "+total);    
                        break;
                    case 6:
                        System.out.println("Enter the price");
                        price = sn.nextFloat();
                        total= Functions.computeDiscountUsed(price);
                        System.out.println("total employee discount "+total);
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        System.out.println("THANK YOU FOR USING OUR STORE, HAVE A NICE DAY!!");
                        exit = true;
                        break;  
                    default:
                        System.out.println("you haven´t choosed any option, please try again");
                }
            } catch (InputMismatchException e) {
                sn.next();
            }
        }

        Export();
        
    }
    public static void checkInventory(){
        
    Inventory inventory = new AlcoholicDrinks(0231, (float) 15.98, "Wine" , "Gato" );
    ArrayList <Inventory> inventories= new ArrayList<>();
     System.out.println("inventory "+inventory);
    inventories.add(inventory);
     
    inventory = new AlcoholicDrinks(0233, (float) 15.98, "Beer" , "Pilsener");
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
     
    inventory = new  Appetizers((float)2.2, 0235 , (float) 2.00, "Snacks" , "Rufles" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
  
    System.out.println("inventory "+inventory);
      inventory = new  Cereals((float)1.4, 0236 , (float) 3.00, "Cereal" , "Get Fit" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
     inventory = new  Confectionery(0237 , (float) 3.00, "Chocolate" , "Ferrero" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
     inventory = new  DairyAndEggs(0, (float) 1.5,0127, (float) 1.00, "Milk" , "Vita leche carton" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
     inventory = new  Drinks((float)3.00, 0244 , (float) 3.25, "Soda" , "Coca Cola" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
       inventory = new  Drinks((float)3.00, 0244 , (float) 3.25, "Soda" , "Coca Cola" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
    inventory = new  FishAndSeafood ((float)1.00, 0267, (float) 6.25, "Fish" , "Mr Fish Corvina" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
     
     inventory = new  Frozen ((float)1.00, 0225, (float) 4.35, "Ice Cream" , "Pinguino" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
    inventory = new FruitsAndVegetables ((float)1.00, 0667, (float) 2.00, "Fruits" , "Platanos" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
     inventory = new Jams ((float)2.00, 0555, (float) 2.00, "Jams" , "Doña Abuela" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
     inventory = new Meats((float)4.00, 0275, (float) 4.44, "Meat" , "Mr Chancho" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
      inventory = new NutsandSeeds((float)5.00, 0266, (float) 4.44, "Nuts" , "nueces de don jose" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
      inventory = new Oils((float)2.00, 001, (float) 4.24, "Oils" , "Girasol" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
    inventory = new Pasta((float)3.00, 0045, (float) 2.44, "Pata" , "Don Vitorio" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
     inventory = new Sauces((float)1.00, 0216, (float) 1.00, "Sauces" , "La A Cena" );
    inventories.add(inventory);
    System.out.println("inventory "+inventory);
    
    System.out.println("inventory "+inventories);
 
    }
    
}
    



