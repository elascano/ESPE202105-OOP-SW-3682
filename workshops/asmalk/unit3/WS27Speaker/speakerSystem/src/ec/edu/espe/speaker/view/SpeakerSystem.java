/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speaker.view;

import ec.edu.espe.speaker.model.Speaker;
import ec.edu.espe.speaker.model.speakerDAO;

/**
 *
 * @author Asmal Kevin
 */
public class SpeakerSystem {
    public static void main(String[] args) {
        speakerDAO objectDAO = new speakerDAO();
        Speaker speaker1 = new Speaker("1", "200", 10.45F, "sony", "SRS-XB13", Boolean.TRUE);
        Speaker speaker2 = new Speaker("2", "150", 7.65F, "sony", "SSCS5", Boolean.FALSE);
        Speaker speaker3 = new Speaker("3", "250", 15.50F, "jbl", "FLIP 5", Boolean.TRUE);
        Speaker speaker4 = new Speaker("4", "200", 10.00F, "jbl", "Charge 4", Boolean.FALSE);        
        
        objectDAO.insertSpeaker(speaker1);
        objectDAO.insertSpeaker(speaker2);
        objectDAO.insertSpeaker(speaker3);
        objectDAO.insertSpeaker(speaker4);
        
    }
    
}
