import java.util.*;
import java.text.*;
public class Work1_2 {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#.##");
		Scanner kb = new Scanner(System.in);
		System.out.println("***Main Menu***");
		int ch;
		double ans,r;
		System.out.println("1 : พื้นที่วงกลม");
		System.out.println("2 : ความยาวเส้นรอบวง");
		System.out.println("3 : ปริมาตรทรงกลม");
		System.out.print("Choose your choice : ");
		ch = kb.nextInt();
		System.out.println("***********************");
		System.out.print("Input Radius : ");
		r = kb.nextDouble();
		switch(ch) {
		case 1:
			ans=Math.PI*Math.pow(r, 2);
			System.out.println("Result = "+f.format(ans));
			break;
		case 2:
			ans=2*Math.PI*r;
			System.out.println("Result = "+f.format(ans));
			break;
		case 3:
			ans=(4/3)*Math.PI*Math.pow(r, 3);
			System.out.println("Result = "+f.format(ans));
			break;
		}

	}

}
