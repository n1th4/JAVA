import java.util.*;
public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String id;
		String name;
		String nickname;
		System.out.println("*********กรุณากรอกข้อมูล********");
		System.out.print("ชื่อ-นามสกุล : ");
		name = kb.nextLine();
		System.out.print("ชื่อเล่น : ");
		nickname = kb.nextLine();
		System.out.print("รหัสนักศึกษา: ");
		id = kb.nextLine();
		System.out.println("\n**************************");
		System.out.print("Hello! "+nickname+"\nคุณ"+name+" รหัส"+id+"\nนักศึกษาคณะวิทยาศาสตร์ มหาวิทยาลัยขอนแก่น");
		System.out.println("\n**************************");
		
	}

}
