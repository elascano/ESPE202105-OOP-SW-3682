/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractexample.model;

import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class A {
    private int a;//1
    private int b;//1
    private A asArray[] = new A[1]; //1
    private ArrayList<C> cs = new ArrayList<>();//1
    private B bsArray[] = new B[5];//1
    
    
    public A(int a, int b) {//the constructor has wrong because dont have all the parameters
        this.a = a;
        this.b = b;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", asArray=" + asArray + ", cs=" +
                cs + ", bsArray=" + bsArray + '}';
    }

    
    public A m(int m, int n){ //0.5
        return new A();
    }
    
    public A m(){ //0.5
        return new A();
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    /**
     * @return the asArray
     */
    public A[] getAsArray() {
        return asArray;
    }

    /**
     * @param asArray the asArray to set
     */
    public void setAsArray(A[] asArray) {
        this.asArray = asArray;
    }

    /**
     * @return the bsArray
     */
    public B[] getBsArray() {
        return bsArray;
    }

    /**
     * @param bsArray the bsArray to set
     */
    public void setBsArray(B[] bsArray) {
        this.bsArray = bsArray;
    }

    
}
