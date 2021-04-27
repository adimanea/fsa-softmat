package lab5;

import java.util.Scanner;

public class BubbleSort {
	
	public static void Sort(int[] arr) {
	    boolean sorted = false;
	    int temp;
	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] < arr[i+1]) {
	                temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}

	
	public static void main(String[] args) {

        System.out.println("Introduceti lungimea sirului:");
		Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] toBeSortedArray = new int[arrayLength];
        int i = 0;
        
        System.out.println("Introduceti elementele:");
        while(i < arrayLength){
            toBeSortedArray[i] = in.nextInt();
           i++;
        }
       
        Sort(toBeSortedArray);

        i = 0;
        System.out.println("Sirul rezultat este:");
        do{
            System.out.print(toBeSortedArray[i] + " ");
            ++i;
        }while(i < arrayLength);
        in.close();
    }
}
