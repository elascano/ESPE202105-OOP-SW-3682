/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class SortingStrategy {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    @Override
    public String toString() {
        return "SortingStrategy{" + "num1=" + getNum1() + ", num2=" + getNum2() + ", num3=" + getNum3() + ", num4=" + getNum4() + ", num5=" + getNum5() + '}';
    }

    public SortingStrategy(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the num3
     */
    public int getNum3() {
        return num3;
    }

    /**
     * @param num3 the num3 to set
     */
    public void setNum3(int num3) {
        this.num3 = num3;
    }

    /**
     * @return the num4
     */
    public int getNum4() {
        return num4;
    }

    /**
     * @param num4 the num4 to set
     */
    public void setNum4(int num4) {
        this.num4 = num4;
    }

    /**
     * @return the num5
     */
    public int getNum5() {
        return num5;
    }

    /**
     * @param num5 the num5 to set
     */
    public void setNum5(int num5) {
        this.num5 = num5;
    }
}
