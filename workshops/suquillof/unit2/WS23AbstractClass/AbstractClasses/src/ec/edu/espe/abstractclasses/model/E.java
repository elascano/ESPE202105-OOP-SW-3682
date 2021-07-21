/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclasses.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class E extends B{//1
    
    private float p;//1
    private float q;//1

    @Override
    public String toString() {//1
        return "E{" + super.toString() + "p=" + p + ", q=" + q + '}';
    }

    public E(float p, float q, float f, double d) {//0.8
        super(f, d);
        this.p = p;
        this.q = q;
        //missing the arrayList 
    }

    public int m1(boolean b){//1
        return 0;
    }

    @Override
    public int operation1(int n) {//1 the method is should do something differnet that class D
        System.out.println("class E Inherits operation1 from class B");
        return 0;
    }

    @Override
    public float operation2(float f) {//1the method is should do something differnet that class D
        System.out.println("class E Inherits ooperation2 from class B");
        return 0;
    }
// 0 missing setters and getters
}
