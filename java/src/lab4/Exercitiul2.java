
package lab4;

//un exemplu de utilizare a metodei sort expusa de clasa de obiecte Arrays
//de comparat cat de usor este refolosirea codului in Java fata de scrierea unei metode similare (exercitiul ArraySort din Labul3

import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Exercitiul2 {

	public static void main(String[] args) {
		Random rd = new Random();//creeaza obiectul Random
		int[] arr = new int[20];//generam un vector de 20 de elemente
		for (int i = 0; i < arr.length; i++){
			arr[i] = Math.abs(rd.nextInt()%100);
			//populam vectorul cu numere de la 0 la 99
			System.out.print(arr[i] + ",");
			//afisam fiecare element
		}
		Arrays.sort(arr);//apelam functia de sortare
		System.out.println("\nNumerele ordonate crescator.");
		for(int i = 0; i < arr.length;i++){
			System.out.print(" "+arr[i]);//afisam elementele sortate
		}
	}
}
