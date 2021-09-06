/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.view;

import ec.edu.espe.sortapp.model.SortingContext;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = {3, 6};
        //{3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3, 4, 5, 8, 45, 19, 87, 13, 25, 26, 28};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        for(int i=0; i<sortedList.length; i++){
            System.out.print(sortedList[i] + " ");
        }
    }
}
