package LogicGate;

public class OrGate extends BaseLogicGate{
    public OrGate(int numOfInput, int numOfBit) {
        super(numOfInput, numOfBit);
    }

    @Override
    public String evaluate() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.getNumOfBit(); i++) {
            boolean trig = true;
            for (int j = 0; j < this.getNumOfInput(); j++) {
                if (this.getData(j).charAt(i) == '1') {
                    result.append("1");
                    trig = false;
                    break;
                }
            }
            if (trig) {
                result.append("0");
            }
        }
        this.setOutput(result.toString());
        return result.toString();
    }
}
