import java.util.*;
public class Work5_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n,i;
		
		System.out.print("Enter number of student : ");
		n = kb.nextInt();
		int [] id = new int[n];
		double [] score = new double[n];
		
		for(i=0;i<n;i++) {
			System.out.println("=====Student "+(i+1)+"====");
			System.out.print("ID : ");
			id[i] = kb.nextInt();
			System.out.print("Score : ");
			score[i] = kb.nextDouble();
		}

		System.out.println("===Calculate Grade===");
		           
		for(i=0;i<n;i++) {
			System.out.print(id[i]+"     ");
			if(score[i]>100) {
				System.out.println("Error");
			}else if(score[i]>=80) {
				System.out.println("A");
			}else if(score[i]>=70) {
				System.out.println("B");
			}else if(score[i]>=60) {
				System.out.println("C");
			}else if(score[i]>=50) {
				System.out.println("D");
			}else if(score[i]>0) {
				System.out.println("F");
			}else {
				System.out.println("Error");
			}
		}
		System.out.println("======================");
		

	}

}
