package fmi.informatics.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
		testListInterface();
		testSetInterface();
		testArraySort();
	}
	
	// ������ �� ArrayList
	public static void testListInterface() {
		List<String> foodList = new ArrayList<>();
		
		if (foodList.isEmpty()) {
			System.out.println("�������� � ������!");
		}
		
		foodList.add("Pizza");
		
		// �������� � ���������� �� ��������� ������
		String pizza = new String("Pizza");
		foodList.add(pizza);
		foodList.add(pizza);
		
		System.out.println("--- ���� ���������� �� ������ ���� ---");
		System.out.println(foodList);
		
		// �������� � ���������� �� ������� �� ���������� �������
		foodList.add(2, "Salad");
		foodList.add("Spagetti");
		
		System.out.println("--- ���� ���������� �� ������� �� ��������� ������� ---");
		System.out.println(foodList);
		
		System.out.println("--- ���� ������������ �� ������ ������� ---");
		foodList.remove(0);
		System.out.println(foodList);
		
		if (!foodList.contains(pizza)) {
			System.out.println("���� ���� � ������� � �����");
		}
		
		ArrayList<String> newList = new ArrayList<>();
		newList.add(new String("Apple"));
		newList.add(new String("Pear"));
		
		System.out.println("--- ���� �������� �� ���� �������� ---");
		foodList.addAll(newList);
		System.out.println(foodList);
	}
	
	// ������ �� HashSet
	public static void testSetInterface() {
		Set<String> foodSet = new HashSet<>();
		foodSet.add("Pizza");
		foodSet.add("Spagetti");
		foodSet.add("Soup");
		foodSet.add("Brocolli");
		foodSet.add("Apple");
		System.out.println("Set: " + foodSet);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.addAll(foodSet);
		System.out.println("TreeSet: " + treeSet);
	}
	
	// ������ �� ��������� �� ��������
	public static void testArraySort() {
		Integer i = 5;
		int j = i;
		i = j + 1;
		j = i.intValue(); // ����� unbox-����: �� Integer -> int
		i = new Integer(7); // ����� box-����: �� int -> Integer
		
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(500);
		integers.add(70);
		
		integers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if (a < b) {
					return -1;
				}
		
				return (a > b ? 1 : 0);
			}
		});
		
		System.out.println("�������� ������: " + integers);
	}
}
