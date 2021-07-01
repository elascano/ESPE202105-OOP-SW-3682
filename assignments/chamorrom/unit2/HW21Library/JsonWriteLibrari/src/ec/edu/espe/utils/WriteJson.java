/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class WriteJson {

    public static void write(JSONArray listObj, String document) throws IOException {
        File documentJ = new File(document);
        FileWriter fileP;
        PrintWriter lineP;

        if (!documentJ.exists()) {
            documentJ.createNewFile();
            fileP = new FileWriter(documentJ, true);
            lineP = new PrintWriter(fileP);
            fileP.write(listObj.toString());
            lineP.close();
            fileP.close();
        } else {
            fileP = new FileWriter(documentJ, true);
            lineP = new PrintWriter(fileP);
            fileP.write(listObj.toString());
            
            lineP.close();
            fileP.close();
        }

    }

    public static JSONArray read(String document) throws FileNotFoundException, ParseException, IOException {
   
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(document);
        Object obj = parser.parse(reader);
        JSONArray objList = (JSONArray) obj;
        
        return objList;

    }

}
