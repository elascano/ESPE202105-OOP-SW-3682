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
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class JSON {
    public static void createJson(){
        JSONObject telefono1 = new JSONObject();
        telefono1.put("Telefono", "1111111111");
        
        JSONObject telefono2 = new JSONObject();
        telefono2.put("Telefono", "222222222");
        
        JSONArray telefonList = new JSONArray();
        telefonList.add(telefono1);
        telefonList.add(telefono2);
        
        JSONObject persona1 = new JSONObject();
        persona1.put("Nombre", "Anahi");
        persona1.put("Apellido", "Torres");
        persona1.put("Codigo", 1);
        persona1.put("Estatura", 1.6);
        persona1.put("Telefonos", telefonList);
        
        JSONObject telefono3 = new JSONObject();
        telefono3.put("Telefono", "3333333333");
        
        JSONObject telefono4 = new JSONObject();
        telefono4.put("Telefono", "4444444444");
        
        JSONArray telefonList2 = new JSONArray();
        telefonList2.add(telefono3);
        telefonList2.add(telefono4);
        
        //Persona2
        JSONObject persona2 = new JSONObject();
        persona2.put("Nombre", "Mary");
        persona2.put("Apellido", "Smith");
        persona2.put("Codigo", 2);
        persona2.put("Estatura", 1.56);
        persona2.put("Telefonos", telefonList2);
        
        JSONObject datosPersona1 = new JSONObject();
        datosPersona1.put("Persona", persona1);
        JSONObject datosPersona2 = new JSONObject();
        datosPersona2.put("Persona", persona2);
        
        JSONArray listaPersonas = new JSONArray();
        listaPersonas.add(datosPersona1);
        listaPersonas.add(datosPersona2);
        
        try(FileWriter file = new FileWriter("personas.json")){
            file.write(listaPersonas.toString());
            file.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readJson() {
        JSONParser jsonParser = new JSONParser();
        
        try(FileReader reader = new FileReader("personas.json")){
            Object obj = jsonParser.parse(reader);
            
            JSONArray personasList = (JSONArray) obj;
            System.out.println("El archivo contiene lo siguiente: ");
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
        JSONObject persona = (JSONObject) jsonObject.get("Persona");
        System.out.println("Pesrona dentro del JSON.");
        String nombre = (String) persona.get("Nombre");
        System.out.println("Nombre: " +nombre);
        
        String apellido = (String) persona.get("Apellido");
        System.out.println("Apellido: " +apellido);
        
        Long codigo = (Long) persona.get("Codigo");
        System.out.println("Codigo: " +codigo);
        
        Double estatura = (Double) persona.get("Estatura");
        System.out.println("Estatura: " +estatura);
        
        JSONArray telefonosList = (JSONArray) persona.get("Telefonos");
        for(Object tel: telefonosList){
            JSONObject t = (JSONObject) tel;
            System.out.println("Telefono: " +t.get("Telefono"));
        }
    }
}
