package test;

public class DemoPackageAccess {
 public static void main(String[] args) {
	Mamifer mam1 = new Mamifer();
	animal.Mamifer mam2 = new animal.Mamifer();
	System.out.println("Mamifer from package test has No of legs equal to " + mam1.noOfLegs());
	System.out.println("Mamifer from package test has No of legs " + mam2.noOfLegs());
}
}
 