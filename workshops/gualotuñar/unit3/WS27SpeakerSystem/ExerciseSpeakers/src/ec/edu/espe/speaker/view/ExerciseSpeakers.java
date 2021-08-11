/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speaker.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.speaker.model.Speaker;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class ExerciseSpeakers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Speaker speaker = new Speaker (0, 0, 0, "", "", true);
        ArrayList<Speaker> speakers = new ArrayList<>();
        
    GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonBlender;
        jsonBlender = gson.toJson(speaker);
        
        System.out.println(jsonBlender);
        
        
        
    gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter("Speaker.json")) {
            writer.write(gson.toJson(speaker));
        }
                 
        
    }
    
}
