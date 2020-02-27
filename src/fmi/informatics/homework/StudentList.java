package fmi.informatics.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fmi.informatics.extending.Student;

public class StudentList {

	public static void main(String[] args) {
		createStudents();
	}
	
	public static void createStudents() {
		Scanner scanner = new Scanner(System.in);
		List<Student> randomStudents = 
				Arrays.asList(
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make(),
					Student.StudentGenerator.make()
				);
		System.out.println("UNORDERED LIST");
		randomStudents.forEach((s) -> System.out.println("Name: "+s.getName()+", Age: " + s.getAge()+", EGN: "
				+s.getEgn()+", University: "+ s.getUniversity()+", Speciality: " + s.getSpeciality()));
		
		System.out.println("\nPress 1 for ascending order or Press 2 for descending order: ");
		try {
			int input = scanner.nextInt();
			if(input==1) {
				System.out.println("\n\nASCENDING ORDER BY SPECIALITY");
				sortStudentsAscending(randomStudents);		
				randomStudents.forEach((s) -> System.out.println("Name: "+s.getName()+", Age: " + s.getAge()+", EGN: "
						+s.getEgn()+", University: "+ s.getUniversity()+", Speciality: " + s.getSpeciality()));

			}
			else if(input==2) {
				System.out.println("\n\nDESCENDING ORDER BY SPECIALITY");
				sortStudentsDescending(randomStudents);		
				randomStudents.forEach((s) -> System.out.println("Name: "+s.getName()+", Age: " + s.getAge()+", EGN: "
						+s.getEgn()+", University: "+ s.getUniversity()+", Speciality: " + s.getSpeciality()));
			}
			else {
				System.out.println("DEFAULT ORDER");
				randomStudents.forEach((s) -> System.out.println("Name: "+s.getName()+", Age: " + s.getAge()+", EGN: "
						+s.getEgn()+", University: "+ s.getUniversity()+", Speciality: " + s.getSpeciality()));
			}
		} catch (Exception e) {
			System.err.println("YOU HAVE TO CHOOSE A NUMBER!");
		}
			
		if(!(scanner.hasNext())) {
			scanner.close();
		}
	}
	
	public static void sortStudentsAscending(List<Student> randomStudents) {
		randomStudents.sort((a, b) -> {
			return a.getSpeciality().compareTo(b.getSpeciality());
		});
	}
	public static void sortStudentsDescending(List<Student> randomStudents) {
		randomStudents.sort((a, b) -> {
			return b.getSpeciality().compareTo(a.getSpeciality());
		});
	}
	
}
