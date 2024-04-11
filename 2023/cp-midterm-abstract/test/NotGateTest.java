import LogicGate.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import LogicGate.AndGate;

class NotGateTest {

	@Test
	void constructorTest1() {
		NotGate notGate = new NotGate(6);
		assertEquals(1,notGate.getNumOfInput());
		assertEquals(6,notGate.getNumOfBit());
		assertEquals("000000", notGate.getData(0));
		assertEquals("000000", notGate.getOutput());
	}
	@Test
	void constructorTest2() {
		NotGate notGate = new NotGate(0);
		assertEquals(1,notGate.getNumOfInput());
		assertEquals(1,notGate.getNumOfBit());
		assertEquals("0", notGate.getData(0));
		assertEquals("0", notGate.getOutput());
	}
	@Test
	void getterSetterTest() {
		NotGate notGate = new NotGate(10);
		notGate.setDatas(0, "0010101100");
		assertEquals("0010101100", notGate.getData(0));
	}

	@Test
	void setOutputTest(){
		NotGate notGate = new NotGate(10);
		assertEquals("0000000000", notGate.getOutput());
		notGate.setOutput("1110001001");
		assertEquals("1110001001", notGate.getOutput());
		notGate.setOutput("1111101110");
		assertEquals("1111101110", notGate.getOutput());
	}

	@Test
	void setNumOfBitAndNumOfInoutTest(){
		NotGate notGate = new NotGate(10);
		assertEquals(1,notGate.getNumOfInput());
		assertEquals(10, notGate.getNumOfBit());
		notGate.setNumOfBit(20);
		assertEquals(20, notGate.getNumOfBit());
		notGate.setNumOfInput(50);
		assertEquals(1,notGate.getNumOfInput());
		notGate.setNumOfBit(-20);
		assertEquals(1, notGate.getNumOfBit());
		notGate.setNumOfInput(-69);
		assertEquals(1,notGate.getNumOfInput());
	}

	@Test
	void isDataValidTest() {
		NotGate notGate = new NotGate(5);
		assertFalse(notGate.isDataValid("12345"));
		assertFalse(notGate.isDataValid("100110101"));
		assertFalse(notGate.isDataValid("100"));
		assertTrue(notGate.isDataValid("10101"));
		assertTrue(notGate.isDataValid("11111"));
		assertTrue(notGate.isDataValid("00001"));
	}
	@Test
	void setDataTest() {
		NotGate notGate = new NotGate(5);
		notGate.setDatas(0, "01010");
		assertEquals("01010", notGate.getData(0));
	}
	@Test
	void evaluateTest1() {
		NotGate notGate = new NotGate(5);
		notGate.setDatas(0, "11111");
		assertEquals("00000",notGate.evaluate());
		assertEquals("00000",notGate.getOutput());
	}

	@Test
	void evaluateTest2() {
		NotGate notGate = new NotGate(10);
		notGate.setDatas(0, "0110101100");
		assertEquals("1001010011",notGate.evaluate());
		assertEquals("1001010011",notGate.getOutput());
	}

	@Test
	void toStringTest(){
		String expected = "0 : 1001010011\n" +
				"result(NotGate) : 0110101100" ;
		NotGate notGate = new NotGate( 10);
		notGate.setDatas(0, "1001010011");
		notGate.evaluate();
		assertEquals(expected,notGate.toString());
	}
}
