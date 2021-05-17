package EcuatiiIntegraleFredholmVolterra;

import java.util.LinkedList;

public class Volttera extends FredholmVolttera {

    public Volttera() {
        i = 100;
        n = 10;
    }

    public void calculareTotala() {
        for (int coef = 5; coef < n + 5; ++coef) {
            h = (double) n / ((double) i * (double) coef);
            calculX();
            LinkedList<Double> list = new LinkedList<Double>();
            for (int e = 0; e < i + 1; ++e) {
                list.add(0.0);
            }
            list.set(0, Ecuatie.f(x.get(0)));
            list.set(1, (h / 2 * Nucleu.k(x.get(1), x.get(0)) * list.get(0) + Ecuatie.f(x.get(1))) / (1 - h / 2 * Nucleu.k(x.get(1), x.get(1))));
            for (int counter1 = 2; counter1 < i; ++counter1) {
                list.set(counter1, Ecuatie.f(x.get(counter1)) + h / 2 * Nucleu.k(x.get(counter1), x.get(0)) * list.get(0));
                for (int counter2 = 1; counter2 < i - 1; ++counter2) {
                    list.set(counter1, list.get(counter1) + h * Nucleu.k(x.get(counter1), x.get(counter2)) * list.get(counter2));
                }
                list.set(counter1, list.get(counter1) / (1 - h / 2 * Nucleu.k(x.get(counter1), x.get(counter1))));
            }
            u.add(coef - 5, list);
            //list.clear();
            x.clear();
        }
    }

    private void calculX() {
        double e = 0;
        for (int pozitie = 0; pozitie < i; ++pozitie) {
            x.add(pozitie, e);
            e += h;
        }
    }
}
