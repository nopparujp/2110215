package logic.utility;

import logic.game.GameLogic;
import logic.card.*;
import java.util.ArrayList;

public class GameLogicUtility{
	public static boolean drawRule() {
		ArrayList<BaseCard> hand = GameLogic.getInstance().getHand();
		for (var card : hand) {
			if (card.ruleCheck()) {
				return false;
			}
		}
		return true;
		
	}

}
