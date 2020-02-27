package fmi.informatics.collections;

import java.util.HashSet;
import java.util.Set;

import fmi.informatics.extending.Student;

//���������� ��� �������� � ����� � ���������
public class TestSets {

	public static void main(String[] args) {
		testSets();
	}
	
	// �������� ������� ��� � ����������� ��������� �� 2 ��������� ������ � students
	public static void testSets() {
		Set<Student> students = new HashSet<>();
		Student student = Student.StudentGenerator.make();
		Student studentCopy = new Student(student.getName(), student.getEgn(), 
				student.getUniversity(), student.getSpeciality(), student.getFacNumber());
				
		students.add(student);
		students.add(studentCopy);
			
		System.out.println(students);
		System.out.println("Test equals method: " + student.equals(studentCopy));
	}
}
