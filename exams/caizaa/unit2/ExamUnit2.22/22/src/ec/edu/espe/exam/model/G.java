/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class G implements H{
    public J use(J j){
        System.out.println("J--->" + j);
        return new J();
    }

    @Override
    public int method(int i) {
        int sum;
        sum = i + 1;
        return sum;
    }
}
