/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Karlita
 */
public class MongoDBConnection {
    
    private static MongoDBConnection Instance;
    private String cluster;
    private MongoClientURI url;
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection collection;
    private DBCursor cursor;
    
    public  MongoDBConnection(){
     
    }
    
  public boolean createConnection(){
        
        try {
        cluster = "mongodb+srv://karla123:mksa89717@cluster0.5213n.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        url = new MongoClientURI(cluster);
        mongoClient = new MongoClient (url);
        database = mongoClient.getDatabase("sortapp");
        collection = database.getCollection("sorter_entries");
        return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
       
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
     * @return the url
     */
    public MongoClientURI getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(MongoClientURI url) {
        this.url = url;
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

    /**
     * @return the cursor
     */
    public DBCursor getCursor() {
        return cursor;
    }

    /**
     * @param cursor the cursor to set
     */
    public void setCursor(DBCursor cursor) {
        this.cursor = cursor;
    }

    /**
     * @return the Instance
     */
    public static MongoDBConnection getInstance() {
        return Instance;
    }

    /**
     * @param aInstance the Instance to set
     */
    public static void setInstance(MongoDBConnection aInstance) {
        Instance = aInstance;
    }
    
}
