package role.derived;

import game.logic.GameAction;
import game.logic.GameLogic;
import game.object.Card;
import role.base.PreTurnActable;
import role.base.Role;

public class Seer extends Role implements PreTurnActable{

	@Override
	public void preTurnActs(GameAction action) {
//			Card c1 = (Card)action.getInfo().get(1);
//			Card c2 = (Card)action.getInfo().get(2);
			GameLogic.getInstance().getCurrentRound().swapCards((Card)(action.getInfo((0))),(Card) (action.getInfo(1)));
//		for (int i = 0 ; i < 2; i++) {
//			Card c = (Card)action.getInfo().get(i);
//		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Seer";
	}

}
