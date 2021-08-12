/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.model;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class G implements H{

    @Override
    public J m() {
        return  new J();
        }

    @Override
    public void m(J j) {
        System.out.println("running method m(J j) whith j ->" + j);
    }    
}
