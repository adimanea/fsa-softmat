package PachetTeme;

public class Ex5 extends Ex3 {
    public Ex5(Integer[] numere) {
        super(numere);
    }

    public void printareSuma() {
        int i = 0;
        Integer suma = 0;
        while (i < numere.length) {
            suma += numere[i];
            ++i;
        }
        System.out.println("Suma este " + suma);
    }
}
