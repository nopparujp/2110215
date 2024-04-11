package LogicGate;

import Utils.FormatString;

import java.util.ArrayList;

public abstract class BaseLogicGate {
    private int numOfInput;
    private int numOfBit;
    private final ArrayList<String> datas;
    private String output;

    public BaseLogicGate(int numOfInput, int numOfBit) {
        setNumOfInput(numOfInput);
        setNumOfBit(numOfBit);
        setOutput("0".repeat(getNumOfBit()));
        datas = new ArrayList<>();
        for (int i = 0; i < getNumOfInput(); i++) {
            datas.add("0".repeat(getNumOfBit()));
        }
    }

    public int getNumOfInput() {
        return numOfInput;
    }

    public void setNumOfInput(int numOfInput) {
        if (this instanceof NotGate) {
            this.numOfInput = 1;
        } else {
            this.numOfInput = Math.max(2, numOfInput);
        }
    }

    public int getNumOfBit() {
        return numOfBit;
    }

    public void setNumOfBit(int numOfBit) {
        this.numOfBit = Math.max(1, numOfBit);
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return FormatString.toString(this);
    }

    public abstract String evaluate();

    public boolean isDataValid(String data) {
        if (data.length() != getNumOfBit()) {
            return false;
        }
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) != '1' && data.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public String getData(int n) {
        return datas.get(n);
    }

    public void setDatas(int n, String data) {
        if (isDataValid(data) && n < datas.size() && n >= 0) {
            datas.set(n, data);
        }
    }

}
