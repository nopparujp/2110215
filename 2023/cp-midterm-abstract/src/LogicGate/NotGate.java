package LogicGate;

public class NotGate extends BaseLogicGate {
    public NotGate(int numOfBit) {
        super(1, numOfBit);
    }

    @Override
    public String evaluate() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.getNumOfBit(); i++) {
            if (this.getData(0).charAt(i) == '1') {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        this.setOutput(result.toString());
        return result.toString();
    }
}