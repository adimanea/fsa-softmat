package EcuatiiIntegraleFredholmVolterra;

public class Volttera extends FredholmVolttera {

    /*public Volttera() {
        i = 100;
        n = 10;
        for (int e = 0; e < i + 1; ++e) {
            x.add(e);
        }
    }

    public void calculareTotala() {
        for (int coef = 5; coef < 15; ++coef) {
            //i = i * coef;
            h = n / i;
            u[coef - 5][0] = Ecuatie.f(x[0]);
            u[coef - 5][1] = (h / 2 * Nucleu.k(x[1], x[0]) * u[coef - 5][0] + Ecuatie.f(x[1])) / (1 - h / 2 * Nucleu.k(x[1], x[1]));

            for (int counter1 = 2; counter1 < i; ++counter1) {
                u[coef - 5][counter1] = Ecuatie.f(x[counter1]) + h / 2 * Nucleu.k(x[counter1], x[0]) * u[coef - 5][0];
                for (int counter2 = 1; counter2 < i - 1; ++counter2) {
                    u[coef - 5][counter2] = u[coef - 5][counter2] + h * Nucleu.k(x[counter1], x[counter2]) * u[coef - 5][counter2];
                }
                u[coef - 5][counter1] = u[coef - 5][counter1] / (1 - h / 2 * Nucleu.k(x[counter1], x[counter1]));
            }
        }
    }*/
}
