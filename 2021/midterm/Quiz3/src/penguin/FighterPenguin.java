package penguin;

public class FighterPenguin extends Penguin{
	private int pow;
	public FighterPenguin(String name, int hp,int pow, String catchphrase) {
		super(name, hp, catchphrase);
		setPow(pow);
	}
	public int getPow() {
		return pow;
	}
	public void setPow(int pow) {
		this.pow = Math.max(0, pow);
	}
	public int attack(Penguin target) {
		target.setHp(target.getHp() - pow);
		return pow;
	}
	public String toString() {
		return PenguinUtil.makeToString(this);
	}



}
