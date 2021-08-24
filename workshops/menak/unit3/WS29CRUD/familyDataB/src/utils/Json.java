/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.espe.edu.store.model.Speaker;
import ec.espe.edu.store.view.FrmAdd;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;


/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Json {
    curp c = new curp();  
    FrmAdd fmrAdd = new FrmAdd();
    public static void WriteJson() throws IOException{
    
        String id;
        String price;
        String power;
        String model;
        String brand;
        String bluethooth ;           
        
                       
        Json json = new Json();
        Speaker speaker = new Speaker("","","", "", "", "");
        
         ArrayList<Speaker> speakers = new ArrayList<>();    
         
    GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonSpeaker;
        jsonSpeaker = gson.toJson(speaker);
        
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("Speaker.json")) {
                 writer.write(gson.toJson(speakers));
             }
     }
}
