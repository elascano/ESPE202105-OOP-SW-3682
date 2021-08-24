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
public class MongoDBManager implements DBManager{

    @Override
    public boolean add(String data, String table) {
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
        return true;
    }
    
    public static MongoClient createConection() {
        String cluster;
        MongoClientURI uri;
        MongoClient mongoClient;
        MongoDatabase database;

        cluster = "mongodb+srv://ArielAGH:aadriangh@cluster0.89lzq.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDatabase("ContactsBook");
        return mongoClient;
    }

}
