package PachetTeme;

public class Ex2 {
    protected String[] Materii = new String[10];

    public Ex2(String[] materii) {
        Materii = materii;
    }

    public void PrintareIndex() {
        for (int i = 0; i < Materii.length; ++i) {
            if (Materii[i] == "Programare java si software matematic") {
                System.out.println("Pozitia Programare java si software matematic este " + i);
            }
        }
    }
}
