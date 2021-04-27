
public class J5 extends J3 {

	public J5(Integer[] vector) {
		super(vector);
		
	}
	
	public void PrintareSuma() {
		int i=0;
		Integer Suma=0;
		while (i<Vector.length) {
			Suma=Suma + Vector[i];
			i++;
		}
		System.out.println("Suma este : " + Suma);
	}
}
