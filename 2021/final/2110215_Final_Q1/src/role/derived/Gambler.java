package role.derived;

import game.logic.GameAction;
import game.object.Player;
import role.base.Role;
import role.base.*;

public class Gambler extends Role implements PreTurnActable,PreRoundActable{
    @Override
    public String toString() {
        return "Gambler";
    }

    @Override
    public void preRoundActs(GameAction action) {
        for (int i = 0 ; i < action.getInfo().size();i++){
    		Player tmp = (Player) action.getInfo().get(i);
    		tmp.setOrder(i);
        }

    }

    @Override
    public void preTurnActs(GameAction action) {
    	for (int i =0 ; i <2;i++) {
    		Player tmp = (Player) action.getInfo(i);
    		tmp.setToBeSwapped(true);
//    		Player tmp = (Player) action.getInfo().get(i);
//    		((Player)action.getInfo().get(i)).setToBeSwapped(true);
    	}

    }
}
