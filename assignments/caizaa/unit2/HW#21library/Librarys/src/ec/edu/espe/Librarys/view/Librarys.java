/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Librarys.view;
import java.util.Scanner;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class Librarys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("My name is Alisson Caiza   ");
        Scanner sc=new Scanner(System.in);
        double radius;
        double area= Math.PI;
        System.out.println("Enter Radius:  ");
        radius=sc.nextDouble();
        area=area*radius*radius;
        System.out.println("The area of thecircle is: "+area);
        // TODO code application logic here
    }
    
}
