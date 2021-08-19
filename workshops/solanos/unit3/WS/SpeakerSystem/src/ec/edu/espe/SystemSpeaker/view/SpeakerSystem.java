/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SystemSpeaker.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Speakers.model.Speaker;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class SpeakerSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Speaker speaker = new Speaker(0, true, "", 0, 0);
        ArrayList<Speaker> speakers = new ArrayList<>();
        
        GsonBuilder gsonBuilder = new GsonBuilder();      
        Gson gson = gsonBuilder.create();
        String JsonSpeaker;
        JsonSpeaker = gson.toJson(speaker);
        
        
        
    }
    
}
