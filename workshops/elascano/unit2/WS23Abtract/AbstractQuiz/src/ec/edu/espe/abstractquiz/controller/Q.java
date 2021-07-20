/** Copyright ESPE-DECC
 */
package ec.edu.espe.abstractquiz.controller;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Q implements PI {

    @Override
    public int m(int i) {
        System.out.println("method m(int i) ");
        return i;
    }

    @Override
    public int m(float f) {
        System.out.println("method m(float f) ");
        return (int) f;
    }

    @Override
    public void m2() {
        System.out.println("method m2() ");
    }

    @Override
    public void m3(int a, int b, float f) {
        System.out.println("method m3(int a, int b, float f) ");
    }

}
