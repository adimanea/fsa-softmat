package PachetTeme;

public class Ex4 extends Ex3 {

    public Ex4(Integer[] numere) {
        super(numere);
    }

    public void printarePare() {
        for (int item : numere) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }
    }
}
