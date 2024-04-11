import LogicGate.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolyMorphismTest {

    @Test
    void testPoly(){
        ArrayList<BaseLogicGate> a = new ArrayList<BaseLogicGate>();
        AndGate g1 = new AndGate(2,2);
        OrGate g2 = new OrGate(2,3);
        NotGate g3 = new NotGate(3);
        XorGate g4 = new XorGate(3,3);

        g1.setDatas(0,"01");
        g1.setDatas(1,"11");

        g2.setDatas(0,"010");
        g2.setDatas(1,"110");

        g3.setDatas(0,"010");

        g4.setDatas(0,"010");
        g4.setDatas(1,"111");
        g4.setDatas(2,"110");

        a.add(g1);
        a.add(g2);
        a.add(g3);
        a.add(g4);

        assertEquals("01",a.get(0).evaluate());
        assertEquals("110",a.get(1).evaluate());
        assertEquals("101",a.get(2).evaluate());
        assertEquals("011",a.get(3).evaluate());

    }




}
