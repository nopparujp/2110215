package penguin;

public class Penguin {
	private String name;
	private int hp;
	private int maxHp;
	private String catchphrase;
	public Penguin (String name ,int hp , String catchphrase) {
		this.name = name;
		if (hp < 0 )this.hp = 0;
		else this.hp = hp;
		this.maxHp = this.hp;
		this.catchphrase = catchphrase;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if (hp < 0)  this.hp = 0;
		else if (hp > this.maxHp) this.hp = this.maxHp;
		else this.hp = hp;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		if (maxHp < 0) this .maxHp  = 0;
		else this.maxHp = maxHp; 
	}
	public String getCatchphrase() {
		return catchphrase;
	}
	public void setCatchphrase(String catchphrase) {
		this.catchphrase = catchphrase;
	}
	public String toString() {
		return PenguinUtil.makeToString(this);
	}
	public String getSpeech() {
		return PenguinUtil.makeSpeech(this);
	}

}
