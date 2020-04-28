package ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2%n", student.missingPoints());
		
		if (student.finalGrade() <60.0) {
			System.out.println("FAILED!");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		sc.close();
	}

}
