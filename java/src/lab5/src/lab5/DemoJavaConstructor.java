package lab5;

public class DemoJavaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgument o1 = new NoArgument();
		Parametrized o2 = new Parametrized (10);
		System.out.println("Caracteristica obiectului o1 este "+o1.num + " si caracteristica obiectului o2 este " + o2.num);
	}

}
