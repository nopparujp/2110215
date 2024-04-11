package LogicGate;

public class AndGate extends BaseLogicGate {

    public AndGate(int NumOfInput, int NumOfBit) {
        super(NumOfInput, NumOfBit);
    }

    @Override
    public String evaluate() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.getNumOfBit(); i++) {
            boolean trig = true;
            for (int j = 0; j < this.getNumOfInput(); j++) {
                if (this.getData(j).charAt(i) == '0') {
                    result.append("0");
                    trig = false;
                    break;
                }
            }
            if (trig) {
                result.append("1");
            }
        }
        this.setOutput(result.toString());
        return result.toString();
    }
}
