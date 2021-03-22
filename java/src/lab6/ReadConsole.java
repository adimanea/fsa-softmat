package lab6;

import java.io.*;

public class ReadConsole {

	public static void main(String[] args) throws IOException {
		// Citesc de la tastatura caractere si le afisez pana cand se tasteaza caracterul q
		InputStreamReader cin = null;
	    try {
	    	cin = new InputStreamReader (System.in);
	        System.out.println("Enter characters, 'q' to quit.");
	        char c;
	        do {
	             c = (char) cin.read();
	             System.out.print(c);
	        } while(c != 'q');
	      }finally {
	          if (cin != null) {
	             cin.close();
	          }
	      }

	}

}
