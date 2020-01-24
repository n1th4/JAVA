import java.io.*;
import java.util.*;
public class W_2 {

	public static void main(String[] args) throws IOException{
		Scanner read = new Scanner(new File("input.txt"));
		int num;
		
		while(read.hasNext()) {
			num = read.nextInt();
			System.out.println(Factorial(num));
			if(Factorial(num)==0) {
				System.out.println("หาค่าไม่ได้");
			}
			
			
		}
	}
		static int Factorial(int num) {
			if(num<0) {
				return 0;
			}else {
				int sum=1;
				for(int i=num;num>0;num--) {
				sum=sum*num;
				}
				return sum;
			}
			
		}

}
