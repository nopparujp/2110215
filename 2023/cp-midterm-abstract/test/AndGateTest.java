import LogicGate.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AndGateTest {
	@Test
	void constructorTest1() {
		AndGate andGate = new AndGate(5, 6);
		assertEquals(5,andGate.getNumOfInput());
		assertEquals(6,andGate.getNumOfBit());
		assertEquals("000000", andGate.getData(0));
		assertEquals("000000", andGate.getData(1));
		assertEquals("000000", andGate.getData(2));
		assertEquals("000000", andGate.getData(3));
		assertEquals("000000", andGate.getData(4));
		assertEquals("000000", andGate.getOutput());
	}
	@Test
	void constructorTest2() {
		AndGate andGate = new AndGate(1, 2);
		assertEquals(2,andGate.getNumOfInput());
		assertEquals(2,andGate.getNumOfBit());
		assertEquals("00", andGate.getData(0));
		assertEquals("00", andGate.getData(1));
		assertEquals("00", andGate.getOutput());
	}
	@Test
	void getterSetterTest() {
		AndGate andGate = new AndGate(5, 10);
		andGate.setDatas(0, "1010010110");
		andGate.setDatas(1, "1010110101");
		andGate.setDatas(2, "0000011111");
		andGate.setDatas(3, "0010101100");
		andGate.setDatas(4, "1001001101");
		assertEquals("1010010110", andGate.getData(0));
		assertEquals("1010110101", andGate.getData(1));
		assertEquals("0000011111", andGate.getData(2));
		assertEquals("0010101100", andGate.getData(3));
		assertEquals("1001001101", andGate.getData(4));
		assertEquals("0000000000", andGate.getOutput());
	}

	@Test
	void setOutputTest(){
		AndGate andGate = new AndGate(5, 10);
		assertEquals("0000000000", andGate.getOutput());
		andGate.setOutput("1110001000");
		assertEquals("1110001000", andGate.getOutput());
		andGate.setOutput("1111111110");
		assertEquals("1111111110", andGate.getOutput());
	}

	@Test
	void setNumOfBitAndNumOfInoutTest(){
		AndGate andGate = new AndGate(5, 10);
		assertEquals(5,andGate.getNumOfInput());
		assertEquals(10, andGate.getNumOfBit());
		andGate.setNumOfBit(20);
		assertEquals(20, andGate.getNumOfBit());
		andGate.setNumOfInput(50);
		assertEquals(50,andGate.getNumOfInput());
		andGate.setNumOfBit(-20);
		assertEquals(1, andGate.getNumOfBit());
		andGate.setNumOfInput(-69);
		assertEquals(2,andGate.getNumOfInput());
	}

	@Test
	void isDataValidTest() {
		AndGate andGate = new AndGate(5, 5);
		assertFalse(andGate.isDataValid("12345"));
		assertFalse(andGate.isDataValid("100110101"));
		assertFalse(andGate.isDataValid("100"));
		assertTrue(andGate.isDataValid("10101"));
		assertTrue(andGate.isDataValid("11111"));
		assertTrue(andGate.isDataValid("00001"));
	}
	@Test
	void setDataTest() {
		AndGate andGate = new AndGate(5, 5);
		andGate.setDatas(0, "11111");
		andGate.setDatas(1, "01000");
		andGate.setDatas(2, "01010");
		andGate.setDatas(3, "01111");
		andGate.setDatas(4, "11001");
		
		assertEquals("11111", andGate.getData(0));
		assertEquals("01000", andGate.getData(1));
		assertEquals("01010", andGate.getData(2));
		assertEquals("01111", andGate.getData(3));
		assertEquals("11001", andGate.getData(4));
	}
	@Test
	void evaluateTest1() {
		AndGate andGate = new AndGate(5, 5);
		andGate.setDatas(0, "11111");
		andGate.setDatas(1, "01000");
		andGate.setDatas(2, "01010");
		andGate.setDatas(3, "01111");
		andGate.setDatas(4, "11001");
		assertEquals("01000",andGate.evaluate());
		assertEquals("01000",andGate.getOutput());
	}

	@Test
	void evaluateTest2() {
		AndGate andGate = new AndGate(5, 10);
		andGate.setDatas(0, "1010010110");
		andGate.setDatas(1, "1010110101");
		andGate.setDatas(2, "0000011111");
		andGate.setDatas(3, "0010101100");
		andGate.setDatas(4, "1001001101");
		assertEquals("0000000100",andGate.evaluate());
		assertEquals("0000000100",andGate.getOutput());
	}

	@Test
	void toStringTest(){
		String expected = "0 : 11111\n" +
				"1 : 00000\n" +
				"2 : 01010\n" +
				"3 : 10101\n" +
				"4 : 01011\n" +
				"result(AndGate) : 00000" ;
		AndGate andGate = new AndGate(5, 5);
		andGate.setDatas(0, "11111");
		andGate.setDatas(1, "00000");
		andGate.setDatas(2, "01010");
		andGate.setDatas(3, "10101");
		andGate.setDatas(4, "01011");
		andGate.evaluate();
		assertEquals(expected,andGate.toString());

	}


	

}
