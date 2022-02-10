package N1_Ex3_test;
import org.junit.Test;

import N1_Ex3.ClassWithException;

public class ClassWithExceptionTest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testExcepcion() {
		ClassWithException my_ClassWithException = new ClassWithException();
		my_ClassWithException.sendException();		
	}
}
