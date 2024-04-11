import LogicGate.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import LogicGate.AndGate;

class OrGateTest {

	@Test
	void constructorTest1() {
		OrGate orGate = new OrGate(5, 6);
		assertEquals(5,orGate.getNumOfInput());
		assertEquals(6,orGate.getNumOfBit());
		assertEquals("000000", orGate.getData(0));
		assertEquals("000000", orGate.getData(1));
		assertEquals("000000", orGate.getData(2));
		assertEquals("000000", orGate.getData(3));
		assertEquals("000000", orGate.getData(4));
		assertEquals("000000", orGate.getOutput());
	}
	@Test
	void constructorTest2() {
		OrGate orGate = new OrGate(1, 0);
		assertEquals(2,orGate.getNumOfInput());
		assertEquals(1,orGate.getNumOfBit());
		assertEquals("0", orGate.getData(0));
		assertEquals("0", orGate.getData(1));
		assertEquals("0", orGate.getOutput());
	}

	@Test
	void getterSetterTest() {
		OrGate orGate = new OrGate(5, 10);
		orGate.setDatas(0, "0010101100");
		orGate.setDatas(1, "1010010110");
		orGate.setDatas(2, "0000011111");
		orGate.setDatas(3, "1001001101");
		orGate.setDatas(4, "1010110101");
		assertEquals("0010101100", orGate.getData(0));
		assertEquals("1010010110", orGate.getData(1));
		assertEquals("0000011111", orGate.getData(2));
		assertEquals("1001001101", orGate.getData(3));
		assertEquals("1010110101", orGate.getData(4));
	}

	@Test
	void setOutputTest(){
		OrGate orGate = new OrGate(5, 10);
		assertEquals("0000000000", orGate.getOutput());
		orGate.setOutput("1110001000");
		assertEquals("1110001000", orGate.getOutput());
		orGate.setOutput("1111111110");
		assertEquals("1111111110", orGate.getOutput());
	}

	@Test
	void setNumOfBitAndNumOfInoutTest(){
		OrGate orGate = new OrGate(5, 10);
		assertEquals(5,orGate.getNumOfInput());
		assertEquals(10, orGate.getNumOfBit());
		orGate.setNumOfBit(20);
		assertEquals(20, orGate.getNumOfBit());
		orGate.setNumOfInput(50);
		assertEquals(50,orGate.getNumOfInput());
		orGate.setNumOfBit(-20);
		assertEquals(1, orGate.getNumOfBit());
		orGate.setNumOfInput(-69);
		assertEquals(2,orGate.getNumOfInput());
	}

	@Test
	void isDataValidTest() {
		OrGate orGate = new OrGate(5, 5);
		assertFalse(orGate.isDataValid("696969"));
		assertFalse(orGate.isDataValid("11111122222121112"));
		assertFalse(orGate.isDataValid("9696"));
		assertTrue(orGate.isDataValid("11110"));
		assertTrue(orGate.isDataValid("00011"));
		assertTrue(orGate.isDataValid("01001"));
	}
	@Test
	void setDataTest() {
		OrGate orGate = new OrGate(5, 5);
		orGate.setDatas(0, "11111");
		orGate.setDatas(1, "01000");
		orGate.setDatas(2, "01010");
		orGate.setDatas(3, "01111");
		orGate.setDatas(4, "11001");
		
		assertEquals("11111", orGate.getData(0));
		assertEquals("01000", orGate.getData(1));
		assertEquals("01010", orGate.getData(2));
		assertEquals("01111", orGate.getData(3));
		assertEquals("11001", orGate.getData(4));
	}
	@Test
	void evaluateTest1() {
		OrGate orGate = new OrGate(5, 5);
		orGate.setDatas(0, "01111");
		orGate.setDatas(1, "01000");
		orGate.setDatas(2, "01010");
		orGate.setDatas(3, "01111");
		orGate.setDatas(4, "01001");
		assertEquals("01111",orGate.evaluate());
		assertEquals("01111",orGate.getOutput());
	}

	@Test
	void evaluateTest2() {
		OrGate orGate = new OrGate(5, 10);
		orGate.setDatas(0, "1010010110");
		orGate.setDatas(1, "1010110101");
		orGate.setDatas(2, "0000011111");
		orGate.setDatas(3, "0010101100");
		orGate.setDatas(4, "1001001101");
		assertEquals("1011111111",orGate.evaluate());
		assertEquals("1011111111",orGate.getOutput());
	}

	@Test
	void toStringTest(){
		String expected = "0 : 1010010110\n" +
				"1 : 1010110101\n" +
				"2 : 0000011111\n" +
				"3 : 0010101100\n" +
				"4 : 1001001101\n" +
				"result(OrGate) : 1011111111" ;
		OrGate orGate = new OrGate(5, 10);
		orGate.setDatas(0, "1010010110");
		orGate.setDatas(1, "1010110101");
		orGate.setDatas(2, "0000011111");
		orGate.setDatas(3, "0010101100");
		orGate.setDatas(4, "1001001101");
		orGate.evaluate();
		assertEquals(expected,orGate.toString());
	}

}
