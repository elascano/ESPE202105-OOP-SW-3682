/** Copyright ESPE-DECC
*/

package utils;

import com.mongodb.DBCursor;
import static com.mongodb.Mongo.connect;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.contatcs.model.Book;
import ec.edu.espe.contatcs.model.Contact;
import java.util.ArrayList;
import javax.swing.text.Document;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class MongoDBManager implements DBManager{
    String cluster;
    MongoClientURI uri;
    MongoClient mongoClient;
    MongoDatabase database; 
    MongoCollection collection;
    DBCursor cursor = null;

    @Override
    public boolean add(ArrayList data) {
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
        cluster = "mongodb://NullPointers:*****@finalproyect-shard-00-00.6vyqq.mongodb.net:27017,finalproyect-shard-00-01.6vyqq.mongodb.net:27017,finalproyect-shard-00-02.6vyqq.mongodb.net:27017/test?authSource=admin&replicaSet=atlas-7i12u1-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database= mongoClient.getDatabase("ContactsBook");
        collection = database.getCollection("Contact");
        return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

}
