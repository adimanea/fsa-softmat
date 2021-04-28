package PachetTeme;

public class Ex2 {
    protected String[] materii = new String[10];

    public Ex2(String[] materii) {
        this.materii = materii;
    }

    public void printareIndex() {
        for (int i = 0; i < materii.length; ++i) {
            if (materii[i] == "Programare java si software matematic") {
                System.out.println("Pozitia Programare java si software matematic este " + i);
            }
        }
    }
}
