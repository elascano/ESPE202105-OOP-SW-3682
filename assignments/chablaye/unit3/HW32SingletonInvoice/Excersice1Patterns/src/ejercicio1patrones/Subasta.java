/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1patrones;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Subasta implements Observable{
    private ArrayList<Observer> observadores;
    private int inicial = 100;

    public ArrayList<Observer> getObservadores() {
        return observadores;
    }

    public void setObservadores(ArrayList<Observer> observadores) {
        this.observadores = observadores;
    }

    public int getInicial() {
        return inicial;
    }

    public void setInicial(int inicial) {
        this.inicial = inicial;
    }
    
    
    public Subasta(){
       observadores = new ArrayList<Observer>(); 
    }
    
    public void enlazarObservador(Observer o){
        observadores.add(o);
    }
    public void notificarSubasta(){
        System.out.println("La puja comenzo con 100$");
        System.out.println("====================================================");
        notificar();
    }
    @Override
    public void notificar(){
        for(Observer o:observadores){
            inicial = o.update(inicial);
        }
    }
}
