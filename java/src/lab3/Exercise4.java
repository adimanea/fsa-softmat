package lab3;

/*
 public class Exercise4 {
 
	public static void main (String[] args) {
		int count = 1;
        do  {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
        
	}

}
*/

/*public class Exercise4 {
	public static void main (String[] args) {
        for ( int count =1; count<11;count++){
            System.out.println("Count is: " + count);
        }
	}

}*/

public class Exercise4 {
	public static void main (String[] args) {
		int[] count = new int [11];
		int i=0;
		for (i=1;i<=10;i++) count[i]=i;
        for (i=1;i<=10;i++){
            System.out.println("Count is: " + count[i]);
        }
	}

}
