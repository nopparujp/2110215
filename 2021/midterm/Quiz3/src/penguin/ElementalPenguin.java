package penguin;

public class ElementalPenguin extends FighterPenguin {
	private PenguinType type;

	public ElementalPenguin(String name, int hp, int pow, PenguinType type, String catchphrase) {
		super(name, hp, pow, catchphrase);
		this.type = type;
	}

	public PenguinType getType() {
		return type;
	}

	public void setType(PenguinType type) {
		this.type = type;
	}

	public int getElementalAdvantage(Penguin target) {
		if (! (target instanceof ElementalPenguin)) {
			return 0;
		}
		ElementalPenguin a = (ElementalPenguin) target;
		PenguinType otherType = a.getType();
		if (type.equals(otherType))
			return 0;
		else if (type.equals(PenguinType.FIRE) && otherType.equals(PenguinType.SNOW))
			return 1;
		else if (type.equals(PenguinType.SNOW) && otherType.equals(PenguinType.WATER))
			return 1;
		else if (type.equals(PenguinType.WATER) && otherType.equals(PenguinType.FIRE))
			return 1;
		else if (type.equals(PenguinType.SNOW) && otherType.equals(PenguinType.FIRE))
			return -1;
		else if (type.equals(PenguinType.WATER) && otherType.equals(PenguinType.SNOW))
			return -1;
		else if (type.equals(PenguinType.FIRE) && otherType.equals(PenguinType.WATER))
			return -1;
		return 0;
	}

	public int attack(Penguin target) {
		int advantage = getElementalAdvantage(target);
		if (advantage == 1) {
			target.setHp(target.getHp() - 2 * getPow());
			return getPow() * 2;
		} else if (advantage == 0) {
			target.setHp(target.getHp() - getPow());
			return getPow();

		} else {
			int damage = getPow() / 2;
			target.setHp(target.getHp() - damage);
			return damage;
		}
	}
	public String toString() {
		return PenguinUtil.makeToString(this);
	}

}
