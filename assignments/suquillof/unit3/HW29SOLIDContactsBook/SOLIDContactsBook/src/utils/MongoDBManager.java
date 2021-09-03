/** Copyright ESPE-DECC
*/

package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class MongoDBManager implements DBManager{

    @Override
    public void add(String mongoConnection,String data, String table) {
        
        String cluster = mongoConnection;
        MongoClientURI uri = new MongoClientURI(cluster);
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("ContacsBook");
        MongoCollection collection = database.getCollection(table);
        Document dc = Document.parse(data);
        collection.insertOne(dc);
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

}
