/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class D {
    private boolean b;
    
    public B m(){
        System.out.println("inside D.m() method that returns a B object");
        return new B();
}
    public int m(F f)
    {
        System.out.println("inside D.m() method that recieves f ->"+f);
        return 0;
    
    
    }

    /**
     * @return the b
     */
    public boolean isB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(boolean b) {
        this.b = b;
    }
    

}