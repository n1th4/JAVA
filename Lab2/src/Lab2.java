import java.text.*;
import java.util.*;
public class Lab2 {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("0.00");
		Scanner kb = new Scanner (System.in);
		System.out.print("Input:");
		double r = kb.nextDouble();
		double result = Math.PI*Math.pow(r, 2);
		System.out.print("result = "+f1.format(result));
		

	}

}
