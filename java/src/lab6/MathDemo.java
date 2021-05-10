package lab6;

import java.util.Scanner;

public class MathDemo {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		//Basic Math Functions
		System.out.println ("Va rugam sa introduceti un numar intreg");
		int i = in.nextInt();
		System.out.println("Valoarea absoluta este " + Math.abs(i));
		System.out.println("Va rog sa ma introdueti un numar intre");
		int j = in.nextInt();
		System.out.println(Math.abs(i) + " modulo "+Math.abs(j)+" este "+Math.abs(j)%Math.abs(j));
		System.out.println("Maximum dintre " +i+ " si "+j+" este "+Math.max(i, j));
		System.out.println("Minimum dintre " +i+ " si "+j+" este "+Math.min(i, j));
		System.out.println ("Va rugam sa introduceti un numar real");
		double d = in.nextDouble();
		System.out.println("Valoarea rotunjita in sus este " + (int)Math.ceil(d));
		System.out.println("Valoarea rotunjita in jos este " + (int)Math.floor(d));
		System.out.println("Valoarea rotunjita este " + (int)Math.floor(d));
		System.out.println("un numar generat de 2 digiti este " + Math.round(Math.random()*100));
		
		//Exponential and Logarithmic Math Functions
		System.out.println("Introduceti doua numere");
		double b = in.nextDouble();
		double e = in.nextDouble();
		System.out.println(b+" la puterea "+e+" este "+Math.pow(b, e));
		System.out.println("Radical din "+b+" este "+Math.sqrt(b));
		System.out.println("Radical din "+e+" este "+Math.sqrt(e));
		System.out.println("logaritm in baza 10 a lui "+e+" este "+Math.log10(e));
		System.out.println("logaritm in baza 10 a lui "+b+" este "+Math.log10(b));
		System.out.println("logaritm natural a lui "+e+" este "+Math.log(e));
		System.out.println("logaritm natural a lui "+b+" este "+Math.log(b));
		
		//Trigonometric Math Functions
		double degrees = Math.toDegrees(Math.PI);
		System.out.println("degrees = " + degrees);
		double radians = Math.toRadians(180);
		System.out.println("radians = " + radians);
		System.out.println("Sinusul unui unghi de 90 de grade este "+Math.sin(Math.toRadians(90)));
		System.out.println("Cosinusul unui unghi de 90 de grade este "+Math.cos(Math.toRadians(90)));
		System.out.println("Tangenta unui unghi de 90 de grade este " + Math.tan(Math.toRadians(90)));
		
		in.close();
	}
}
