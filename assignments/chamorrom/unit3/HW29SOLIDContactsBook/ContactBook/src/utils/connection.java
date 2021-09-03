/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author @author Myckel Chamorro ESPE-POO
 */
public class connection {
    private String cluster;
    private MongoClientURI url;
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection collection;
    private DBCursor cursor;

    public connection() {
        cluster = "mongodb+srv://SMUser:sanamed123@cluster0.8dcm3.mongodb.net/ContactsBook?retryWrites=true&w=majority";
        url = new MongoClientURI(cluster);
        mongoClient = new MongoClient (url);
        database = mongoClient.getDatabase("ContactsBook");
        collection = database.getCollection("Contacts");
        
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public MongoClientURI getUrl() {
        return url;
    }

    public void setUrl(MongoClientURI url) {
        this.url = url;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }

    public MongoCollection getCollection() {
        return collection;
    }

    public void setCollection(MongoCollection collection) {
        this.collection = collection;
    }

    public DBCursor getCursor() {
        return cursor;
    }

    public void setCursor(DBCursor cursor) {
        this.cursor = cursor;
    }
    
    
    
}
