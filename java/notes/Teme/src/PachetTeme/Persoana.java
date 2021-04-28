package PachetTeme;

public class Persoana {
    protected String nume;
    protected int varsta;
    protected long CNP;

    public Persoana(String nume, int varsta, long CNP) {
        this.nume = nume;
        this.varsta = varsta;
        this.CNP = CNP;
    }

    public void printare() {
        System.out.println("Ma cheama " + nume + ", am " + varsta + " ani, iar CNP-ul meu este " + CNP);
    }

}
