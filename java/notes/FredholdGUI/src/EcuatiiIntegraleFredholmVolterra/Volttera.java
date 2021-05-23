package EcuatiiIntegraleFredholmVolterra;

import java.util.LinkedList;

/**
 * Aceasta clasa ofera o metoda de rezolvare a ecuatiei Volttera
 */
public class Volttera extends FredholmVolttera {

    /**
     * Constructorul implicit pentru ecuatia Volttera
     */
    public Volttera() {
        i = 10;
        n = 5;
    }

    /**
     * Functia care inglobeaza toate calculele necesare
     */
    public void calculareTotala() {
        for (int coef = 5; coef < n + 5; ++coef) {
            h = (double) n / ((double) i * (double) coef);

            initializareX();

            list = new LinkedList<>();
            initializareLista();
            list.set(0, Ecuatie.f(x.get(0)));
            list.set(1, (h / 2 * Nucleu.k(x.get(1), x.get(0)) * list.get(0) + Ecuatie.f(x.get(1))) / (1 - h / 2 * Nucleu.k(x.get(1), x.get(1))));

            calculareMatriceU();

            u.add(coef - 5, list);
            x.clear();
        }
    }

    /**
     * Functia de calcul total al matricei u
     * Se foloseste functia matematica f(x) si nucleul K(x, y)
     *
     * @see EcuatiiIntegraleFredholmVolterra.Ecuatie#f(double)
     * @see EcuatiiIntegraleFredholmVolterra.Nucleu#k(double, double)
     */
    private void calculareMatriceU() {
        for (int counter1 = 2; counter1 < i; ++counter1) {
            list.set(counter1, Ecuatie.f(x.get(counter1)) + h / 2 * Nucleu.k(x.get(counter1), x.get(0)) * list.get(0));
            for (int counter2 = 1; counter2 < i - 1; ++counter2) {
                list.set(counter1, list.get(counter1) + h * Nucleu.k(x.get(counter1), x.get(counter2)) * list.get(counter2));
            }
            list.set(counter1, list.get(counter1) / (1 - h / 2 * Nucleu.k(x.get(counter1), x.get(counter1))));
        }
    }

    /**
     * Functia care initializeaza o lista utilitara cu 0
     */
    private void initializareLista() {
        for (int e = 0; e < i + 1; ++e) {
            list.add(0.0);
        }
    }

    /**
     * Functia de initializare a variabilei x din functia f(x)
     *
     * @see EcuatiiIntegraleFredholmVolterra.Ecuatie#f(double)
     */
    private void initializareX() {
        double e = 0;
        for (int pozitie = 0; pozitie <= i; ++pozitie) {
            x.add(pozitie, e);
            e += h;
        }
    }
}
