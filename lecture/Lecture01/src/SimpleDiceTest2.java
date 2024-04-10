public class SimpleDiceTest2 {

	public static void main(String[] args) {
		SimpleDice diceA = new SimpleDice(1);
		SimpleDice diceB;
		diceB = diceA;
		diceB.setFaceValue(5);
		System.out.println(diceA.getFaceValue());
	}

}
