package oop;
import java.util.Scanner;
public class StudentGrade {
	public static void main(String[] args) {
		Student [] students = new Student[5]; 
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++) {
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			students[i] = new Student ( name , grade);
		}
		displayStudentsEligible(students);
		
	}
	public static void displayStudentsEligible ( Student students[]) {
		
		for(Student s : students) {
			if(isStudentEligible(s)) {
				System.out.println(s.getName());
			}
		}
	}
	public static boolean isStudentEligible (Student student) {
		return student.getGrade() > 5.50;
	}
}
