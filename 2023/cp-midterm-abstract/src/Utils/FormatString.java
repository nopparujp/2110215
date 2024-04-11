package Utils;

import LogicGate.BaseLogicGate;

public class FormatString {
    public static String toString(BaseLogicGate gate) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < gate.getNumOfInput(); i++) {
            result.append(i).append(" : ");
            result.append(gate.getData(i));
            result.append("\n");
        }
        result.append("result(").append(gate.getClass().getSimpleName()).append(")").append(" : ").append(gate.evaluate());
        return result.toString();
    }
}