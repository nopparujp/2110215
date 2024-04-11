import LogicGate.Adder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTest {
    @Test
    void constructorTest(){
        Adder add = new Adder(5,"0");
        assertEquals("00000",add.getData(0));
        assertEquals("00000",add.getData(1));
        assertEquals("0",add.getC());

        Adder add2 = new Adder(5,"1");
        add2.setDatas(0,"10101");
        add2.setDatas(1,"01000");
        assertEquals("10101",add2.getData(0));
        assertEquals("01000",add2.getData(1));
        assertEquals("1",add2.getC());
    }

    @Test
    void getterSetterTest() {
        Adder add = new Adder( 10,"0");
        add.setDatas(0, "1010010110");
        add.setDatas(1, "1010110101");
        assertEquals("1010010110", add.getData(0));
        assertEquals("1010110101", add.getData(1));

    }
    @Test
    void evaluateTest1() {
        Adder add = new Adder(5,"0");
        add.setDatas(0,"00000");
        add.setDatas(1,"11111");
        assertEquals("11111",add.evaluate());
        assertEquals("11111",add.getOutput());
        assertEquals("0",add.getOutputC());
    }

    @Test
    void evaluateTest2() {
        Adder add = new Adder(5,"1");
        add.setDatas(0,"00000");
        add.setDatas(1,"11111");
        assertEquals("00000",add.evaluate());
        assertEquals("00000",add.getOutput());
        assertEquals("1",add.getOutputC());
    }

    @Test
    void evaluateTest3() {
        Adder add = new Adder(10,"0");
        add.setDatas(0,"0110001011");
        add.setDatas(1,"0001011101");
        assertEquals("0111101000",add.evaluate());
        assertEquals("0111101000",add.getOutput());
        assertEquals("0",add.getOutputC());

    }

    @Test
    void evaluateTest4() {
        Adder add = new Adder(10,"1");
        add.setDatas(0,"0110001011");
        add.setDatas(1,"0001011101");
        assertEquals("0111101001",add.evaluate());
        assertEquals("0111101001",add.getOutput());
        assertEquals("0",add.getOutputC());

    }
}
