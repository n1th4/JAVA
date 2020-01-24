import java.util.*;
import java.text.*;
public class Work1_1 {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("#");
		double vat2,vat3=0;
		Scanner kb = new Scanner(System.in);
		System.out.println("****โปรแกรมคำนวณอัตราภาษีเงินได้****");
		System.out.print("กรุณาป้อนรายได้ต่อปี(บาท) : ");
		double income = kb.nextDouble();
		System.out.print("ภาษีหัก ณ ที่จ่ายไว้ (บาท)  : ");
		double vat = kb.nextDouble();
		
		 if(income>1000000) {
			vat2=income*(0.12); 
			vat3=vat2-vat;
		}else if(income>700000) {
			vat2=income*0.1; 
			vat3=vat2-vat;
		}else if(income>500000) {
			vat2=income*0.07; 
			vat3=vat2-vat;	
		}else if(income>200000) {
			vat2=income*0.05; 
			vat3=vat2-vat;
		}else{
			vat2=income*0; 
			vat3=0;
		}
	
		System.out.println("*************************");
		if(vat3>=0) {
			System.out.println("จ่ายเพิ่ม  "+f1.format(vat3)+" บาท");
		}else {
			vat3=vat3*(-1);
			System.out.println("ได้ภาษีคืน "+f1.format(vat3)+" บาท");
		}

	}

}
