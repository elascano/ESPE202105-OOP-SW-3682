/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mongodb.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class CRUDMongodb {

    /**
     * @param args the command line arguments
     */
     public static void main(String[]args) {
        
        MongoClient mongo = createConnection();
        
        // If it does not exist create the database
        if(mongo != null) {
            
            DB db = mongo.getDB("UsersTest");
            
            System.out.println("database created");
     
            //insertUser(db, "Users", "Nicolás", 20,"Ecuador",false);
            //insertUser(db, "Users", "Ayllin", 17,"Ecuador",false);
            //insertUser(db, "Users", "Libia", 38,"Ecuador",true);
            //insertUser(db, "Users", "Fran", 36,"Ecuador",true);
            
            //showCollection(db, "Users");
            
            //searchByName(db, "Users", "Nicolás");
            
            //updateDocument(db, "Users", "Ayllin");
            //searchByName(db,"Users", "Ayllin");
            
            //deleteDocument(db, "Users", "Libia");
            //showCollection(db, "Users");
        }
        
    }
    
    // Connect
    public static MongoClient createConnection() {
        
        System.out.println("Test Conecction Mongodb");
        
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        return mongo;
    }
    
    // Create
    public static void insertUser(DB db, String collection, String name,int age, String country,boolean married) {
       
        DBCollection collect = db.getCollection(collection);
        
        BasicDBObject document = new BasicDBObject();
        document.put("name", name);
        document.put("age", age);
        document.put("country",country);
        document.put("married",married);
        
        collect.insert(document);
        
    }
    
    // show all the documents of the collection
    public static void showCollection(DB db, String collection) {
        
        DBCollection collect = db.getCollection(collection);
        
        DBCursor cursor = collect.find();
        
        while(cursor.hasNext()) {
            System.out.println("=> "+ cursor.next().get("name") + " - " + cursor.curr().get("age") +
                    " - " + cursor.curr().get("country") + " - " + cursor.curr().get("married"));
        }
    }
    
    // Show documents by the name
    public static void searchByName(DB db, String collection, String name) {
        
        DBCollection collect = db.getCollection(collection);
        
        BasicDBObject searchName = new BasicDBObject();
        searchName.put("name", name);
        
        DBCursor cursor = collect.find(searchName);
        
        while(cursor.hasNext()) {
            System.out.println("=> "+ cursor.next().get("name") + " - " + cursor.curr().get("age") +
                    " - " + cursor.curr().get("country") + " - " + cursor.curr().get("married"));
        }
    }
    
    // Update
    public static void updateDocument(DB db, String collection, String name) {
        
        DBCollection collect = db.getCollection(collection);
        
        
        BasicDBObject updateCountry = new BasicDBObject();
        updateCountry.append("$set", new BasicDBObject().append("country", "Colombia"));
        
        
        BasicDBObject searchByName = new BasicDBObject();
        searchByName.append("name", name);
        
        
        collect.updateMulti(searchByName, updateCountry);
    }
    
    //Delete
    public static void deleteDocument(DB db, String collection, String name) {
        
        DBCollection collect = db.getCollection(collection);
        
        collect.remove(new BasicDBObject().append("name", name));
    }
    
}
