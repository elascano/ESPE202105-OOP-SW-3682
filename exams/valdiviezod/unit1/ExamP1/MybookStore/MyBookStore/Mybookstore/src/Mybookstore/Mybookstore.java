/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybookstore;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Darwin Valdiviezo NullPunter
 */
public class Mybookstore {

    public static void main(String[] args) {
        
        JSONParser parser = new JSONParser();
        
        try {
            
            Object obj = parser.parse(new FileReader("Books.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("JSON FILE: " + jsonObject);
            
            JSONArray array = (JSONArray) jsonObject.get("Books");
            System.out.println("");
            
            for(int i = 0 ; i < array.size() ; i++) {
                JSONObject jsonObject1 = (JSONObject) array.get(i); //does not exist a class Book for add the data in this class
                
                System.out.println("DATOS DEL USUARIO: " + i); // varibles not have a name apropiate
                System.out.println("Title: " + jsonObject1.get("Title"));
                System.out.println("Author: " + jsonObject1.get("Author"));
                System.out.println("Publisher: " + jsonObject1.get("Publisher"));
                System.out.println("Year: " + jsonObject1.get("Year"));
                
                System.out.println("");
            }
            
        } catch(FileNotFoundException e) { }
        catch(IOException e) { }
        catch(ParseException e) { }
        
    }
    
}
