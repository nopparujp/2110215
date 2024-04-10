package role.derived;

import game.logic.GameAction;
import game.object.Card;
import role.base.PreRoundActable;
import role.base.Role;

public class Master extends Role implements PreRoundActable{

	@Override
	public void preRoundActs(GameAction action) {
		for (int i = 0 ; i < action.length;i++) {
			Card c = (Card) action.getInfo().get(i);
			c.setSlot(i);
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Master";
	}

}
