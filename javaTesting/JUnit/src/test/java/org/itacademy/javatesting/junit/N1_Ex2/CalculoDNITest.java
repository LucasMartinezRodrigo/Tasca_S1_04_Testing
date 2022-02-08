package org.itacademy.javatesting.junit.N1_Ex2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculoDNITest {

	@Parameters
	public static Iterable<Object> getData(){
		List<Object> o = new ArrayList<>();
		o.add(new Object[] {31259310, 'X'});
		o.add(new Object[] {52338705, 'C'});
		o.add(new Object[] {31716866, 'G'});
		o.add(new Object[] {15444007, 'J'});
		o.add(new Object[] {24343653, 'Q'});
		o.add(new Object[] {31716866, 'G'});	
		o.add(new Object[] {48890447, 'Z'});
		o.add(new Object[] {31670355, 'E'});
		o.add(new Object[] {79250183, 'W'});	
		o.add(new Object[] {52333979, 'D'});
		
		return o;
	}
	
	private int num;
	private char expectedAlpha;
	
	public void CalculoDniTest(int num, char expectedAlpha) {
		this.num = num;
		this.expectedAlpha = expectedAlpha;
	}
	
	@Test
	public void testLetraDni() {
		CalculoDni my_CalculoDni = new CalculoDni();
		char alpha = my_CalculoDni.calculaLletra(this.num);
		assertEquals(this.expectedAlpha, alpha);
	}	
}
