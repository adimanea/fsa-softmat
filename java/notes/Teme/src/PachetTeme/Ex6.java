package PachetTeme;

public class Ex6 extends Ex3 {
    public Ex6(Integer[] numere) {
        super(numere);
    }

    public void sumaImpare() {
        int i = 0;
        Integer sumaImpare = 0;
        do {
            if (numere[i] % 2 != 0) {
                sumaImpare += numere[i];
            }
            ++i;
        } while (i < numere.length);
        System.out.println("Suma imparelor este " + sumaImpare);
    }
}
