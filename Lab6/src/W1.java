import java.util.*;
public class W1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�ӹǹ����� : ");
		int n = kb.nextInt();
		int i=0,j;
		String[] name = new String[n];
		String[] tel = new String[n];
		String tel1 = "-";
		for(i=0;i<n;i++) {
			System.out.println("����餹���"+(i+1));
			System.out.print("����-ʡ��:");
			name[i] = kb.next();
			do {
			System.out.print("�����Ţ���Ѿ�� :");
			tel[i] = kb.next();
			for(j=0;j<tel[i].length();j++) {
			boolean t = Character.isDigit(tel[i].charAt(j));
			tel[i]= tel[i].replace("-", "");
			//System.out.println(t);
			}
			if((tel[i].startsWith("08")==false)&&(tel[i].startsWith("09")==false)||(tel[i].length()!=10)) {
				System.out.println("�����Ţ���Ѿ���ͧ��鹵鹴��� 08 ���� 09 ��е�ͧ�ըӹǹ 10 ��ҹ��!!");
			}
			}while((tel[i].startsWith("08")==false)&&(tel[i].startsWith("09")==false)||(tel[i].length()!=10));
		}
		for(i=0;i<n;i++) {
		
		}
		
		System.out.println("�ѹ�֡�����������!!");
		System.out.println("******************************");
		for(i=0;i<n;i++) {
			
			System.out.println((i+1)+"."+name[i]+"\t"+tel[i]);
		}
		
	}

}
