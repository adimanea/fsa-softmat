import org.mariuszgromada.math.mxparser.*;

/**
 * @author Adrian
 *
 */
public class DemoBuiltInFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression e1 = new Expression("sin(2)-cos(3)");
		Expression e2 = new Expression("min(3,4) + max(-2,-1)");
		//combinatii de 10 luate cate 5
		Expression e3 = new Expression("C(10,5)");
		//suma
		Expression e4 = new Expression("sum(i,1,10,i)");
		Expression e5 = new Expression("if(3>2,1,0)");
		//cel mai mare numitor comun
		Expression e6 = new Expression("gcd(4,2,8,20)");
		Expression e7 = new Expression("iff( 1>2, 1; 3<2, 2; 5>3, 3; 7 < 3, 4 )");
		//prod
		Expression e8 = new Expression("prod(i,1,4,i)");
		//standard deviation
		Expression e9 = new Expression("stdi(x,1,10,x^2)");

		mXparser.consolePrintln("Res: " + e1.getExpressionString() + " = " + e1.calculate());
		mXparser.consolePrintln("Res: " + e2.getExpressionString() + " = " + e2.calculate());
		mXparser.consolePrintln("Res: " + e3.getExpressionString() + " = " + e3.calculate());
	    mXparser.consolePrintln("Res: " + e4.getExpressionString() + " = " + e4.calculate());
	    mXparser.consolePrintln("Res: " + e5.getExpressionString() + " = " + e5.calculate());
	    mXparser.consolePrintln("Res: " + e6.getExpressionString() + " = " + e6.calculate());
	    mXparser.consolePrintln("Res: " + e7.getExpressionString() + " = " + e7.calculate());
	    mXparser.consolePrintln("Res: " + e8.getExpressionString() + " = " + e8.calculate());
	    mXparser.consolePrintln("Res: " + e9.getExpressionString() + " = " + e9.calculate());
	}

}
