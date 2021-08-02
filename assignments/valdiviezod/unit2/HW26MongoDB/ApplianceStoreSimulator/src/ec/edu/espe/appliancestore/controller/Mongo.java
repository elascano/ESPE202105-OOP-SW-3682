/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import ec.edu.espe.appliancestore.model.Blender;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class Mongo {
    public static void writeBlenderMongo(){
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList();
        Blender blendersArray[] = new Blender[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data Blender");
        MongoClient mongo = createConnection();
        if(mongo != null){
            DB db = mongo.getDB("ApplianceStore");                          
        System.out.println("Ingrese el numero de serie :");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio :");
        price=sc.nextFloat();
        System.out.println("Ingrese las velocidades :");
        velocity=sc.nextInt();
        System.out.println("Ingrese las capacidad :");
        ability=sc.nextInt();
        insertBlender(db,"Product",serialnumber,price,velocity,ability);
                
        }
    }

     public static MongoClient createConnection(){
     MongoClient mongo = null;
     mongo = new MongoClient("localhost",27017);
     return mongo;
    }
     public static void insertBlender(DB db , String collection ,int serialnumber,float price,int velocity , int ability){
       DBCollection colec = db.getCollection("Products");
        BasicDBObject document = new BasicDBObject();
        document.put("serialnumber", serialnumber);
        document.put("price",price);
        document.put("velocity",velocity);
        document.put("ability",ability);
        
        
        colec.insert(document);
    } 
     
   public static void readBlenderMongo(){
       MongoClient mongo = createConnection();
        if(mongo != null){
            System.out.println("Products");
            DB db = mongo.getDB("ApplianceStore");
            showCollection(db,"Product");
   }
   }
    public static void showCollection(DB db,String collection){
        DBCollection colec = db.getCollection("Products");
        DBCursor cursor = colec.find();
        
        while(cursor.hasNext()){
            System.out.println("* SerialNumber->"+cursor.next().get("serialnumber")+" Price->"+ cursor.curr().get("price")+" Velocity->"+cursor.curr().get("velocity")+ " Ability-> " + cursor.curr().get("ability"));
        }
    }
    public static void searchBySerialnumber(DB db,String collection, int serialnumber){
     DBCollection colec = db.getCollection("Products");
     BasicDBObject consultation = new BasicDBObject();
     consultation.put("serialnumber",serialnumber);
  
     DBCursor cursor =colec.find(consultation);
     while(cursor.hasNext()){
        System.out.println("* SerialNumber->"+cursor.next().get("serialnumber")+" Price->"+ cursor.curr().get("price")+" Velocity->"+cursor.curr().get("velocity")+ " Ability-> " + cursor.curr().get("ability"));
     }
    }
}
