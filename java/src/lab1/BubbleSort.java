package lab1;

import java.util.Scanner;

public class BubbleSort {
	
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
       
        

        i = 0;
        System.out.println("Sirul rezultat este:");
        do{
            System.out.print(toBeSortedArray[i] + " ");
            ++i;
        }while(i < arrayLength);
        in.close();
    }
    
	

	

}

//Sortarea descrescatoare prin Bubblesort functioneaza astfel:
//se declara un vector "i", care parcurge sirul incepand cu primul element pana la penultimul
//prin acesta comparam pe perechi, pe rand, elementul de pe pozitia "i" cu elementul de pe pozitia urmatoare, "i+1", atat timp cat elementul boolean "sorted" este "false"
//la fiecare iteratie, daca valoarea elementului de pe pozitia initiala "i" este mai mare decat elementul de pe pozitia urmatoare, "i+1", se produce interschimbarea
//interschimbarea se face cu ajutorul elementului temporar "temp" astfel: "temp" ia valoarea "a[i]", "a[i]" ia valoarea "a[i+1]" pentru ca apoi "a[i+1]" sa ia valoarea lui "temp"
//cat timp se va produce o interschimbare intr-o iteratie, functia "for" va relua de la inceput parcurgerea sirului, iar elementele vor fi comparate din nou
//astfel elementul boolean "sorted" va ramane cu valoarea "false" si acestea vor continua pana cand sirul va fi sortat descrescator
//in momentul in care, dupa parcurgerea sirului, nu se gaseste niciun element mai mare decat urmatorul, nu se va produce nicio interschimbare 
//boolean-ul "sorted" va ramane cu valoarea "true" si nu se va mai parcurge sirul
//exemplu: 
//sirul 2 4 3 1 5 se transforma astfel: 4 2 3 1 5 > 4 3 2 1 5 > 4 3 2 5 1 (rezultatul dupa ce functia "for" a parcurs tot sirul)
//apoi functia "for" reia sirul din nou deoarece a fost produsa o interschimbare in iteratia anterioara, astfel: 4 3 5 2 1 > 4 5 3 2 1 > 5 4 3 2 1
//se mai compara inca o data elementele si deoarece nu se mai produce nicio interschimbare, functia "for" nu mai itereaza
//deoarece "for"-ul nu mai itereaza, "sorted" pastreaza valoarea "true" si astfel nici functia "while" nu mai itereaza
//rezultatul este sirul ordonat descrescator
