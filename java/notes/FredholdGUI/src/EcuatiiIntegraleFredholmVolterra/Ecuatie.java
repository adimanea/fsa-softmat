package EcuatiiIntegraleFredholmVolterra;

/**
 * Clasa care contine functia f
 */
public class Ecuatie {
    /**
     * Functia f
     *
     * @param x
     * @return rezultatul functiei in punctele x
     */
    public static double f(double x) {
        /* pi*x/50*(cos(alfa*pi)-1)+sin(alfa*x) */
        return (Math.PI * x / 50 * (Math.cos(3 * Math.PI) - 1) + Math.sin(3 * x));
    }
}
