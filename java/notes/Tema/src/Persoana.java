
public class Persoana {
	protected String Nume;
	protected Integer Varsta;
	protected Long CNP;

	public Persoana(String nume, Integer varsta, Long cnp) {
		Nume = nume;
		Varsta = varsta;
		CNP = cnp;

	}

	public void Printare() {
		System.out.println("Ma cheama " + Nume + ", am " + Varsta + " ani, iar CNP-ul meu este " + CNP);
	}
}