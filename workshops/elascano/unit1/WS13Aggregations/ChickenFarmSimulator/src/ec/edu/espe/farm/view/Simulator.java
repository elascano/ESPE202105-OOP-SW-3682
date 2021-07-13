/** Copyright ESPE-DECC
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Simulator {

    public static void main(String[] args) {
        int chickenId;
        String name;
        String color;
        Date date = new Date();
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<>();
        Chicken chickensArray[] = new Chicken[5];
        String jsonChicken = "";

        //input by keyboard
        chickenId = 1;
        name = "Lucy";
        color = "white";
        isMolting = true;

        Chicken chicken = new Chicken();
        System.out.println("chicken object -> " + chicken);

        chicken = new Chicken(chickenId, name, color, date, isMolting);
        System.out.println("chicken object -> " + chicken);

        Chicken chicken2 = new Chicken(2, "Maruja", "black", new Date(), false);
        System.out.println("chicken2 object -> " + chicken2);

        chickens.add(chicken);
        chickens.add(chicken2);

        System.out.println("chickens -> " + chickens);

        chickensArray[0] = chicken;

        System.out.println("chickensArray -> " + chickensArray[0]);

        //{"id":"1","name":"2"}
        jsonChicken = "{\"id\":\"1\"}";

        System.out.println("chicken Json -> " + jsonChicken);

//        String json = "";
//        json = "{\n"
//                + "  \"args\": {\n"
//                + "    \"age\": \"3\", \n"
//                + "    \"color\": \"white\", \n"
//                + "    \"id\": \"1\", \n"
//                + "    \"molting\": \"true\", \n"
//                + "    \"name\": \"Lucy\"\n"
//                + "  }, \n"
//                + "  \"data\": \"\", \n"
//                + "  \"files\": {}, \n"
//                + "  \"form\": {}, \n"
//                + "  \"headers\": {\n"
//                + "    \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \n"
//                + "    \"Accept-Encoding\": \"gzip, deflate, br\", \n"
//                + "    \"Accept-Language\": \"en-us\", \n"
//                + "    \"Host\": \"httpbin.org\", \n"
//                + "    \"User-Agent\": \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.1.1 Safari/605.1.15\", \n"
//                + "    \"X-Amzn-Trace-Id\": \"Root=1-60ccc51e-0ee37a9653e68ba6115c4d08\"\n"
//                + "  }, \n"
//                + "  \"json\": null, \n"
//                + "  \"method\": \"GET\", \n"
//                + "  \"origin\": \"157.100.172.146\", \n"
//                + "  \"url\": \"https://httpbin.org/anything?id=1&name=Lucy&color=white&age=3&molting=true\"\n"
//                + "}";
//        
//        System.out.println("json "+ json);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        jsonChicken = gson.toJson(chicken);
        
        // Serialization
        System.out.println("jsonChicken -> " + jsonChicken);
        jsonChicken = gson.toJson(chicken2);
        System.out.println("jsonChicken ->  " + jsonChicken);

        //Deserialization
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken, Chicken.class);
        
        System.out.println(" chiclken object name -> " + chicken3.getName() );
        
    }

}
