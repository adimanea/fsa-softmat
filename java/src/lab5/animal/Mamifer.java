package animal;

public class Mamifer implements Animal {


		public void eat() {
		      System.out.println("Manifer eats");
		   }

		   public void travel() {
		      System.out.println("Manifer travels");
		   } 

		   public int noOfLegs() {
		      return 0;
		   }

		   public static void main(String args[]) {
		      Mamifer m = new Mamifer();
		      m.eat();
		      m.travel();
		   }
}



