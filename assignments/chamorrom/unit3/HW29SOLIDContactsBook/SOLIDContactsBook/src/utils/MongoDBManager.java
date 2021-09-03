/** Copyright ESPE-DECC
*/

package utils;

import com.mongodb.DBCursor;
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
        cluster = "mongodb+srv://daportilla1:DonBosco1@cluster0.yagrt.mongodb.net/ContactsBook?retryWrites=true&w=majority";
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
