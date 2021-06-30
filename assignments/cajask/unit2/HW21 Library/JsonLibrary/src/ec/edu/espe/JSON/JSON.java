/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.JSON;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Lizbeth Cajas 
 */
public class JSON {
    public static void createJson(){
        JSONObject telefono1 = new JSONObject();
        telefono1.put("Telephone", "578327768");
        
        JSONObject telefono2 = new JSONObject();
        telefono2.put("Telephone", "575345234");
        
        JSONArray telefonList = new JSONArray();
        telefonList.add(telefono1);
        telefonList.add(telefono2);
        
        JSONObject persona1 = new JSONObject();
        persona1.put("Name", "Sonia");
        persona1.put("Last Name", "Gonsalez");
        persona1.put("Code", 6);
        persona1.put("Telephone", telefonList);
        
        JSONObject telefono3 = new JSONObject();
        telefono3.put("Telephone", "65765123455");
        
        JSONObject telefono4 = new JSONObject();
        telefono4.put("Telephone", "89541646556");
        
        JSONArray telefonList2 = new JSONArray();
        telefonList2.add(telefono3);
        telefonList2.add(telefono4);
        
        //Persona2
        JSONObject persona2 = new JSONObject();
        persona2.put("Name", "Karla");
        persona2.put("Last Name", "cajas");
        persona2.put("Telephone", telefonList2);
        persona2.put("Code", 8);
      

        
        JSONObject datosPersona1 = new JSONObject();
        datosPersona1.put("Person", persona1);
        JSONObject datosPersona2 = new JSONObject();
        datosPersona2.put("Person", persona2);
        
        JSONArray listaPersonas = new JSONArray();
        listaPersonas.add(datosPersona1);
        listaPersonas.add(datosPersona2);
        
        try(FileWriter file = new FileWriter("persons.json")){
            file.write(listaPersonas.toString());
            file.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readJson() {
        JSONParser jsonParser = new JSONParser();
        
        try(FileReader reader = new FileReader("persons.json")){
            Object obj = jsonParser.parse(reader);
            
            JSONArray personasList = (JSONArray) obj;
            System.out.println("the file is saved as follows: ");
            System.out.println(personasList);
            
            for(Object persona: personasList){
                mostrarInformacionPersona((JSONObject) persona);
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

    private static void mostrarInformacionPersona(JSONObject jsonObject) {
        JSONObject persona = (JSONObject) jsonObject.get("Person");
        System.out.println("Pesron withind the JSON.");
        String nombre = (String) persona.get("Name");
        System.out.println("Name: " +nombre);
        
        String apellido = (String) persona.get("Last Name");
        System.out.println("Last Name" +apellido);
        
        Long codigo = (Long) persona.get("Code");
        System.out.println("Code: " +codigo);
        

        JSONArray telefonosList = (JSONArray) persona.get("Telephone ");
        for(Object tel: telefonosList){
            JSONObject t = (JSONObject) tel;
            System.out.println("Telephone: " +t.get("Telephone "));
        }
    }
}
