package EcuatiiIntegraleFredholmVolterra;

import java.util.LinkedList;

public class Volttera extends FredholmVolttera {

    public Volttera() {
        i = 100;
        n = 10;
        for (int e = 0; e < i + 1; ++e) {
            x.add((double) e);

        }
    }

    public void calculareTotala() {
        for (int coef = 5; coef < 10; ++coef) {
            //i = i * coef;
            h = n / i;
            LinkedList<Double> list = new LinkedList<Double>();
            for (int e = 0; e < i + 1; ++e) {
                list.add((double) e);
            }
            list.add(Ecuatie.f(x.get(0)));
            list.add((h / 2 * Nucleu.k(x.get(1), x.get(0)) * list.get(0) + Ecuatie.f(x.get(1))) / (1 - h / 2 * Nucleu.k(x.get(1), x.get(1))));
            for (int counter1 = 2; counter1 < i; ++counter1) {
                list.add(Ecuatie.f(x.get(counter1)) + h / 2 * Nucleu.k(x.get(counter1), x.get(0)) * list.get(0));
                for (int counter2 = 1; counter2 < i - 1; ++counter2) {
                    list.set(counter2, list.get(counter2) + h * Nucleu.k(x.get(counter1), x.get(counter2)) * list.get(counter2));
                }
                list.set(counter1, list.get(counter1) / (1 - h / 2 * Nucleu.k(x.get(counter1), x.get(counter1))));
            }
            u.add(list);
        }
    }
}
