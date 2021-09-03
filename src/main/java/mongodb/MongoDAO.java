package mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDAO {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("mongodb+srv://laranjazda:bros2011@h-s-o-b.5b97q.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase bancoDeDados = mongoClient.getDatabase("sample_supplies");
        MongoCollection<Document> sample_supplies = bancoDeDados.getCollection("sales");
        Document sale = sample_supplies.find().first();
        System.out.println(sale);
        mongoClient.close();


//        ConnectionString connectionString = new ConnectionString("mongodb+srv://laranjazda:bros2011@h-s-o-b.5b97q.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .build();
//        MongoClient mongoClient = new MongoClient(String.valueOf(settings));
//        MongoDatabase database = mongoClient.getDatabase("sample_supplies");
//
//        MongoCollection<Document> sample_supplies = database.getCollection("sales");
//        Document sale = sample_supplies.find().first();
//        System.out.println(sale);
//        mongoClient.close();

    }
}
