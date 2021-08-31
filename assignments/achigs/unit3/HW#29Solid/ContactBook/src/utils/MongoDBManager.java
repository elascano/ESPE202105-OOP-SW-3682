/** Copyright ESPE-DECC
 */
package utils;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import javax.swing.text.Document;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class MongoDBManager implements DBManager {

    private String cluster;
    private MongoClientURI url;
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection collection;
    private DBCursor cursor = null;

    @Override
    public boolean connect() {
        try {
            cluster = "mongodb+srv://StevenAchig:sjachig1@cluster0.7df9l.mongodb.net/BookContacts?retryWrites=true&w=majority";
            
            url = new MongoClientURI(cluster);
            mongoClient = new MongoClient(url);
            database = mongoClient.getDatabase("BookContacts");
            collection = database.getCollection("contacts");
            return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }
    
    @Override
    public boolean add(ArrayList data) {
        org.bson.Document dc = new org.bson.Document("data", data);
        collection.insertOne(dc);
        return true;
    }

    @Override
    public String read(String table) {
        MongoCursor<org.bson.Document> documents;
        documents = collection.find().iterator();
        while (documents.hasNext()) {
            org.bson.Document document = new org.bson.Document();
            document = documents.next();
        }
        return "[{},{},{}]";
    }

    @Override
    public void update(String searchInfo, String table, String data) {
    }

    @Override
    public boolean delete(String searchInfo, String table) {
        return true;
    }

    @Override
    public String find(String searchInfo, String table) {
        return "[{},{}]";
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
