import java.util.*;
import java.text.*;
public class Work2_1 {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("0.00");
		Scanner kb = new Scanner(System.in);
		System.out.println("*******คำนวณหาพื้นที่หกเหลี่ยมด้านเท่า********");
		System.out.print("ความยาวด้าน : ");
		double x = kb.nextDouble();
		System.out.println("*******************************");
		double ans1 = Math.pow(x, 2);
		double ans2 = Math.sqrt(3);
		double result = 6*(ans1/4)*ans2;
		System.out.println("พื้นที่หกเหลี่ยมด้านเท่า :"+f1.format(result));
		

	}

}
