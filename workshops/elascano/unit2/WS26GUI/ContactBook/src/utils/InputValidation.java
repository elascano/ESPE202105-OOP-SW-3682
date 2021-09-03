/** Copyright ESPE-DECC
*/

package utils;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class InputValidation {

    public static boolean validateCharacters(String data){
        boolean isCharacter=true;
        
        if((!data.equals(null))&&data.matches("^[a-zA-Z]*$")){
            isCharacter = false;
        }
        
//        for(int i = 0; i < data.length(); i++){
//            char ch = data.charAt(i);
//            
//            if(!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
//                isCharacter = false;
//            }
//        }
        return isCharacter;
    }
}
