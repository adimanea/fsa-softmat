package EcuatiiIntegraleFredholmVolterra;


/**
 * Aceasta clasa ofera o metoda de rezolvare
 * a ecuatiei Fredholm de speta I
 */
public class FredholmSpetaUnu extends Fredholm {

    /**
     * Constructorul implicit pentru ecuatia FredholmSpetaUnu
     */
    public FredholmSpetaUnu() {
        a = 0;
        b = Math.PI;
        n = 5;
        i = 100;
        h = (b - a) / i;
        x = new double[i + 1];
        u = new double[n + 1][i + 1];
        val = new double[i + 1];
    }

    /**
     * Constructorul explicit pentru ecuatia FredholmSpetaUnu
     *
     * @param a capatul inferior al integralei
     * @param b capatul superior al integralei
     * @param n numarul de iteratii
     * @param i numarul de pasi
     */
    public FredholmSpetaUnu(double a, double b, int n, int i) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.i = i;
    }

    /**
     * Getter pentru rezultatul final
     *
     * @return matricea U care contine rezultatele pentru fiecare iteratie
     */
    public double[][] getU() {
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

    /**
     * Functia de initializare a variabilei x din functia f(x)
     *
     * @see EcuatiiIntegraleFredholmVolterra.Ecuatie#f(double)
     */
    private void initializareX() {
        x[0] = a;
        for (int counter = 0; counter < i; ++counter) {
            x[counter + 1] = x[counter] + h;
        }
    }

    /**
     * Functia de initializare a iteratiei 1 a matricei u
     *
     * @see EcuatiiIntegraleFredholmVolterra.Ecuatie#f(double)
     */
    private void initializareU() {
        for (int counter = 0; counter < i; ++counter) {
            u[0][counter] = Ecuatie.f(x[counter]);
        }
    }

    /**
     * Functia de calcul total al matricei u
     * Se foloseste functia matematica f(x) si nucleul K(x, y)
     *
     * @see EcuatiiIntegraleFredholmVolterra.Ecuatie#f(double)
     * @see EcuatiiIntegraleFredholmVolterra.Nucleu#k(double, double)
     */
    private void calculRezultat() {
        for (int counter1 = 0; counter1 < n; ++counter1) {
            for (int counter2 = 0; counter2 < i; ++counter2) {
                for (int counter3 = 0; counter3 < i; ++counter3) {
                    val[counter3] = Nucleu.k(x[counter2], x[counter3]) * u[counter1][counter3];
                }
                u[counter1 + 1][counter2] = trapz(x[counter2], val[counter2]) + Ecuatie.f(x[counter2]);
            }
        }

    }

    /**
     * Functia de calcul a integralelor prin metoda trapezului
     *
     * @param x variabila integrala
     * @param val variabila integrala
     * @return rezultatul integralei cu capetele a si b
     */
    private double trapz(double x, double val) {
        double sum = 0.5 * (Ecuatie.f(x) + Ecuatie.f(val));
        for (int ii = 0; ii < n; ii++) {
            double xx = x + h * ii;
            sum = sum + Ecuatie.f(xx);
        }
        return sum * h;
    }

    /**
     * Functia care inglobeaza toate calculele necesare
     */
    public void calculareTotala() {
        initializareX();
        initializareU();
        calculRezultat();
    }
}
