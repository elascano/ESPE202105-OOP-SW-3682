/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.theorital.model;

import java.util.ArrayList;

/**
 *
 * @author Karlita
 */
public class A {
    private B b;
    
    private ArrayList<C> cs=new ArrayList<>();
    
    public C m(D  d){
        return new C();
    }
    
    public D m(){
        return new D();
    }
}
