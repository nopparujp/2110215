package LogicGate;

public class Adder extends BaseLogicGate{//TODO : add something to this line
    private String c;
    private String outputC;

    public Adder(int numOfBit, String c) {
        super(numOfBit,numOfBit);
        this.c = c;
        this.outputC = "";
    }
    @Override
    public String evaluate() {
        // TODO Auto-generated method stub
        String result = "";
        String currentC = this.getC();
        XorGate halfAdder = new XorGate(3, 1);
        AndGate AB = new AndGate(2, 1);
        AndGate AC = new AndGate(2, 1);
        AndGate BC = new AndGate(2, 1);
        OrGate ABorACorBC =  new OrGate(3, 1);
        for(int i = this.getNumOfBit() - 1; i >= 0; i--) {
            // ansAdder = AxorBxorC

            halfAdder.setDatas(0, currentC);
            halfAdder.setDatas(1, this.getData(0).charAt(i) + "");
            halfAdder.setDatas(2, this.getData(1).charAt(i) + "");
            result = halfAdder.evaluate() + result;
            // newC = AB+AC+BC
            AB.setDatas(0, this.getData(0).charAt(i) + "");
            AB.setDatas(1, this.getData(1).charAt(i) + "");

            AC.setDatas(0, this.getData(0).charAt(i) + "");
            AC.setDatas(1, currentC);

            BC.setDatas(0, this.getData(1).charAt(i) + "");
            BC.setDatas(1, currentC);

            ABorACorBC.setDatas(0, AB.evaluate());
            ABorACorBC.setDatas(1, AC.evaluate());
            ABorACorBC.setDatas(2, BC.evaluate());

            currentC = ABorACorBC.evaluate();
        }
        this.setOutput(result);
        this.setOutputC(currentC);
        return result;
    }
    public String getC() {
        return c;
    }
    public void setC(String c) {
        if (c.equals("0") || c.equals("1")) {
            this.c = c;
        }
    }
    public String getOutputC() {
        return outputC;
    }
    public void setOutputC(String outputC) {
        this.outputC = outputC;
    }

}

