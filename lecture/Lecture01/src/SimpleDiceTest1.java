public class SimpleDiceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDice diceA = new SimpleDice(1);
		SimpleDice diceB = new SimpleDice(5);
		System.out.println("Initialize the dices");
		System.out.println(diceA.getFaceValue());
		System.out.println(diceB.getFaceValue());
				
		diceA.roll();
		diceB.roll();
		System.out.println("After roll the dices");
		System.out.println(diceA.getFaceValue());
		System.out.println(diceB.getFaceValue());
	}

}
