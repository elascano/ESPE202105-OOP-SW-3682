/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoflibrary;

import operations.DemoLibrary;

/**
 *
 * @author 59399
 */
public class UseOfLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DemoLibrary op = new DemoLibrary();
        System.out.println("Sum -> " + op.sum(10, 15));
        System.out.println("Substraccion -> " + op.substraction(10, 15));
        System.out.println("Multiplication -> " + op.multiplication(10, 15));
        System.out.println("Division -> " + op.division(10, 0));
    }
}
