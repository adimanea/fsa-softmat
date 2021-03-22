package lab3;

public class SortDescTema1 {

		public static void main (String[] args) {
			int[] sirNumere = {1,4,6,2,7,3}; 
			int i = 0;
			boolean swapped = true;
		    int j = 0;
		    int tmp;
		  //algoritm de sortare prin interschimbare BubbleSort
		    while (swapped) {
		        swapped = false;
		        j++;
		        for (i = 0; i < sirNumere.length - j; i++) {
		            if (sirNumere[i] < sirNumere[i + 1]) {
		                tmp = sirNumere[i];
		                sirNumere[i] = sirNumere[i + 1];
		                sirNumere[i + 1] = tmp;
		                swapped = true;
		               
		            }
		        }

		    }
		    System.out.println("Sirul de numere intregi ordonat descrescator este");
		// printare vector ordona descrescator
		    i=0;
		    do {
		    	System.out.print(String.valueOf(sirNumere[i])+' ');
		    	i++;
		    }while( i<sirNumere.length );
		}
	
}
