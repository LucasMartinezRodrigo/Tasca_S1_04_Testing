package org.itacademy.javatesting.junit.N1_Ex3;

public class Main {

	public static void main(String[] args) {
		Integer[] my_Integer = new Integer[2];
		try {
			System.out.println(my_Integer[2].intValue());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Message : " + e.getMessage());
			System.out.println("Class : " + e.getClass());
		}
	}
}
