package org.itacademy.javatesting.junit.N1_Ex3;

import org.junit.Test;

public class ClassWithExceptionTest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testExcepcion() {
		ClassWithException my_ClassWithException = new ClassWithException();
		my_ClassWithException.sendException();		
	}
}
