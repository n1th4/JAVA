import java.util.*;
public class W_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double ans = 0;
		String data;
		do {	
		System.out.print("ข้อมูล : ");
		data = kb.nextLine();
		if( ((data.endsWith("r")==true)|(data.endsWith("R")==true))& ((data.indexOf("r")== (data.lastIndexOf("r"))&(data.indexOf("R")== (data.lastIndexOf("R")))))){
			
			data = data.replace("r","");
			data = data.replace("R","");
			double r = Double.parseDouble(data);
			System.out.format("พื้นที่วงกลม : %.2f\n",calculateRadius(r));
			
		}else if( ((data.endsWith("d")==true)|(data.endsWith("D")==true))& ((data.indexOf("d")== (data.lastIndexOf("d"))&(data.indexOf("D")== (data.lastIndexOf("D")))))){
			data = data.replace("d","");
			data = data.replace("D","");
			double d = Double.parseDouble(data);
			System.out.format("พื้นที่วงกลม : %.2f\n",calculateDiameter(d));
			
		}else if( ((data.endsWith("c")==true)|(data.endsWith("C")==true))& ((data.indexOf("c")== (data.lastIndexOf("c"))&(data.indexOf("C")== (data.lastIndexOf("C")))))){
			data = data.replace("c","");
			data = data.replace("C","");
			double c = Double.parseDouble(data);
			System.out.format("พื้นที่วงกลม : %.2f\n",calculateCircumference(c));
			
		}else if((data.startsWith("0")==true)){
			System.out.println("จบการทำงาน");
		}else {
			System.out.println("ข้อมูลไม่ถูกต้องกรุณากรอกข้อมูลใหม่");
		}
	}while(data.startsWith("0")!=true);
}
	

		
		static double calculateRadius(double r) {
			return Math.PI*(Math.pow(r, 2));
		}
		static double calculateDiameter(double d) {
			return Math.PI*(Math.pow((d/2), 2));
		}
		static double calculateCircumference(double c) {
			return Math.PI*Math.pow((c/(2*Math.PI)),2);
		}
}
			
		

	


