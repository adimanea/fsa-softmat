package PachetTeme;

public class Ex3 {
    protected Integer[] Numere;

    public Ex3(Integer[] numere) {
        Numere = numere;
    }

    private int Maxim() {
        int maxim = Integer.MIN_VALUE;
        for (int i = 0; i < Numere.length; ++i) {
            maxim = Math.max(maxim, Numere[i]);
        }
        return maxim;
    }

    private int Minim() {
        int minim = Integer.MAX_VALUE;
        for (int i = 0; i < Numere.length; ++i) {
            minim = Math.min(minim, Numere[i]);
        }
        return minim;
    }

    public void PrintareMaximMinim() {
        System.out.println("Maximul este " + Maxim() + ", iar minimul este " + Minim());
    }
}
