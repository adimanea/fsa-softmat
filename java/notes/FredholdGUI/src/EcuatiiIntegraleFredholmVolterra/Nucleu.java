package EcuatiiIntegraleFredholmVolterra;

/**
 * Clasa care contine nucleul ecuatiei
 */
public class Nucleu {
    /**
     * Nucleul ecuatiei
     *
     * @param x variabila nucleu
     * @param y variabila nucleu
     * @return rezulatul nucleului in x si y
     */
    public static double k(double x, double y) {
        /* p=x*y/25; */
        //return (x * y / 50);
        return Math.sin(x - y);
    }
}
