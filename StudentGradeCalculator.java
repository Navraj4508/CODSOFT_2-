package StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
	
	static int validMarks(Scanner sc) {
		int marks;
		do {
			marks = sc.nextInt();
			if(marks<0 || marks>100) {
				System.out.println("Invalid! Please enter a value 0 to 100!");
			}
		}while(marks<0 || marks>100);
		return marks;
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Marks obtained in each subject
		System.out.println("Enter marks for Science (out of 100): ");
		int Science = validMarks(sc);
		System.out.println("Enter marks for Mathematics (out of 100): ");
		int Mathematics = validMarks(sc);
		System.out.println("Enter marks for English (out of 100): ");
		int English = validMarks(sc);
		System.out.println("Enter marks for Hindi (out of 100): ");
		int Hindi = validMarks(sc);
		System.out.println("Enter marks for SocialScience (out of 100): ");
		int SocialScience = validMarks(sc);
		
		
		if(Science <= 33) {
			System.out.println("fail! in science!");
		}if(Mathematics <= 33) {
			System.out.println("fail! in Mathematices!");
		}if(English <= 33) {
			System.out.println("fail! in English!");
		}if(Hindi <= 33) {
			System.out.println("fail! in Hindi!");
		}if(SocialScience <= 33) {
			System.out.println("fail! in SocialScience!");
		}
		
		
		float Total_Marks = 500;
		float Totalobtained_Marks = (Science + Mathematics+English + Hindi + SocialScience);
		double avg_Marks = Totalobtained_Marks/Total_Marks;
		
		double percentage = avg_Marks*100;
		System.out.println(Totalobtained_Marks);
		System.out.println(avg_Marks);
		System.out.println(percentage);
		
		if(percentage>=80) {
			System.out.println("A");
		}else if(percentage>=60) {
			System.out.println("B");
		}else if(percentage>=45) {
			System.out.println("C");
		}else if(percentage>=33) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		if(percentage>=33) {
			System.out.println("You are pass!");
		}else {
			System.out.println("You are fail!");
		}
	}

}

