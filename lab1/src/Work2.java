import java.util.*;
public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double metre,inch,keub,sok,wa;
		System.out.print("ความยาว (เมตร) : ");
		metre = kb.nextDouble();
		System.out.println("\n********************************");
		wa=metre/2;
		sok=wa*4;
		keub=sok*2;
		inch=keub*12;
		System.out.println(metre+ " เมตร  ="+wa+" วา");
		System.out.println(wa+ " วา  ="+sok+" ศอก");
		System.out.println(sok+ " ศอก  ="+keub+" คืบ");
		System.out.println(keub+ " คืบ  ="+inch+" นิ้ว");
	}

}
