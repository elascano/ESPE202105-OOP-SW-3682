/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1patrones;

/**
 *
 * @author Esteban
 */
public class Cliente implements Observer{
    private int puja;
    //int total=100;

    public Cliente(int puja) {
        this.puja = puja;
    }

    public int getPuja() {
        return puja;
    }

    public void setPuja(int puja) {
        this.puja = puja;
    }
    
    
    @Override
    public int update(int a) {
        //System.out.println("la subasta ha aumentado 20$");
        int total=a;
        System.out.println("El cliente agrego " +puja+ "$");
        total += puja;
        System.out.println("->Se ha actualizado el valor a: " +total+ "$");
        return total;
    }
    
}
