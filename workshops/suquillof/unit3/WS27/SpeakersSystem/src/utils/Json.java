/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Json {
    
    public static String serializationGson(Object object){
        
        Gson gson = new Gson();
        String jsonObject = gson.toJson(object);    
        
        return jsonObject;
    }
}
