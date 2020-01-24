import java.util.*;
public class Work4_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter your number : ");
		int n = kb.nextInt();
		int i,sum=1;
		
		if (n<0) {
			System.out.println("Number should be non-neegative");
		}else if(n==0) {
			
			System.out.println("=====================");
			System.out.println("Factorial of 0 is 1");
			
		} else{
			
			System.out.println("---------------------");
			System.out.println("Solution");
			System.out.print(n);
			
			for(i=n-1;i>=2;i--) {
			System.out.print(" * "+i);
			sum = sum*i;
			
		}
			
			System.out.println("= "+n*sum);
			System.out.println("=====================");
			System.out.println("Factorial of "+n+" is "+n*sum);
		}
	}

}
