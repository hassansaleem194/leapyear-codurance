import org.codurance.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

	@Test
	public void
	should_return_false_given_1994() {
		assertEquals(false, LeapYear.validate(1997));
	}

	@Test
	public void
	should_return_false_given_1800() {
		assertEquals(false, LeapYear.validate(1800));
	}

	@Test
	public void
	should_return_true_given_1996() {
		assertEquals(true, LeapYear.validate(1996));
	}
}