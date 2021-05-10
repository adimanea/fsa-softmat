import org.mariuszgromada.math.mxparser.*;

public class DemoDerivatesIntegrals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//derivata lui sin(x)
		Expression e1 = new Expression("cos(1) - der(sin(x), x, 1)");
		//definirea unei functii si a uni argument
		Argument x = new Argument("x = 1");
		Expression e2 = new Expression("cos(x) - der(sin(x), x)", x);
		//integrala 
		Expression e3 = new Expression("2 * int( sqrt(1-x^2), x, -1, 1 )");
		
		mXparser.consolePrintln("Res: " + e1.getExpressionString() + " = " + e1.calculate());
		mXparser.consolePrintln("Res: " + e2.getExpressionString() + " = " + e2.calculate());
		mXparser.consolePrintln("Res: " + e3.getExpressionString() + " = " + e3.calculate());
	}

}
