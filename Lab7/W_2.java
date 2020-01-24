import java.util.*;
public class W_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Adjective : ");
		String adj = kb.nextLine();
		int len = adj.length();
		String adv;
		if(adj.endsWith("y")) {
			adv = adj.substring(0,len-1);
			System.out.println(adv+"ily");
		}else if(adj.endsWith("le")) {
			int s=adj.indexOf("le")-1;
			//System.out.println(s);
			if((adj.charAt(s)=='a')|(adj.charAt(s)=='e')|(adj.charAt(s)=='i')|(adj.charAt(s)=='o')|(adj.charAt(s)=='u')){
				System.out.println(adj+"ly");
			}else {
				adv = adj.substring(0,len-2);
				System.out.println(adv+"ly");
			}
		}else if(adj.endsWith("ic")) {
			System.out.println(adj+"ally");
		}else if(adj.endsWith("ue")) {
			adv = adj.substring(0,len-1);
			System.out.println(adv+"ly");
		}else {
			System.out.println(adj+"ly");
		}
		System.out.println("=====END====");

	}

}
