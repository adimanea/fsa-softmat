
public class J6 extends J3 {

	public J6(Integer[] vector) {
		super(vector);
		
	}
public void SumaImpare() {
	int i=0;
	Integer Suma=0;
	do {
		if(Vector[i]%2!=0) {
			Suma=Suma + Vector[i];
		}
		i++;
		
	}while(i<Vector.length);
		System.out.println("Suma nr.impare este : " + Suma);
}
}
