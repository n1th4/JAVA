import java.util.*;
public class Work4_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n;
		do {
			System.out.print("�ӹǹ��鹢ͧ�����Դ : ");
			n = kb.nextInt();
			if (n<2) {
				System.out.println("***��سҡ�͡�ӹǹ�������ҡ����˹��");
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
