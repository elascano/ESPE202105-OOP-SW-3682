/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class DBManager {
    
    String cluster;
    MongoClientURI uri;
    MongoClient mongoClient;
    MongoDatabase database; 
    private MongoCollection<Document> collection;
    
    public DBManager(){
        connection();
    }
    
    private void connection(){
        this.cluster = "mongodb+srv://StevenAchig:sjachig1@cluster0.7df9l.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        this.uri = new MongoClientURI(cluster);
        this.mongoClient = new MongoClient(uri);
        this.database= mongoClient.getDatabase("SortApp");
        this.collection = database.getCollection("Arrays");
        System.out.println("Connection Succesfuly");
    }

    /**
     * @return the collection
     */
    public MongoCollection<Document> getCollection() {
        return collection;
    }
}
