package ec.epe.edu.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class InventoryFileManager {
    public static void createJsonFile(ArrayList cellphones, ArrayList phoneCases,
            ArrayList screenProtectors, ArrayList chargers, ArrayList headPhones)
            throws IOException{
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter("Products.json")) {
            writer.write(gson.toJson(cellphones));
            writer.write(gson.toJson(phoneCases));
            writer.write(gson.toJson(screenProtectors));
            writer.write(gson.toJson(chargers));
            writer.write(gson.toJson(headPhones));
        }
    }
}
