package PachetTeme;

public class Ex3 {
    protected Integer[] numere;

    public Ex3(Integer[] numere) {
        this.numere = numere;
    }

    private int maxim() {
        int valoareMaxima = Integer.MIN_VALUE;
        for (int i = 0; i < numere.length; ++i) {
            valoareMaxima = Math.max(valoareMaxima, numere[i]);
        }
        return valoareMaxima;
    }

    private int minim() {
        int valoareMinima = Integer.MAX_VALUE;
        for (int i = 0; i < numere.length; ++i) {
            valoareMinima = Math.min(valoareMinima, numere[i]);
        }
        return valoareMinima;
    }

    public void PrintareMaximMinim() {
        System.out.println("Maximul este " + maxim() + ", iar minimul este " + minim());
    }
}
