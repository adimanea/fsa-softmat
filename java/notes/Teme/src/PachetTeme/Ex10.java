package PachetTeme;

import java.util.Scanner;

public class Ex10 {
    protected char[] cuvant = new char[100];
    protected int lungime = 0;

    public Ex10() {
        Scanner console = new Scanner(System.in);
        System.out.println("Dati lungimea");
        lungime = console.nextInt();
        System.out.println(lungime);
        int i = 0;
        do {
            cuvant[i] = console.next().charAt(0);
            System.out.println(cuvant[i]);
            ++i;
        } while (i < lungime);
    }
}

