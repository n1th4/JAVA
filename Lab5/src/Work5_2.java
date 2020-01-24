import java.util.*;
public class Work5_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter amount of number : ");
		int n = kb.nextInt();
		int i,j=0,k=0;
		int [] num = new int[n];
		
		for(i=0;i<n;i++) {
			System.out.print("Enter number "+(i+1)+" : ");
			num[i] = kb.nextInt();
			if(num[i]%2==0) {
				j++;
			}else {
				k++;
			}
		}
			System.out.println("");
			System.out.println("Total of Odd number is "+k);
			System.out.println("Total of Even number is "+j);
			System.out.println("");

		System.out.print("Odd number : ");
		for(i=0;i<n;i++) {
		  if(num[i]%2!=0) {
			  System.out.print(num[i]+"   ");
		  }
		}
		  System.out.print("\nEven number : ");
		  for(i=0;i<n;i++) {
			  if(num[i]%2==0) {
				  System.out.print(num[i]+"   ");
			  }
		}
		
	}

}
