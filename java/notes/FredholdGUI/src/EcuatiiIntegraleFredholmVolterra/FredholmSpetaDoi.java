package EcuatiiIntegraleFredholmVolterra;

import java.util.LinkedList;

/**
 * Aceasta clasa ofera o metoda de rezolvare a ecuatiei Fredholm de speta II
 */
public class FredholmSpetaDoi extends FredholmVolttera {

    private LinkedList<Double> Val;

    /**
     * Constructorul implicit pentru ecuatia FredholmSpetaDoi
     */
    public FredholmSpetaDoi() {
        a = 0;
        b = Math.PI;
        n = 5;
        i = 10;
        h = (b - a) / (double) i;
    }

    /**
     * Constructorul explicit pentru ecuatia FredholmSpetaDoi
     *
     * @param a capatul inferior al integralei
     * @param b capatul superior al integralei
     * @param n numarul de iteratii
     * @param i numarul de pasi
     */
    public FredholmSpetaDoi(double a, double b, int n, int i) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.i = i;
    }

    /**
     * Functia de initializare a variabilei x din functia f(x)
     *
     * @see EcuatiiIntegraleFredholmVolterra.Ecuatie#f(double)
     */
    private void initializareX() {
        x.add(0, a);
        double e = h;
        for (int counter = 1; counter <= i; ++counter) {
            x.add(counter, e);
            e += h;
        }
    }

    /**
     * Functia de initializare a iteratiei 1 a matricei u
     *
     * @see EcuatiiIntegraleFredholmVolterra.Ecuatie#f(double)
     */
    private void initializareU() {
        LinkedList<Double> lista = new LinkedList<>();
        for (int counter = 0; counter < i; ++counter) {
            lista.add(counter, Ecuatie.f(x.get(counter)));
        }
        u.add(0, lista);

        for (int counter1 = 1; counter1 <= n; ++counter1) {
            lista = new LinkedList<>();
            for (int counter = 0; counter < i; ++counter) {
                lista.add(counter, 0.0);
            }
            u.add(counter1, lista);
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
            list = new LinkedList<>();
            for (int counter2 = 0; counter2 < i; ++counter2) {
                Val = new LinkedList<>();
                for (int counter3 = 0; counter3 < i; ++counter3) {
                    Val.add(counter3, Nucleu.k(x.get(counter2), x.get(counter3)) * u.get(counter1).get(counter3));
                }
                list.add(counter2, trapz(x.get(counter2), Val.get(counter2)) + Ecuatie.f(x.get(counter2)));
            }
            u.set(counter1 + 1, list);
        }
    }

    /**
     * Functia de calcul a integralelor prin metoda trapezului
     *
     * @param x   variabila integrala
     * @param val variabila integrala
     * @return rezultatul integralei cu capetele a si b
     */
    private double trapz(double x, double val) {
        double sum = 0.5 * (Ecuatie.f(x) + Ecuatie.f(val));
        for (int counter = 0; counter < n; counter++) {
            double xx = x + h * counter;
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
