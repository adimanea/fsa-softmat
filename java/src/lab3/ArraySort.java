package lab3;
import java.util.Arrays;
public class ArraySort {
	public static void main (String[] args) {
		int[] array = {1,4,6,2,7,3}; 
		int i = 0;
		boolean swapped = true;
	    int j = 0;
	    int tmp;
	    while (swapped) {
	        swapped = false;
	        j++; //algoritm de sortare prin interschimbare
	        for (i = 0; i < array.length - j; i++) {
	            if (array[i] > array[i + 1]) {
	                tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                swapped = true;
	                for (int k=0;k<array.length;k++) System.out.print(String.valueOf(array[k])+' ');
	                System.out.println("am schimbat");
	            }
	        }
	        //System.out.println(String.valueOf(i)+" "+String.valueOf(i));
	        //for (i=0;i<array.length;i++) System.out.print(String.valueOf(array[i])+' ');
	        System.out.println("am parcurs o data");
	    }
	//          Arrays.sort(array); //second way of array sorting using sort method offered by Array package
	    for (i=0;i<array.length;i++) System.out.print(String.valueOf(array[i])+' ');
	}
}
