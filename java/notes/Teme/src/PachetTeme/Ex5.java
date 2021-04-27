package PachetTeme;

public class Ex5 extends Ex3 {
    public Ex5(Integer[] numere) {
        super(numere);
    }

    public void PrintareSuma() {
        int i = 0;
        Integer Suma = 0;
        while (i < Numere.length) {
            Suma += Numere[i];
            ++i;
        }
        System.out.println("Suma este " + Suma);
    }
}
