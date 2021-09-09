/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finale;

import java.util.Scanner;

/**
 *
 * @author Vinicio Guaman The Programers ESPE-DCCO
 */
public class Finale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[4];
        boolean creciente=false, decreciente=false;
        
        System.out.println("Llenar el arreglo");
        for(int i=0; i<4;i++){
            System.out.println((i+1)+ "Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i=0;i<4;i++){
            if(arreglo[i]< arreglo[i+1]){
                creciente = true;
            }
            if(arreglo[i] > arreglo [i+1]){
                decreciente = true;
            }
        }
        
        if(creciente==true && decreciente==false)
            System.out.println("\Arreglo en forma creciente");
        }
        else if(creciente==false && decreciente==true){
             System.out.println("\Arreglo en forma decreciente");
        }
        else if(creciente==true && decreciente==true){
            System.out.println("El arreglo esta desordenado"); 
        }
    
    }
    
}
