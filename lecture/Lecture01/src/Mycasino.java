//import casino.*;
//import java.awt.Point;

public class Mycasino {
	public static void main(String[] args) {
		SimpleDice diceA = new SimpleDice(1);
		SimpleDice diceB = new SimpleDice(1);
		//SimpleDice diceB = diceA;
		//diceA.faceValue = 6;
		/*
		diceA.count++;
		System.out.println(diceA.faceValue);
		diceB.count++;
		System.out.println(diceB.faceValue);
		SimpleDice.count++;
		System.out.println(SimpleDice.count);
		System.out.println(SimpleDice.MAX);
		*/
		//Point p1 = new Point(1,2);
		System.out.println(diceA);
		System.out.println(diceA.toString());
		System.out.println(diceA == diceB);
		System.out.println(diceA.equals(diceB));
		
	}

}
