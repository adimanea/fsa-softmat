
package lab1;

import lab2.*;

public class myapp2 {
	public static void main (String [] args) {
		FSABicycle b1 = new FSABicycle();
		b1.changeCadence(50);
		b1.speedUp(10);
		b1.changeGear(2);
		b1.printStates();
	}
}