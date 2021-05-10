import org.mariuszgromada.math.mxparser.*;

public class DemoUserDefinedFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//functie definita de utilizator
		Function f1 = new Function("f1", "x^2", "x");
		Expression e1 = new Expression("f1(2)", f1);
		//aceeasi functie definita de utilzator insa mai consumatoare de resurser
		Function f2 = new Function("f2(x) = x^2");
		Expression e2 = new Expression("f2(2)", f2);
		//functie cu mai multi parametrii
		Function f3 = new Function("f3(a, b, c) = a+b+c");
		Expression e3 = new Expression("f3(1,2,3)", f3);
		//functie in functie
		Function g = new Function("g(x) = 2*x");
		Function f4 = new Function("f4(x) = g(x)^2", g);
		         		
		mXparser.consolePrintln("Res 1: " + e1.getExpressionString() + " = " + e1.calculate());
		mXparser.consolePrintln("Res 2: f1(5) = " + f1.calculate(5));
		
		mXparser.consolePrintln("Res 1: " + e2.getExpressionString() + " = " + e2.calculate());
		mXparser.consolePrintln("Res 2: f2(5) = " + f2.calculate(5));
		
		mXparser.consolePrintln("Res 1: " + e3.getExpressionString() + " = " + e3.calculate());
		mXparser.consolePrintln("Res 2: f3(1,2,3) = " + f3.calculate(1,2,3));
		
		mXparser.consolePrintln("Res 1: g(1) = " + g.calculate(1));
		mXparser.consolePrintln("Res 2: f4(1) = " + f4.calculate(1));
	}

}
