package application;

import LogicGate.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {//AOI mayBe
		System.out.println("──────────────┍───────────────┯───────────────┐");
		System.out.println("       ───────│               │               │");
		System.out.println("    ──────────│               │               │");
		System.out.println("  ────────────│      And      │               │");
		System.out.println("    ──────────│               │               │");
		System.out.println("──────────────│               │               │");
		System.out.println("	   ───────┣───────────────┫               │");
		System.out.println("	   ───────│               │               │");
		System.out.println("	   ───────│               │               │");
		System.out.println("	   ───────│      And      │       Or      │○──────────────");
		System.out.println("    ──────────│               │               │");
		System.out.println("──────────────│               │               │");
		System.out.println("	   ───────┣───────────────┫               │");
		System.out.println("	   ───────│               │               │");
		System.out.println("	   ───────│               │               │");
		System.out.println("	   ───────│      And      │               │");
		System.out.println("    ──────────│               │               │");
		System.out.println("──────────────│               │               │");
		System.out.println("	   ───────┕───────────────┵───────────────┚");

		Scanner sc = new Scanner(System.in);
		ArrayList<AndGate> inpOfOrGate = new ArrayList();
		System.out.println("Hellooooo");
		System.out.println("Welcome to AOI calculator!!!!!");
		System.out.println("-----------------------------------");
		System.out.print("How many bits each input :");
		int nOfBit = sc.nextInt();
		System.out.print("How many AND Gate in this AOI : ");
		int nOfAndGate = sc.nextInt();
		for(int n=0;n<nOfAndGate;n++){
			System.out.println("How many input of "+n+" AndGate ?");
			int nOfInput =sc.nextInt();

			AndGate andGate = new AndGate(nOfInput,nOfBit);
			for(int i=0;i<andGate.getNumOfInput();i++){
				System.out.println(i+" input of "+n+" AND gate");
				String inp = sc.next();
				while(!andGate.isDataValid(inp)){
					System.out.println("invalid input! try again");
					System.out.println(i+" input of "+n+" AND gate");
					inp=sc.next();
				}
				andGate.setDatas(i,inp);
			}
			System.out.println(andGate.toString());
			inpOfOrGate.add(andGate);


		}
		OrGate or =  new OrGate(inpOfOrGate.size(),inpOfOrGate.get(0).getOutput().length());
		for(int i=0;i<inpOfOrGate.size();i++){
			or.setDatas(i,inpOfOrGate.get(i).getOutput());
		}
		System.out.println(or.toString());
		NotGate nott = new NotGate(or.getOutput().length());
		nott.setDatas(0,or.getOutput());
		System.out.println(nott.toString());
	}

}

