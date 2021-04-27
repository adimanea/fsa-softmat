import java.io.IOException;

import lab4.AudioBook;
import lab4.Book;
import lab4.BookDemo;

public class Main {

	public static void main(String[] args) throws IOException {

		Persoana eu = new Persoana("Marghescu Cristina", 23, 2970614000000L);
		eu.Printare();

		J2 ex2 = new J2(new String[] {
				"Metode statistice avansate pentru modelarea sistemelor haotice cu aplicatii in criptologie",
				"Matematici aplicate in realitatea virtuala", "Metodologia cercetarii stiintifice",
				"Limbaje de programare pentru aplicatii pe internet", "Programare java si software matematic" });
		ex2.PrintareIndex();

		Integer[] v = new Integer[] { 31, 423, 75, 13, 75, 23, 0, 131, 53, 78, -64 };

		J3 ex3 = new J3(v);
		ex3.PrintareMaxMin();

		J4 ex4 = new J4(v);
		ex4.PrintarePare();

		J5 ex5 = new J5(v);
		ex5.PrintareSuma();

		J6 ex6 = new J6(v);
		ex6.SumaImpare();

		Automobil masina = new Automobil();
		masina.setTipMotor("motorina");
		masina.setTractiune("fata");
		masina.setPutere(100.00);
		System.out.println("Tip motor " + masina.getTipMotor());
		System.out.println("Tractiune " + masina.getTractiune());
		System.out.println("Putere " + masina.getPutere());

		Automobil motor = new Automobil();
		motor.setTipMotor("benzina");
		motor.setTractiune("integrala");
		motor.setPutere(200.00);
		System.out.println("Tip motor " + motor.getTipMotor());
		System.out.println("Tractiune " + motor.getTractiune());
		System.out.println("Putere " + motor.getPutere());

		Book book = new BookDemo("Arta de a te iubi ", 2020, "Cristian Stan");
		Book audioBook = new AudioBook("Cristian Stan", 2020, "Arta de a te iubi", true);
		
		J10 ex10 = new J10();
	}

}