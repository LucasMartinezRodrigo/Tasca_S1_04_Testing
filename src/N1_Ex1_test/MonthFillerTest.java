package N1_Ex1_test;

import java.util.ArrayList;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

import N1_Ex1.MonthFiller;

public class MonthFillerTest {
	@Test
	void fillMonths() {
		MonthFiller my_MonthFillerTest = new MonthFiller();
        ArrayList<String> months = my_MonthFillerTest.fillMonths();
        Assert.assertEquals(12, months.size());
        Assert.assertEquals("Agost", months.get(7));
	}
}