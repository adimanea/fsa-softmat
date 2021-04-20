package EcuatiiIntegraleFredholmVolterra;

import java.util.LinkedList;

public abstract class FredholmVolttera {
    protected double a;
    protected double b;
    protected int n;
    protected int i;
    protected double h;
    protected LinkedList<Double> x = new LinkedList<Double>();
    protected LinkedList<LinkedList<Double>> u = new LinkedList<LinkedList<Double>>();

    /**
     * Getter pentru rezultatul final
     *
     * @return matricea U care contine rezultatele pentru fiecare iteratie
     */
    public LinkedList<LinkedList<Double>> getU() {
        return u;
    }

    /**
     * Getter valoare a
     *
     * @return capatul inferior al integralei
     */
    public double getA() {
        return a;
    }

    /**
     * Setter valoare a
     *
     * @param a capatul inferior al integralei
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Setter valoare b
     *
     * @return capatul superior al integralei
     */
    public double getB() {
        return b;
    }

    /**
     * Setter b
     *
     * @param b capatul superior al integralei
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Getter n
     *
     * @return numarul de iteratii
     */
    public int getN() {
        return n;
    }

    /**
     * Setter n
     *
     * @param n numarul de iteratii
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * Getter i
     *
     * @return numarul de pasi
     */
    public int getI() {
        return i;
    }

    /**
     * Setter i
     *
     * @param i numarul de pasi
     */
    public void setI(int i) {
        this.i = i;
    }


}
