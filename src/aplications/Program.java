package aplications;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("STUDENT NAME: ");
		student.name = sc.nextLine();
		System.out.print("GRADE 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("GRADE 2: ");
		student.grade2 = sc.nextDouble();
		System.out.print("GRADE 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("STUDENT: %s%n", student.name);
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));
		System.out.println();
		
		if (student.finalGrade() >= 60) {
			System.out.println("PASS");
		} 
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
		
		sc.close();

	}

}
