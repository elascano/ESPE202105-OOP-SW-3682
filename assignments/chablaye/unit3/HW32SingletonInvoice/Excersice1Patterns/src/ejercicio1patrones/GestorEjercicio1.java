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
public class GestorEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente(30);
        Cliente c2 = new Cliente(50);
        Cliente c3 = new Cliente(10);
        Cliente c4 = new Cliente(100);
        Subasta s1 = new Subasta();
        
        s1.enlazarObservador(c1);
        s1.enlazarObservador(c2);
        s1.enlazarObservador(c3);
        s1.notificarSubasta();
        System.out.println("====================================================");
        System.out.println("La puja finalizo en " +s1.getInicial()+ "$");
        
    }
    
}
