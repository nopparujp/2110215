import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleDice4Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSimpleDice4Int() {
		//fail("Not yet implemented");
	}

	@Test
	void testSetFaceValue() {
		//fail("Not yet implemented");
		SimpleDice4 d = new SimpleDice4(1);
		d.setFaceValue(5);
		assertEquals(5,d.getFaceValue());
		//d.setFaceValue(-1);
		//assertEquals(1.d.getFaceValue());
	}

	@Test
	void testEqualsObject() {
		//fail("Not yet implemented");
	}

}
