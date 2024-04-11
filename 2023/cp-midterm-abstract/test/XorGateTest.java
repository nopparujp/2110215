import LogicGate.AndGate;
import LogicGate.OrGate;
import LogicGate.XorGate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class XorGateTest {
    @Test
    void constructorTest1() {
        XorGate xorGate = new XorGate(5, 6);
        assertEquals(5,xorGate.getNumOfInput());
        assertEquals(6,xorGate.getNumOfBit());
        assertEquals("000000", xorGate.getData(0));
        assertEquals("000000", xorGate.getData(1));
        assertEquals("000000", xorGate.getData(2));
        assertEquals("000000", xorGate.getData(3));
        assertEquals("000000", xorGate.getData(4));
        assertEquals("000000", xorGate.getOutput());
    }

    @Test
    void constructorTest2() {
        XorGate xorGate = new XorGate(0, 0);
        assertEquals(2,xorGate.getNumOfInput());
        assertEquals(1,xorGate.getNumOfBit());
        assertEquals("0", xorGate.getData(0));
        assertEquals("0", xorGate.getData(1));
        assertEquals("0", xorGate.getOutput());
    }

    @Test
    void getterSetterTest() {
        XorGate xorGate = new XorGate(5, 10);
        xorGate.setDatas(0, "1010010110");
        xorGate.setDatas(1, "1010110101");
        xorGate.setDatas(2, "0000011111");
        xorGate.setDatas(3, "0010101100");
        xorGate.setDatas(4, "1001001101");
        assertEquals("1010010110", xorGate.getData(0));
        assertEquals("1010110101", xorGate.getData(1));
        assertEquals("0000011111", xorGate.getData(2));
        assertEquals("0010101100", xorGate.getData(3));
        assertEquals("1001001101", xorGate.getData(4));
    }

    @Test
    void setOutputTest(){
        XorGate xorGate = new XorGate(5, 10);
        assertEquals("0000000000", xorGate.getOutput());
        xorGate.setOutput("1110001011");
        assertEquals("1110001011", xorGate.getOutput());
        xorGate.setOutput("1000111110");
        assertEquals("1000111110", xorGate.getOutput());
    }

    @Test
    void setNumOfBitAndNumOfInoutTest(){
        XorGate xorGate = new XorGate(5, 10);
        assertEquals(5,xorGate.getNumOfInput());
        assertEquals(10, xorGate.getNumOfBit());
        xorGate.setNumOfBit(20);
        assertEquals(20, xorGate.getNumOfBit());
        xorGate.setNumOfInput(50);
        assertEquals(50,xorGate.getNumOfInput());
        xorGate.setNumOfBit(-20);
        assertEquals(1, xorGate.getNumOfBit());
        xorGate.setNumOfInput(-69);
        assertEquals(2,xorGate.getNumOfInput());
    }

    @Test
    void isDataValidTest() {
        XorGate xorGate = new XorGate(5, 5);
        assertFalse(xorGate.isDataValid("696969"));
        assertFalse(xorGate.isDataValid("11111122222121112"));
        assertFalse(xorGate.isDataValid("9696"));
        assertTrue(xorGate.isDataValid("11110"));
        assertTrue(xorGate.isDataValid("00011"));
        assertTrue(xorGate.isDataValid("01001"));
    }
    @Test
    void setDataTest() {
        XorGate xorGate = new XorGate(5, 5);
        xorGate.setDatas(0, "11111");
        xorGate.setDatas(1, "01000");
        xorGate.setDatas(2, "01010");
        xorGate.setDatas(3, "01111");
        xorGate.setDatas(4, "11001");

        assertEquals("11111", xorGate.getData(0));
        assertEquals("01000", xorGate.getData(1));
        assertEquals("01010", xorGate.getData(2));
        assertEquals("01111", xorGate.getData(3));
        assertEquals("11001", xorGate.getData(4));
    }
    @Test
    void evaluateTest1() {
        XorGate xorGate = new XorGate(5, 5);
        xorGate.setDatas(0, "01111");
        xorGate.setDatas(1, "01000");
        xorGate.setDatas(2, "01010");
        xorGate.setDatas(3, "01111");
        xorGate.setDatas(4, "01001");
        assertEquals("01011",xorGate.evaluate());
        assertEquals("01011",xorGate.getOutput());
    }

    @Test
    void evaluateTest2() {
        XorGate xorGate = new XorGate(5, 10);
        xorGate.setDatas(0, "1010010110");
        xorGate.setDatas(1, "1010110101");
        xorGate.setDatas(2, "0000011111");
        xorGate.setDatas(3, "0010101100");
        xorGate.setDatas(4, "1001001101");
        assertEquals("1011011101",xorGate.evaluate());
        assertEquals("1011011101",xorGate.getOutput());
    }

    @Test
    void toStringTest(){
        String expected = "0 : 1010010110\n" +
                "1 : 1010110101\n" +
                "2 : 0000011111\n" +
                "3 : 0010101100\n" +
                "4 : 1001001101\n" +
                "result(XorGate) : 1011011101" ;
        XorGate xorGate = new XorGate(5, 10);
        xorGate.setDatas(0, "1010010110");
        xorGate.setDatas(1, "1010110101");
        xorGate.setDatas(2, "0000011111");
        xorGate.setDatas(3, "0010101100");
        xorGate.setDatas(4, "1001001101");
        xorGate.evaluate();
        assertEquals(expected,xorGate.toString());
    }



}
