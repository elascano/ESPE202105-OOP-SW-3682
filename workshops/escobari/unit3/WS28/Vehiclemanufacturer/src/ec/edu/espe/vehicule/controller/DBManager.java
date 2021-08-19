/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicule.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class DBManager {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    private String cluster;
    private MongoClientURI uri;
    private MongoClient mongoClient;
    private MongoDatabase database; 
    private MongoCollection collections;

    public DBManager() {
        cluster = "mongodb+srv://Vehicule:1710@cluster0.oa9yf.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database= mongoClient.getDatabase("VehicleManufacturer");
        collections = database.getCollection("Model");
        System.out.println("Connect to database succesfully");
    }
    
   
    public boolean insert(String product){
        document.put("product", product);
        collection.insert(document);
        return true;
    }
    
    public void show(){
        DBCursor cursor = collection.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean actualize(String oldData, String newData){
        document.put("data", oldData);
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("data", newData);
        collection.findAndModify(document, newDocument);
        return true;
    }
    
    public boolean delete(String data){
        document.append("data", data);
        collection.remove(document);
        return true;
    }
}
    

