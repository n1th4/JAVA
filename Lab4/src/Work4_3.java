import java.util.*;
public class Work4_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n;
		do {
			System.out.print("จำนวนชั้นของพีระมิด : ");
			n = kb.nextInt();
			if (n<2) {
				System.out.println("***กรุณากรอกจำนวนเต็มที่มากกว่าหนึ่ง");
			}
		}while(n<2);
		
		int i,j,k;

			for(i=0;i<n;i++) {
				for(j=0;j<(n-i)-1;j++) {
					System.out.print(" ");
				}	
				for(k=0;k<(i*2)+1;k++) {
					System.out.print("*");
					
				}	
			
				System.out.println("");
		}
	}

}
