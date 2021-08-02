/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class inputValidation {
    
    public static boolean validateCharacters(String data){
        boolean isCharacters = true;
        
        for (int i=0;i<data.length();i++){
            char ch = data.charAt(i);
            if(!(ch>='a' && ch<='z'|| ch>='A' && ch<='Z')){
              isCharacters = false;  
            }
        }
        return isCharacters;
    }
}
