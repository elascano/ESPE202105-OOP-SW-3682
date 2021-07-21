/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclasses.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class E extends B{
    
    private float p;
    private float q;

    @Override
    public String toString() {
        return "E{" + super.toString() + "p=" + p + ", q=" + q + '}';
    }

    public E(float p, float q, float f, double d) {
        super(f, d);
        this.p = p;
        this.q = q;
    }

    public int m1(boolean b){
        return 0;
    }

    @Override
    public int operation1(int n) {
        System.out.println("class E Inherits operation1 from class B");
        return 0;
    }

    @Override
    public float operation2(float f) {
        System.out.println("class E Inherits ooperation2 from class B");
        return 0;
    }

}
