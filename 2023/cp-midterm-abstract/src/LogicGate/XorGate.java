package LogicGate;

public class XorGate extends BaseLogicGate {
    public XorGate(int numOfInput, int numOfBit) {
        super(numOfInput, numOfBit);
    }

    @Override
    public String evaluate() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.getNumOfBit(); i++) {
            int count1 = 0;
            for (int j = 0; j < this.getNumOfInput(); j++) {
                if (this.getData(j).charAt(i) == '1') {
                    count1++;
                }
            }
            if (count1 % 2 == 0) {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        this.setOutput(result.toString());
        return result.toString();
    }
}
