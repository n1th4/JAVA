import java.util.*;
import java.text.*;
public class Work2_2 {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("0.0000");
		DecimalFormat f2 = new DecimalFormat("0.000");
		DecimalFormat f3 = new DecimalFormat("#.0000");
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a : ");
		double a =kb.nextDouble();
		System.out.print("Input b : ");
		double b = kb.nextDouble();
		System.out.print("Input c : ");
		double c = kb.nextDouble();
		double ans1 = Math.sqrt((a*b));
		double ans2 = Math.pow(c, 2);
		double result = ans1/ans2;
		System.out.println("\n=======result======\n");
		System.out.println("DecimalFormat A : "+f1.format(result));
		System.out.println("DecimalFormat B : "+f2.format(result));
		System.out.println("DecimalFormat C : "+f3.format(result));
	}

}
