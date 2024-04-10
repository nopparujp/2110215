package logic.card;

import logic.game.*;

public class NumberCard extends BaseCard {
	public NumberCard(CardColor color, CardSymbol symbol) {
		super(color);
		super.setSymbol(symbol);
	}

	public void play() {
		if (ruleCheck()) {
			GameLogic.getInstance().setTopCard(this);
		}
	}

	public boolean ruleCheck() {
		BaseCard card =  GameLogic.getInstance().getTopCard();
		if (card.getColor().equals(this.getColor()) || card.getSymbol().equals(this.getSymbol())) {
			return true;
		}
		return false;
	}

}
