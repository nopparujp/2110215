package logic.card;

import logic.game.*;

public class DrawTwoCard extends BaseCard {

	public DrawTwoCard(CardColor color) {
		super(color);
		setSymbol(CardSymbol.DRAW);
	}

	@Override
	public void play() {
		GameLogic.getInstance().setTopCard(this);
		GameLogic.getInstance().draw(2);
	}

	@Override
	public boolean ruleCheck() {
		BaseCard top = GameLogic.getInstance().getTopCard();
		if (this.getColor().equals(top.getColor())) {
		return true;
		}
		return false;
	}
}
