package fmi.informatics.functional;

import java.util.Arrays;
import java.util.List;

import fmi.informatics.extending.Student;

public class TestLambdas {

	public static void main(String[] args) {
		testMySimpleInterface();
		testMySimpleInterface2();
		sortingWithLambdas();
	}
	
	// ����� ������ �� ������
	public static void testMySimpleInterface() {
		// ����������� ������ �� ������������ �� ���� ��������� � ����������� ������ helloWorld()
		MySimpleInterface ms = () -> System.out.println("Hello World!");
		ms.helloWorld();
		
		MySimpleInterface ms1 = new MySimpleInterface() {
			@Override
			public void helloWorld() {
				System.out.println("Hello World!");
			}
		};
		ms1.helloWorld();
		
		// ��������� testFunctional � ������ ���� ���������
		// ��������� ����� �� �����������, �� ��� ����� �� ���� �� �� ������ ���� ���� �����
		testFunctional(() -> {
			System.out.println("Testing 123");
			System.out.println("Testing 456");
		});
		// testFunctional(ms1);
	}
	
	// ��������� �� �����, ����� ������ ���� ��������� ������������� ���������
	public static void testFunctional(MySimpleInterface msi) {
		msi.helloWorld();
	}
	
	// ����� ������ �� ������
	public static void testMySimpleInterface2() {
		// �� � ���������� �������� �� ���� �� ����������� ��� ��������� ��������
		// ���� ���������� �� ������� � ����������� �� ������ � ����������
		testFunctional2((p1, p2) -> p1 + p2);
	}
	
	public static void testFunctional2(MySimpleInterface2 msi2) {
		String result = msi2.concatenate("Hello ", "world");
		System.out.println(result);
	}
	
	// ������ �� ��������� �� �������� �� ��� � ������ ����������
	public static void sortingWithLambdas() {
		List<Student> randomStudents = 
			Arrays.asList(
				Student.StudentGenerator.make(),
				Student.StudentGenerator.make(),
				Student.StudentGenerator.make()
			);
		
		randomStudents.sort((a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		
		System.out.println(randomStudents);
		
		// �������� �� ���������� �� ���
		randomStudents.forEach((s) -> System.out.println(s));
		randomStudents.forEach(System.out::println);
	}
}
