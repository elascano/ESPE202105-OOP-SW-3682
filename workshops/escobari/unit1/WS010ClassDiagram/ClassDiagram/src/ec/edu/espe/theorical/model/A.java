/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

import java.util.ArrayList;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class A {
    private B b;
    private final ArrayList<C> cs= new ArrayList<>();
    
    public C m(D d){
        return new C();
    }
    
    public D m(){
        return new D();
        
    }
    
    
}
