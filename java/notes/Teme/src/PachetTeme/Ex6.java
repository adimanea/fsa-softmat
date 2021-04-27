package PachetTeme;

public class Ex6 extends Ex3 {
    public Ex6(Integer[] numere) {
        super(numere);
    }

    public void SumaImpare() {
        int i = 0;
        Integer SumaImpare = 0;
        do {
            if (Numere[i] % 2 != 0) {
                SumaImpare += Numere[i];
            }
            ++i;
        } while (i < Numere.length);
        System.out.println("Suma imparelor este " + SumaImpare);
    }
}
