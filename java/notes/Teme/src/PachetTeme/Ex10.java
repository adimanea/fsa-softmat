package PachetTeme;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
    protected char[] cuvant = new char[100];
    protected int lungime;

    public Ex10() throws IOException {
        InputStreamReader reader = null;
        System.out.println("Dati lungimea");
        try {
            reader = new InputStreamReader(System.in);
            lungime = reader.read();
            for (int i = 0; i < lungime; ++i) {
                cuvant[i] = (char) reader.read();
                System.out.println(cuvant[i]);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
