import java.util.*;
public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double metre,inch,keub,sok,wa;
		System.out.print("������� (����) : ");
		metre = kb.nextDouble();
		System.out.println("\n********************************");
		wa=metre/2;
		sok=wa*4;
		keub=sok*2;
		inch=keub*12;
		System.out.println(metre+ " ����  ="+wa+" ��");
		System.out.println(wa+ " ��  ="+sok+" �͡");
		System.out.println(sok+ " �͡  ="+keub+" �׺");
		System.out.println(keub+ " �׺  ="+inch+" ����");
	}

}
