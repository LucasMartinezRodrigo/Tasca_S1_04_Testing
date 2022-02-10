package N1_Ex2_test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import N1_Ex2.CalculoDni;

@RunWith(value = Parameterized.class)
public class CalculoDniTest {

	@Parameters
	public static Iterable<Object> getData(){
		List<Object> o = new ArrayList<>();
		o.add(new Object[] {49457267, 'E'});
		o.add(new Object[] {33015408, 'N'});
		o.add(new Object[] {91095428, 'H'});	
		o.add(new Object[] {24343653, 'Q'});	
		o.add(new Object[] {31255346, 'W'});
		o.add(new Object[] {14690202, 'X'});
		o.add(new Object[] {12345678, 'Z'});
		o.add(new Object[] {19504813, 'P'});
		o.add(new Object[] {87009119, 'G'});
		o.add(new Object[] {46702249, 'J'});	
		return o;
	}
	
	private int num;
	private char alpha;
	
	public CalculoDniTest(int num, char alpha) {
		this.num = num;
		this.alpha = alpha;
	}
	
	@Test
	public void testLetraDni() {
		CalculoDni my_CalculoDni = new CalculoDni(this.num);
		char alpha = my_CalculoDni.calculaLletra();
		assertEquals(this.alpha, alpha);
	}
}