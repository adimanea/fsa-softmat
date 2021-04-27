import Lab4.AudioBook;
import Lab4.Book;
import Lab4.BookDemo;
import PachetTeme.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Persoana eu = new Persoana("Marius", 25, 2890523528181L);
        eu.Printare();
        System.out.println('\n');

        Ex2 ex2 = new Ex2(new String[]{
                "Metode statistice avansate pentru modelarea sistemelor haotice cu aplicatii in criptologie",
                "Matematici aplicate in realitatea virtuala",
                "Programare java si software matematic",
                "Metodologia cercetarii stiintifice",
                "Limbaje de programare pentru aplicatii pe internet"});
        ex2.PrintareIndex();
        System.out.println('\n');

        Integer[] vectorNumere = new Integer[]{
                1, 2, 3, 4, 5, 6, 10, 3234, 34234, 435663, 35345, 65734, 42342545, -234
        };
        Ex3 ex3 = new Ex3(vectorNumere);
        ex3.PrintareMaximMinim();
        System.out.println('\n');

        Ex4 ex4 = new Ex4(vectorNumere);
        ex4.PrintarePare();
        System.out.println('\n');

        Ex5 ex5 = new Ex5(vectorNumere);
        ex5.PrintareSuma();
        System.out.println('\n');

        Ex6 ex6 = new Ex6(vectorNumere);
        ex6.SumaImpare();
        System.out.println('\n');

        Automobil masina = new Automobil();
        masina.setTipMotor("Benzina");
        masina.setTractiune("Spate");
        masina.setPutere(500.00);
        System.out.println("Tip motor:" + masina.getTipMotor());
        System.out.println("Tractiune:" + masina.getTractiune());
        System.out.println("Putere:" + masina.getPutere() + " cp");
        System.out.println('\n');

        Automobil motocicleta = new Automobil();
        motocicleta.setTipMotor("Benzina");
        motocicleta.setTractiune("Integrala");
        motocicleta.setPutere(200.00);
        System.out.println("Tip motor:" + motocicleta.getTipMotor());
        System.out.println("Tractiune:" + motocicleta.getTractiune());
        System.out.println("Putere:" + motocicleta.getPutere() + " cp");

        Book book = new BookDemo("Amintiri din copilarie", 1892, "Ion Creanga");
        Book audioBook = new AudioBook("Ion Creanga", 1892, "Amintiri din copilarie", true);

        Ex10 ex10 = new Ex10();
    }
}
