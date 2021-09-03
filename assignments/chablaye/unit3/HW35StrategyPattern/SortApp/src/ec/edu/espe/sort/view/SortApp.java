/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sort.view;

import ec.edu.espe.sort.model.SortingContext;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = {3,6,1,2,5,2,3,6};
        int size;
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        size = sortedList.length;
        for(int i=0;i<size;i++){
            System.out.println(sortedList[i] + " - ");
        }
        
        
//        Scanner entrada = new Scanner(System.in);
//        int arreglo[], nElementos, aux;
//        
//        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos de el arreglo"));
//        
//        arreglo = new int[nElementos];
//        
//        for(int i=0; i<nElementos; i++){
//            System.out.println((i+1)+ "Digite un numero: ");
//            arreglo[i] = entrada.nextInt();
//        }
//        
//        //Metodo Burbuja
//        for(int i=0; i<(nElementos-1); i++){
//            for(int j=0; j<(nElementos-1); j++){
//                if(arreglo[j]>arreglo[j+1]){
//                    aux = arreglo[j];
//                    arreglo[j] = arreglo [j+1];
//                    arreglo[j+1] = aux;
//                }
//            }
//        }
//        
//        //Mostrando el arreglo en forma creciente
//        System.out.println("Arreglo en forma Creciente: ");
//        for(int i=0;i<nElementos;i++){
//            System.out.println(arreglo[i] + " - ");
//        }
//        System.out.println("\n");
    }
}
