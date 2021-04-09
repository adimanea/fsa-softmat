package EcuatiiIntegraleFredholmVolterra;

public abstract class Fredholm {
    protected double a;
    protected double b;
    protected int n;
    protected int i;
    protected double h;
    protected double[] x;
    protected double[][] u;
    protected double[] val;

    public abstract double getA();

    public abstract void setA(double a);

    public abstract double getB();

    public abstract void setB(double b);

    public abstract int getN();

    public abstract void setN(int n);

    public abstract int getI();

    public abstract void setI(int i);


}
