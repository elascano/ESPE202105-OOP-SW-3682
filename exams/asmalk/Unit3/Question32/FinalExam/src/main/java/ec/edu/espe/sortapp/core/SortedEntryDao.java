package ec.edu.espe.sortapp.core;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.sortapp.model.SortedEntry;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author 
 */
public class SortedEntryDao {
    private static SortedEntryDao instance = null;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
    public static SortedEntryDao getInstance() {
        if (instance == null) {
            instance = new SortedEntryDao();
        }
        
        return instance;
    }
    
    private SortedEntryDao() {
        MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        
        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(
            MongoClientSettings.getDefaultCodecRegistry(),
            CodecRegistries.fromProviders(PojoCodecProvider
                .builder().automatic(true).build()));
        
        MongoDatabase database = mongoClient.getDatabase("sortapp");
        
        collection = database.getCollection("sorted_entries");
    }

    public void saveSortedEntry(SortedEntry entry) {
        List<Integer> sorted = new ArrayList<>();
        List<Integer> unsorted = new ArrayList<>();
        
        int [] psorted = entry.getOutput();
        int [] punsorted = entry.getOutput();
        
        for (int i = 0; i < entry.getOutput().length; i++) {
            sorted.add(psorted[i]);
            unsorted.add(punsorted[i]);
        }
        
        Document document = new Document()
            .append("_id", new ObjectId())
            .append("sorted", sorted)
            .append("unsorted", unsorted)
            .append("algorithm", entry.getAlgorithm())
            .append("length", entry.getOutput().length);
        
        collection.insertOne(document);
    }
}
