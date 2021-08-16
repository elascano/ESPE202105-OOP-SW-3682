/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class DatabaseMongo {
   
    private String cluster;
    private MongoClientURI uri;
    private MongoClient mongoClient;
    private MongoDatabase database; 
    private MongoCollection collection;
    
    public DatabaseMongo(String databaseName,String collectionName) {
        
        cluster = "mongodb+srv://NullPointers:admin123@finalproyect.6vyqq.mongodb.net/SystemSpeakers?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database= mongoClient.getDatabase(databaseName);
        collection = database.getCollection(collectionName);
    }
    /**
     * @return the cluster
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * @param cluster the cluster to set
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * @return the uri
     */
    public MongoClientURI getUri() {
        return uri;
    }

    /**
     * @param uri the uri to set
     */
    public void setUri(MongoClientURI uri) {
        this.uri = uri;
    }

    /**
     * @return the mongoClient
     */
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * @param mongoClient the mongoClient to set
     */
    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    /**
     * @return the database
     */
    public MongoDatabase getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }

    /**
     * @return the collection
     */
    public MongoCollection getCollection() {
        return collection;
    }

    /**
     * @param collection the collection to set
     */
    public void setCollection(MongoCollection collection) {
        this.collection = collection;
    }
}
