/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ComputersSystem.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class ComputersSystem {

    private static MongoClient createConection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String Manufacturer;
    String Model;
    int id;
    
 
    
        public static void addComputer(String Manufacturer, String model, int id ){
        MongoClient conection = createConection();
        DB db = conection.getDB("Computer");
        DBCollection colection = db.getCollection("Computer System");
        BasicDBObject document = new BasicDBObject();
        document.put("Id",id);
        document.put("Manufacturer",Manufacturer);
        document.put("Model",model);
      
        
        colection.insert(document);
    }
    
    public static void deleteComputer(int id){
        MongoClient conection = createConection();
        DB db = conection.getDB("Computer");
        DBCollection collection = db.getCollection("Computers System");
        collection.remove(new BasicDBObject().append("Id", id));
    }
    
    public static void showColection(){
        MongoClient conection = createConection();
        DB db = conection.getDB("Computer");
        DBCollection collection = db.getCollection("Computers System");
        DBCursor cursor = collection.find();
        while(cursor.hasNext()){
            System.out.println("* " + cursor.next().get("Brand") + " - " + cursor.curr().get("Model"));
        }
    }
    
    
    
    
    }
    

