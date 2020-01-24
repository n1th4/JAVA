import java.util.*;
import java.io.*;
import java.text.*;
public class W_1 {

	public static void main(String[] args) throws  IOException{
		Scanner kb = new Scanner(System.in);
		Scanner read1 = new Scanner(new File("std1.txt"));
		Scanner read2 = new Scanner(new File("std2.txt"));
		PrintStream write1 = new PrintStream("gpa1.txt");
		PrintStream write2 = new PrintStream("gpa2.txt");
		DecimalFormat f = new DecimalFormat("0.00");
		String id = "";
		double mid = 0.0;
		double fin = 0.0;
		double score ;
		String gpa;
		int countA =0;
		int countF=0;
		System.out.print("Student ID:");
		String idd = kb.nextLine();
		char[] c= idd.toCharArray();
		int endid = c[10]%2;
		if(endid==0) {
		while(read1.hasNext()) {
			id = read1.next().substring(5);
			mid = read1.nextDouble();
			fin=read1.nextDouble();
			score = ((mid*0.45)+(fin*0.55));
			if(score>=80) {
				gpa ="A";
				countA++;
			}else if(score>=75) {
				gpa="B+";
			}else if(score>=70) {
				gpa="B";
			}else if(score>=65) {
				gpa="C+";
			}else if(score>=60) {
				gpa="C";
			}else if(score>=55) {
				gpa="D+";
			}else if(score>=50) {
				gpa="D";
			}else {
				gpa="F";
				countF++;
			}
			
			write1.println(id+"\t"+f.format(score)+"\t"+gpa);
			
		}
		read1.close();
		write1.close();
		}else {
			while(read2.hasNext()) {
				id = read2.next().substring(5);
				mid = read2.nextDouble();
				fin=read2.nextDouble();
				score = ((mid*0.45)+(fin*0.55));
				if(score>=80) {
					gpa ="A";
					countA++;
				}else if(score>=75) {
					gpa="B+";
				}else if(score>=70) {
					gpa="B";
				}else if(score>=65) {
					gpa="C+";
				}else if(score>=60) {
					gpa="C";
				}else if(score>=55) {
					gpa="D+";
				}else if(score>=50) {
					gpa="D";
				}else {
					gpa="F";
					countF++;
				}
				
				write2.println(id+"\t"+f.format(score)+"\t"+gpa);
				
			}
			read2.close();
			write2.close();
		}
		
		System.out.println("จำนวนนักศึกษาที่ได้เกรดA: "+countA);
		System.out.println("จำนวนนักศึกษาที่ได้เกรดA: "+countF);
	}
	
}
