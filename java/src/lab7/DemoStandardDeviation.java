import org.mariuszgromada.math.mxparser.*;
public class DemoStandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression e = new Expression("std(1,3,5,7,9,11,13,15,17,19,21,23,25)");

		mXparser.consolePrintln("Res: " + e.getExpressionString() + " = " + e.calculate());
	}

}
