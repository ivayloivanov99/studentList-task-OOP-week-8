package fmi.informatics.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fmi.informatics.extending.Student;

public class SortingTest {
	List<Student> randomStudents = 
			Arrays.asList(
				new Student(),
				new Student()
			);
	
	public String sort(String one, String two) {
		randomStudents.get(0).setName("Ivan");
		randomStudents.get(1).setName("Dimitur");

		randomStudents.sort((a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		return randomStudents.get(0).getName()+randomStudents.get(1).getName();
	}

	@Test
	public void testSorting() {
		String result = sort(randomStudents.get(0).getName(), randomStudents.get(1).getName());
		String expectedResult = randomStudents.get(0).getName()+randomStudents.get(1).getName();

		assertEquals(expectedResult, result);
	}
	@Test
	public void testSorting2() {
		String result = sort(randomStudents.get(0).getName(), randomStudents.get(1).getName());
		String expectedResult = randomStudents.get(1).getName()+randomStudents.get(0).getName();

		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testSortingFailed() {
		fail("The test failed!");
	}
}
