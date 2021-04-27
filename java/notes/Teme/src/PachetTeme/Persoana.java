package PachetTeme;

public class Persoana {
    protected String Nume;
    protected int Varsta;
    protected long CNP;

    public Persoana(String Nume, int Varsta, long CNP) {
        this.Nume = Nume;
        this.Varsta = Varsta;
        this.CNP = CNP;
    }

    public void Printare() {
        System.out.println("Ma cheama " + Nume + ", am " + Varsta + " ani, iar CNP-ul meu este " + CNP);
    }

}
