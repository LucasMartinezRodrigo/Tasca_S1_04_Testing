package org.itacademy.javatesting.junit.N1_Ex1;

import java.util.ArrayList;
import org.junit.Assert;

public class MonthFillerTest {

	public void fillMonths() {
		MonthFiller my_MonthFillerTest = new MonthFiller();
        ArrayList<String> months = my_MonthFillerTest.fillMonths();
        Assert.assertEquals(12, months.size());
        Assert.assertEquals("Agost", months.get(7));
	}
}
