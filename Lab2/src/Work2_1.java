import java.util.*;
import java.text.*;
public class Work2_1 {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("0.00");
		Scanner kb = new Scanner(System.in);
		System.out.println("*******�ӹǳ�Ҿ�鹷��ˡ���������ҹ���********");
		System.out.print("������Ǵ�ҹ : ");
		double x = kb.nextDouble();
		System.out.println("*******************************");
		double ans1 = Math.pow(x, 2);
		double ans2 = Math.sqrt(3);
		double result = 6*(ans1/4)*ans2;
		System.out.println("��鹷��ˡ���������ҹ��� :"+f1.format(result));
		

	}

}
