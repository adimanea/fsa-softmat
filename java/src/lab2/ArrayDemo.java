package lab2;

class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        int[] anotherArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        System.out.println(anotherArray[0]);
        String[][] names = {
        {"Mr. ", "Mrs. ", "Ms. "},
        {"Smith", "Jones"}
        };
        System.out.println(names[0][0]+names[1][0]);
        char[] copyFrom = {'a', 'F', 'S', 'A', 'M', 'a', 's', 't', 'e', 'r', 'a', 'b', 'c'};
        // please use this new char Array local variable as input for the last exercise described in the Lab1 notes
        /* Create
		a new array from one that is created and initialized using
		java.util.Array class methods (using the properties of IDE and Java 
		API) */
    }

  
};

