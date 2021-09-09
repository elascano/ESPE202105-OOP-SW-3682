/** Copyright ESPE-DECC
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class MongoDBManager implements DBManager {

    String cluster;
    MongoClientURI uri;
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection collection;

    @Override
    public boolean add(String data, String table) {
        org.bson.Document dc = new org.bson.Document("data", data);
        collection.insertOne(dc);
        return true;
    }

    @Override
    public String read(String table) {

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

    @Override
    public boolean connect(String connectionString) {
        try {
            cluster = "mongodb+srv://Cristian:cd070901@cluster0.bdbpo.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
            uri = new MongoClientURI(cluster);
            mongoClient = new MongoClient(uri);
            database = mongoClient.getDatabase("Strategy");
            collection = database.getCollection("SortNumbers");
            return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public static MongoClient createConnection() {
        String cluster;
        MongoClientURI uri;
        MongoClient mongoClient;
        MongoDatabase database;
        MongoCollection collection;

        cluster = "mongodb+srv://Cristian:cd070901@cluster0.bdbpo.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDatabase("Strategy");
        collection = database.getCollection("SortNumbers");
        return mongoClient;
    }
}
