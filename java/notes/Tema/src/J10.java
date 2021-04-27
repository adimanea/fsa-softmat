import java.io.IOException;
import java.io.InputStreamReader;

public class J10 {
	protected char[] caracter = new char[100];
	protected int lungime;

	public J10() throws IOException {
		InputStreamReader reader = null;
		System.out.println("Lungimea = ");
		try {
			reader = new InputStreamReader(System.in);
			lungime = reader.read();
			for (int i = 0; i < lungime; i++) {
				caracter[i] = (char) reader.read();
				System.out.println(caracter[i]);
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

	}
}