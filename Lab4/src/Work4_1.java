import java.util.*;
public class Work4_1 {

	public static void main(String[] args) {
		int n;
		double MBI;
		Scanner kb = new Scanner (System.in);
		System.out.println("****Program caculate BMI****");
		
		do {
		System.out.print("Weight(kg) : ");
		double w =kb.nextDouble();
		System.out.print("Height(m) : ");
		double h = kb.nextDouble();
		
		MBI = w/(Math.pow(h, 2));
			if(MBI>39.9) {
				System.out.println("Your status is Obesity max");
			}else if(MBI>=34.9) {
				System.out.println("Your status is Obesity2");
			}else if(MBI>=28.4) {
				System.out.println("Your status is Obesity1");
			}else if(MBI>=23.4) {
				System.out.println("Your status is Overweight");
			}else if(MBI>=18.5) {
				System.out.println("Your status is Normal weight");
			}else if(MBI<18.5) {
				System.out.println("Your status is Underweight");
			}
		
		System.out.print("***if you want to calculate BMI,press 1 : ");
		 n = kb.nextInt();	
		 	
		}while(n==1);
		System.out.println("Thank you");
	}

}
